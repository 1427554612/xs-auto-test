package com.xs.auto.test.ui_auto_test.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xs.auto.test.ui_auto_test.entity.PoClass;

import com.xs.auto.test.ui_auto_test.mapper.PoClassMapper;
import com.xs.auto.test.ui_auto_test.services.PoClassService;
import org.springframework.stereotype.Service;


@Service
public class PoClassServiceImpl extends ServiceImpl<PoClassMapper, PoClass> implements PoClassService {

//    @Override
//    public boolean runHasSpring(PoClass poClass) throws InterruptedException {
//        // 创建唯一的 Page 对象
//        TestRunHandle testRunHandle = new TestRunHandle();
//        Page page = testRunHandle.initPage("https://www.jogosdev.com/");
//        List<PoClass> poClasses = baseMapper.selectList(null);
//        LinkedHashMap<String, String> objectObjectLinkedHashMap = new LinkedHashMap<>();
//        for (PoClass aClass : poClasses) {
//            objectObjectLinkedHashMap.put(aClass.getClassName(),aClass.getCode());
//        }
//        GroovyScriptExecutor executor = new GroovyScriptExecutor(applicationContext,objectObjectLinkedHashMap,poClass.getClassName());
//        try {
//            // 传入 Page 对象
//            executor.executeScripts(page);
//        } finally {
//            executor.close();
//            testRunHandle.close();
//        }
//        return true;
//    }
}
