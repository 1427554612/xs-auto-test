package com.xs.auto.test.ui_auto_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = {"com.xs.auto.test.web",
        "com.xs.auto.test.ui_auto_test"},excludeFilters = {
        @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.xs.auto.test.ui_auto_test.testcase.*")
})
public class UIAutoTestApplication {
    public static void main(String[] args) {
        SpringApplication.run(UIAutoTestApplication.class,args);
    }
}
