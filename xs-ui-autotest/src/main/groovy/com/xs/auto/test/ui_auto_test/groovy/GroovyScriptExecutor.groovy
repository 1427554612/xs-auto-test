package com.xs.auto.test.ui_auto_test.groovy

import com.microsoft.playwright.Page
import com.xs.auto.test.ui_auto_test.entity.TestCase
import com.xs.auto.test.ui_auto_test.entity.TestCaseConfig
import com.xs.auto.test.ui_auto_test.vo.RunCaseVo
import com.xs.auto.test.web.websocket.WebSocketController
import org.codehaus.groovy.control.CompilerConfiguration
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.ApplicationContext

/**
 * 动态脚本解析核心
 */
class GroovyScriptExecutor {

    private GroovyClassLoader groovyClassLoader
    private ApplicationContext applicationContext
    private  LinkedHashMap<String,String> runPoMap
    private List<RunCaseVo> runCaseVoList
    private TestCase testCase;
    private TestCaseConfig testCaseConfig;
    private WebSocketController webSocketController;
    private String userName;
    private Logger logger = LoggerFactory.getLogger(GroovyScriptExecutor.class)

    /**
     * 无参构造，只是用动态编译器
     */
    GroovyScriptExecutor(){
        def config = new CompilerConfiguration()
        config.setTargetBytecode(CompilerConfiguration.JDK8)
        this.groovyClassLoader = new GroovyClassLoader(this.class.classLoader, config)
    }

    GroovyScriptExecutor(ApplicationContext applicationContext,
                         WebSocketController webSocketController,
                         LinkedHashMap < String, String > runPoMap,
                         List<RunCaseVo> runCaseVoList,
                         TestCase testCase,
                         TestCaseConfig testCaseConfig,
                         String userName) {
        this.applicationContext = applicationContext                 // springboot容器对象
        this.webSocketController = webSocketController;              // websocket端点对象
        this.runPoMap = runPoMap                                     // 数据库中存在的所有po累
        this.runCaseVoList = runCaseVoList                           // 批量执行用例列表
        this.testCase = testCase                                     // 测试用例对象
        this.testCaseConfig = testCaseConfig                         // 测试配置对象
        this.userName = userName                                     // websocket连接用户
        def config = new CompilerConfiguration()
        config.setTargetBytecode(CompilerConfiguration.JDK8)
        this.groovyClassLoader = new GroovyClassLoader(this.class.classLoader, config)
    }

    /**
     * 获取要执行的类的所有核心方法
     * @param testCase
     */
    def getClassMethods(TestCase testCase){
        def className = testCase.getClassName()
        def code = testCase.getCode()

        try {
            def methodNames = []
            def methodPattern = ~/(public|private|protected)?\s+(\w+)\s+(\w+)\s*\([^)]*\)\s*\{/
            def matcher = methodPattern.matcher(code)

            while (matcher.find()) {
                def methodName = matcher.group(3)
                // 过滤条件
                if (!methodName.startsWith("get") && !methodName.startsWith("set") &&
                        !methodName.equals(className)) {
                    methodNames.add(methodName)
                }
            }
            return methodNames
        } catch (Exception e) {
            WebSocketController.sendToClient(userName,"解析方法名失败:"+ e.getMessage())
            return []
        }
    }
    /**
     * 执行脚本
     * @param page
     * @return
     */
    def executeScripts(Page page) {
        WebSocketController.sendToClient(userName,"动态java解析工作开始执行......")
        // 定义脚本（简化版，不使用 @Autowired）
        def scripts =runPoMap
        // 编译并创建实例 - 使用同一个 groovyClassLoader
        def beans = [:]
        /**
         * 根据java脚本创建对象示例
         */
        scripts.each { className, script ->
            try {
                Class clazz = groovyClassLoader.parseClass(script, className)
                def bean = clazz.newInstance()

                // 手动注入 page 对象
                if (bean.hasProperty('page')) {
                    bean.page = page
                    WebSocketController.sendToClient(userName,"注入 Page 对象到" + className)
                }

                // 手动注入testcase对象
                if (bean.hasProperty('testcase')|| bean.hasProperty('testCase')){
                    bean.testCase = testCase
                    WebSocketController.sendToClient(userName,"注入 testCase 对象到" + className)

                }

                // 手动注入testcase对象
                if (bean.hasProperty('testCaseConfig')|| bean.hasProperty('TestCaseConfig')){
                    bean.testCaseConfig = testCaseConfig
                    WebSocketController.sendToClient(userName,"注入 testCaseConfig 对象到" + className)

                }

                if(bean.hasProperty("webSocketController") || bean.hasProperty("WebSocketController")){
                    bean.webSocketController = webSocketController
                    WebSocketController.sendToClient(userName,"注入 webSocketController 对象到" + className)

                }
                // 新增：注入 userName
                if(bean.hasProperty("userName") || bean.hasProperty("userName")){
                    bean.userName = userName
                    WebSocketController.sendToClient(userName,"注入 userName 对象到" + className)
                }
                beans[className] = bean
                WebSocketController.sendToClient(userName,"动态对象创建成功：" + className)
            } catch (Exception e) {
                WebSocketController.sendToClient(userName,"动态对象创建失败：" + className + "错误原因："  + e.getMessage())
                e.printStackTrace()
            }
        }

        /**
         * 获取实例化的对象注入依赖
         */
        // 动态设置依赖关系 - 支持从Spring容器获取依赖
        beans.each { beanName, bean ->
            def beanClass = bean.getClass()

            // 获取所有setter方法，过滤掉Groovy的内置方法
            def setters = beanClass.methods.findAll { method ->
                method.name.startsWith('set') &&
                        method.parameterCount == 1 &&
                        !method.name.startsWith('setMetaClass') && // 过滤掉MetaClass
                        !method.declaringClass.name.contains('groovy.') && // 过滤掉Groovy内置类
                        !method.declaringClass.name.contains('java.lang.') // 过滤掉Java内置类
            }

            setters.each { setter ->
                def dependencyType = setter.parameterTypes[0]
                def dependencySimpleName = dependencyType.simpleName
                def dependencyFullName = dependencyType.name
                WebSocketController.sendToClient(userName,"依赖的对象名称：" + dependencyFullName)
                // 跳过Page类型的依赖，因为已经在前面单独处理了
                if (dependencyFullName == 'com.microsoft.playwright.Page') {
                    return // 跳过这个setter
                }

                // 跳过Page类型的依赖，因为已经在前面单独处理了
                if (dependencyFullName == 'com.xs.auto.test.ui_auto_test.entity.TestCase') {
                    return // 跳过这个setter
                }

                // 跳过注入TestCaseConfig
                if (dependencyFullName == 'com.xs.auto.test.ui_auto_test.entity.TestCaseConfig'){
                    return
                }

                // 跳过Page类型的依赖，因为已经在前面单独处理了
                if (dependencyFullName == 'com.xs.auto.test.web.websocket.WebSocketController') {
                    return // 跳过这个setter
                }

                // 特殊处理 String 类型的 userName 依赖
                if (dependencyFullName == 'java.lang.String') {
                    // 检查 setter 方法名是否为 setUserName 或类似
                    def setterName = setter.name.toLowerCase()
                    if (setterName.contains('user') || setterName.contains('name')) {
                        return
                    }
                }

                def dependencyBean = null
                boolean fromSpring = false

                // 1. 首先从Groovy beans中查找依赖
                dependencyBean = beans.find { key, value ->
                    value.getClass().simpleName == dependencySimpleName
                }?.value

                // 2. 如果Groovy beans中没找到，从Spring容器中查找
                if (!dependencyBean && applicationContext != null) {
                    try {
                        // 根据类型从Spring容器获取Bean
                        def beanNames = applicationContext.getBeanNamesForType(dependencyType)
                        if (beanNames.length > 0) {
                            dependencyBean = applicationContext.getBean(beanNames[0])
                            fromSpring = true
                            logger.info("从Spring容器按类型获取依赖："+dependencyFullName+",bean名称："+ beanNames[0])
                        }
                    } catch (Exception e) {
                        // Spring容器中可能没有该类型的Bean，继续查找
                        println "按类型查找 $dependencyFullName 失败: ${e.message}"
                    }
                }

                // 3. 如果Spring容器中按类型没找到，尝试按setter方法名推断Bean名称
                if (!dependencyBean && applicationContext != null) {
                    try {
                        // 从setDemoClass推断Bean名称为demoClass
                        def inferredBeanName = setter.name.substring(3) // 去掉"set"
                        inferredBeanName = inferredBeanName.substring(0, 1).toLowerCase() + inferredBeanName.substring(1)

                        if (applicationContext.containsBean(inferredBeanName)) {
                            dependencyBean = applicationContext.getBean(inferredBeanName)
                            fromSpring = true
                            logger.info( "从Spring容器按名称获取依赖: "+inferredBeanName)
                        }
                    } catch (Exception e) {
                        // 忽略查找异常
                        println "按名称查找 $inferredBeanName 失败: ${e.message}"
                    }
                }

                // 4. 如果还没找到，尝试按类名推断Bean名称
                if (!dependencyBean && applicationContext != null) {
                    try {
                        // 将类名首字母小写作为Bean名称（Spring的默认命名策略）
                        def beanNameFromType = dependencySimpleName.substring(0, 1).toLowerCase() + dependencySimpleName.substring(1)
                        if (applicationContext.containsBean(beanNameFromType)) {
                            dependencyBean = applicationContext.getBean(beanNameFromType)
                            fromSpring = true
                            println "从Spring容器按类名获取依赖: $beanNameFromType"
                        }
                    } catch (Exception e) {
                        // 忽略查找异常
                        println "按类名查找 $beanNameFromType 失败: ${e.message}"
                    }
                }


                if (dependencyBean) {
                    try {
                        setter.invoke(bean, dependencyBean)
                        if (fromSpring) {
                            logger.info("成功从Spring容器注入依赖："+dependencyFullName+",bean名称："+ beanName)
                        } else {
                            logger.info("成功从Groovy beans注入依赖:"+dependencySimpleName+",bean名称："+ beanName)
                            println "成功从Groovy beans注入依赖: $dependencySimpleName -> $beanName"
                        }
                    } catch (Exception e) {
                        println "注入依赖失败: $dependencySimpleName -> $beanName: ${e.message}"
                        e.printStackTrace()
                    }
                } else {
                    println "未找到依赖: $dependencySimpleName (需要注入到 $beanName)"
                    // 调试信息：显示Spring容器中所有的Bean名称
                    if (applicationContext != null) {
                        def allBeanNames = applicationContext.beanDefinitionNames
                        println "Spring容器中现有的Bean: ${allBeanNames.join(', ')}"
                    }
                }
            }
        }

        // 执行测试
        return executeTest(beans)
    }

    // 执行测试的方法
    def executeTest(beans) {
        // 保存结果列表
        def methodResults = []
        def runMethod = null
        try {
            WebSocketController.sendToClient(userName,"正在执行测试类：" + testCase.getClassName())
            def runTestCase = beans[testCase.getClassName()]
            if (runTestCase) {
                // 遍历需要执行的测试类和测试方法
                def runMethods = runCaseVoList.get(0).getMethods()
                for (i in 0..<runMethods.length) {
                    String methodName = runMethods[i]
                    WebSocketController.sendToClient(userName,"正在执行测试方法：" + methodName)
                    runMethod = runTestCase.class.getMethod(methodName)
                    def result = runMethod.invoke(runTestCase)
                    def resultMap = [:]
                    resultMap.put("methodName",runMethod.name)
                    resultMap.put("result",result)
                    methodResults.add(resultMap)
                }
                return methodResults
            }
        } catch (Exception e) {
            WebSocketController.sendToClient(userName,"测试1类执行失败："+runMethod+"，错误原因：" + e.printStackTrace())
            return false
        }
    }

    /**
     * 清理资源
     */
    void close() {
        groovyClassLoader?.close()
    }
}