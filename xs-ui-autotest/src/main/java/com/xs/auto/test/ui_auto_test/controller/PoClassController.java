package com.xs.auto.test.ui_auto_test.controller;

import com.xs.auto.test.commom.R;
import com.xs.auto.test.ui_auto_test.entity.PoClass;
import com.xs.auto.test.ui_auto_test.mapper.PoClassMapper;
import com.xs.auto.test.ui_auto_test.services.PoClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/po")
public class PoClassController {

    @Autowired
    PoClassMapper poClassMapper;

    @Autowired
    PoClassService poClassService;



    /**
     * 新增类
     */
    @PostMapping("/save")
    public R add(@RequestBody PoClass poClass) {
        poClass.setCreateTime(new Date());
        poClass.setUpdateTime(new Date());
        return poClassMapper.insert(poClass)==1 ? R.ok() : R.error();
    }



    /**
     * 根据ID更新类
     */
    @PutMapping("/update")
    public R update(@RequestBody PoClass poClass) {
        return poClassMapper.updateById(poClass)==1 ? R.ok() : R.error();
    }


    /**
     * 查询所有类列表
     */
    @GetMapping("/list")
    public R list() {
        System.out.println("走到list接口");
        List<PoClass> list = poClassMapper.selectList(null);
        return R.ok().data("list",list);
    }

}
