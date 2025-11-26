//package com.xs.auto.test.ui_auto_test.script;
//
//import org.codehaus.janino.ScriptEvaluator;
//import org.codehaus.janino.SimpleCompiler;
//
//import java.lang.reflect.Constructor;
//import java.lang.reflect.Method;
//import java.util.Arrays;
//import java.util.List;
//
//public class JaninoService {
//
//    /**
//       执行有返回值的脚本
//     */
//    public static void runScript() throws Exception{
//        ScriptEvaluator se = new ScriptEvaluator();
//        // 显示声明返回值
//        se.setReturnType(Object.class);
//        // 执行多行代码
//        se.cook(
//                "int x = 10;\n" +
//                        "int y = 20;\n" +
//                        "int result = x * y + 5;\n" +
//                        "System.out.println(\"计算结果: \" + result);\n" +
//                        "return result;"
//        );
//        Object result = se.evaluate(new Object[0]);
//        System.out.println("返回结果: " + result);
//    }
//
//    /**
//     * 外部程序调用内部类
//     SimpleCompiler：
//        实现类的构建
//     */
//    public static void runClassScript() throws Exception{
//        // 执行多行代码
//        String code =
//                "public class MyScript{" +
//                        "public String name;" +
//                        "public MyScript(String name){" +
//                        "   this.name = name;" +
//                        "}" +
//                        "public void showName(){" +
//                        "  System.out.println(\"您的名字是：\" + this.name);" +
//                        "}"+
//                        "}";
//
//        SimpleCompiler compiler = new SimpleCompiler();
//        compiler.cook(code);
//        Class<?> clazz = compiler.getClassLoader().loadClass("MyScript");
//        Constructor<?> constructor = clazz.getConstructor(String.class);
//        Object zhangjun = constructor.newInstance("zhangjun");
//        Method showName = clazz.getMethod("showName");
//        showName.invoke(zhangjun);
//
//    }
//
//    /**
//     * 内部脚本调用系统程序
//     */
//    public static void scriptRunInnerMethod()throws Exception {
//        ScriptEvaluator se = new ScriptEvaluator();
//        // 执行多行代码
//        se.cook(
//                "import com.xs.auto.test.script.utils.OkHttpUtil;"+
//                        "OkHttpUtil okHttp = new OkHttpUtil();"+
//                        "System.out.println(okHttp);"
//        );
//        se.evaluate();
//    }
//
//    /**
//     * 脚本之间互相调用
//     * @throws Exception
//     */
//    public static void scriptRunScript() throws Exception {
//        String script1 = "import com.microsoft.playwright.Locator;\n" +
//                "import com.microsoft.playwright.Page;\n" +
//                "\n" +
//                "public class HomePage {\n" +
//                "    private Page page;\n" +
//                "\n" +
//                "    public HomePage(Page page){\n" +
//                "        this.page = page;\n" +
//                "    }\n" +
//                "\n" +
//                "    /**\n" +
//                "     * 通过滚动条\n" +
//                "     * @return\n" +
//                "     */\n" +
//                "    public boolean scrollBar(){\n" +
//                "        try {\n" +
//                "            this.page.locator(\"div.year-13-scroll\").evaluate(\"element => element.scrollTo(0, element.scrollHeight)\");\n" +
//                "            this.page.locator(\"//*[@id=\\\"app\\\"]/div[3]/div/div[3]/div\").click();\n" +
//                "            return true;\n" +
//                "        }catch (Exception e){\n" +
//                "            return false;\n" +
//                "        }\n" +
//                "    }\n" +
//                "\n" +
//                "    /**\n" +
//                "     * 切换聚合页\n" +
//                "     * @return\n" +
//                "     */\n" +
//                "    public boolean selectGamePage() {\n" +
//                "        try {\n" +
//                "            Locator selector = this.page.locator(\"//*[@id=\\\"app\\\"]/div[2]/div/div[1]/div/section/section/section/section[1]\");\n" +
//                "            Locator childrenSelector = selector.locator(\"> *\");\n" +
//                "            // 避免太快\n" +
//                "            for (int i = 0; i <= childrenSelector.count() - 2; i++) {\n" +
//                "                Locator nth = childrenSelector.nth(i);\n" +
//                "                Thread.sleep(1000);\n" +
//                "                nth.click();\n" +
//                "            }\n" +
//                "            return true;\n" +
//                "        } catch (Exception e) {\n" +
//                "            return false;\n" +
//                "        }\n" +
//                "    }\n" +
//                "}";
//        String script2 = "import com.microsoft.playwright.Locator;\n" +
//                "import com.microsoft.playwright.Page;\n" +
//                "\n" +
//                "public class LoginPage {\n" +
//                "\n" +
//                "    public Page page;\n" +
//                "\n" +
//                "    public LoginPage(Page page){\n" +
//                "        this.page = page;\n" +
//                "    }\n" +
//                "\n" +
//                "    /**\n" +
//                "     * 登录操作\n" +
//                "     * @param username\n" +
//                "     * @param password\n" +
//                "     * @return\n" +
//                "     */\n" +
//                "    public boolean login(String username,String password){\n" +
//                "        try {\n" +
//                "            // 登录：\n" +
//                "            Locator loginButton = page.locator(\"//*[@id=\\\"app\\\"]/div[1]/header/section[2]/section[2]/div[1]/div/span[2]\");\n" +
//                "            loginButton.click();\n" +
//                "            // 输入账号密码\n" +
//                "            Locator loginInput = page.locator(\"//*[@id=\\\"JogosLogin\\\"]/div[2]/div/div[3]/input\");\n" +
//                "            loginInput.fill(username);\n" +
//                "            Locator accountButton = page.locator(\"//*[@id=\\\"JogosLogin\\\"]/div[2]/div/div[3]/div[3]\");\n" +
//                "            accountButton.click();\n" +
//                "            Locator passwordInput = page.locator(\"//*[@id=\\\"JogosLogin\\\"]/div[2]/div/div[3]/div[2]/div[2]/input[2]\");\n" +
//                "            passwordInput.fill(password);\n" +
//                "            Locator loginSubmit = page.locator(\"//*[@id=\\\"JogosLogin\\\"]/div[2]/div/div[3]/div[3]\");\n" +
//                "            loginSubmit.click();\n" +
//                "            return true;\n" +
//                "        }catch (Exception e){\n" +
//                "            e.printStackTrace();\n" +
//                "            return false;\n" +
//                "        }\n" +
//                "\n" +
//                "    }\n" +
//                "}";
//        List<String> startScripts = Arrays.asList(script1,script2);
//        String excuteScript = "import com.microsoft.playwright.Page;\n" +
//                "import com.xs.auto.test.script.core.TestRunHandle;\n" +
//                "Page page = new TestRunHandle().initPage(\"https://www.jogosdev.com/\");\n" +
//                "HomePage homePage = new HomePage(page);\n" +
//                "homePage.selectGamePage();\n" +
//                "LoginPage loginPage = new LoginPage(page);\n" +
//                "loginPage.login(\"zhangjun@qq.com\",\"123456\");";
//    }
//
//
//
//
//
//
//    public static void main(String[] args) throws Exception {
//        JaninoService.scriptRunScript();
//
//    }
//}
