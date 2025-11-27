package com.xs.auto.test.user.controller;

import com.xs.auto.test.commom.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Value("${spring.cloud.nacos.discovery.ip}")
    String ip;

    @Value("${spring.cloud.nacos.discovery.port}")
    String port;

    @RequestMapping("/test")
    public R test_ok(){
   //     return ResultModel.ok();
        return R.ok().data("ip",ip).data("port",port);
    }
}
