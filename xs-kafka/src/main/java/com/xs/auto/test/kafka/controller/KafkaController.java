package com.xs.auto.test.kafka.controller;


import com.xs.auto.test.commom.R;
import com.xs.auto.test.kafka.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequestMapping("/api/kafka")
@RestController
public class KafkaController {

    @Autowired
    private ProductService productService;


    /**
     * 发送带key的消息
     * @param number
     * @return
     */
    @GetMapping("/send/{number}")
    public R sendMessage(@PathVariable Integer number, HttpServletRequest request){
        for (Integer i = 0; i < number; i++) productService.sendMessage("my-topic",System.currentTimeMillis() + "..消息发送完毕...");
        return R.ok();
    }
}
