package com.xs.auto.test.jmeter.service;

import org.apache.jmeter.engine.StandardJMeterEngine;
import org.apache.jmeter.reporters.ResultCollector;
import org.apache.jmeter.reporters.Summariser;
import org.apache.jmeter.samplers.SampleEvent;
import org.apache.jmeter.samplers.SampleListener;
import org.apache.jmeter.samplers.SampleResult;
import org.apache.jmeter.save.SaveService;
import org.apache.jmeter.testelement.TestElement;
import org.apache.jmeter.util.JMeterUtils;
import org.apache.jmeter.visualizers.Visualizer;
import org.apache.jorphan.collections.HashTree;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class JmeterRunService {

    // 添加所有运行依赖包
    private void loadJMeterLibraries(String jmeterHome) throws MalformedURLException {
        List<URL> urls = new ArrayList<>();
        addJarFiles(new File(jmeterHome, "lib"), urls);
        addJarFiles(new File(jmeterHome, "lib/ext"), urls);
        URLClassLoader classLoader = new URLClassLoader(urls.toArray(new URL[0]),
                Thread.currentThread().getContextClassLoader());
        Thread.currentThread().setContextClassLoader(classLoader);
    }

    // 扫描所有依赖包
    private void addJarFiles(File directory, List<URL> urls) throws MalformedURLException {
        if (directory.exists() && directory.isDirectory()) {
            File[] jarFiles = directory.listFiles((dir, name) -> name.toLowerCase().endsWith(".jar"));
            if (jarFiles != null) {
                for (File jarFile : jarFiles) {
                    urls.add(jarFile.toURI().toURL());
                }
            }
        }
    }

    /**
     * 配置测试计划
     */
    private void configureResults(HashTree testPlanTree) {
        String summariserName = JMeterUtils.getPropDefault("summariser.name", "summary");
        Summariser summariser = summariserName.length() > 0 ? new Summariser(summariserName) : null;
        ResultCollector realTimeCollector = new ResultCollector(summariser){
            @Override
            public void sampleOccurred(SampleEvent e) {
                System.out.println("🎉 sampleOccurred 被调用!");
                super.sampleOccurred(e);
                SampleResult result = e.getResult();
                if (result != null) {
                    System.out.printf("📊 实时结果 | %s | %dms | %s%n",
                            result.getSampleLabel(),
                            result.getTime(),
                            result.getResponseCode());
                }
            }
        };
        realTimeCollector.setName("实时结果收集器");
        realTimeCollector.setFilename("testResult.jtl");
        realTimeCollector.setProperty(TestElement.TEST_CLASS, ResultCollector.class.getName());
        realTimeCollector.setProperty(TestElement.GUI_CLASS, "ResultCollector");
        realTimeCollector.setEnabled(true);
        testPlanTree.add(realTimeCollector);
    }

    // 第四步：执行测试并等待完成
    private void runTest(HashTree testPlanTree) {
        StandardJMeterEngine jmeter = new StandardJMeterEngine();
        jmeter.configure(testPlanTree);
        System.out.println("🚀 Starting JMeter test...");
        jmeter.run();

    }


    public static void main(String[] args) throws Exception {
        new JmeterRunService().executeJMX(
                "C:\\Users\\Administrator\\Desktop\\testplan.jmx",
                "C:\\Users\\Administrator\\Desktop\\apache-jmeter-5.3");
    }

    public void executeJMX(String jmxPath, String jmeterHome) throws IOException {
        try {
            // jmeter第一步：初始化jmeter信息
            JMeterUtils.setJMeterHome(jmeterHome);
            JMeterUtils.loadJMeterProperties(jmeterHome + "/bin/jmeter.properties");
            JMeterUtils.initLocale();

            // jmeter第二步：加载运行依赖
            loadJMeterLibraries(jmeterHome);

            // 初始化 SaveService
            SaveService.loadProperties();

            // jmeter第三步：加载测试计划
            HashTree testPlanTree = SaveService.loadTree(new File(jmxPath));

            // jmeter第四步：配置结果组件
            configureResults(testPlanTree);

            // jmeter第五步：执行运行测试
            runTest(testPlanTree);

        } catch (Exception e) {
            System.err.println("❌ 执行失败: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
