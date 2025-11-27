package com.xs.auto.test.data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.xs.auto.test.data.pay.dao","com.xs.auto.test.data.admin.dao"})
public class DataApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataApplication.class,args);
    }
}
