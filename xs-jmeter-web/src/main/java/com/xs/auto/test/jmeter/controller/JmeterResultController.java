package com.xs.auto.test.jmeter.controller;


import com.xs.auto.test.commom.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/jmeter")
@RestController
public class JmeterResultController {

    @Value("${jmeter.result.count-result}")
    private String jmeterResultPath;


    @GetMapping("/save")
    public R saveJmeterData(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return R.ok();
    }
}
