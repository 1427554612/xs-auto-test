package com.xs.auto.test.ui_auto_test.controller;

import com.xs.auto.test.commom.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/script")
public class ScriptController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("/user/list")
    public R findAllUser(){
        List<Map<String, Object>> users = jdbcTemplate.queryForList("select * from user_member;");
        return R.ok().data("data",users);
    }

    /**
     * 测试多线程
     * @return
     */
    @GetMapping("/thread/{threadNumber}")
    public R createThread(@PathVariable Integer threadNumber) {
        for (Integer i = 0; i < threadNumber; i++) {
            new Thread(()->{
                System.out.println(Thread.currentThread().getName() + " 执行了...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                ;
            }).run();
        }
        return R.ok();
    }

    /**
     * 测试heap内存
     * @return
     */
    @GetMapping("/obj/{objNumber}")
    public R createObj(@PathVariable Integer objNumber) {
        System.out.println("objNumber = " + objNumber);
        for (Integer i = 0; i < objNumber; i++) {
            Date date = new Date();
            date.setDate(new Date().getDate());
            for (int i1 = 0; i1 < 10000; i1++) {
                date.setDate(new Date().getDate());
                System.out.println("date = " + date);
            }
        }
        return R.ok();
    }

}
