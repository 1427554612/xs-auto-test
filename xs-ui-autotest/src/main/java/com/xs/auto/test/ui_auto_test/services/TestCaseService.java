package com.xs.auto.test.ui_auto_test.services;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xs.auto.test.ui_auto_test.entity.PoClass;
import com.xs.auto.test.ui_auto_test.entity.TestCase;
import com.xs.auto.test.ui_auto_test.vo.RunCaseVo;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 测试用例表 服务类
 * </p>
 *
 * @author author
 * @since 2023-08-08
 */
public interface TestCaseService extends IService<TestCase> {

    /**
     * 执行用例
     * @return
     */
    boolean run(RunCaseVo runCaseVo) throws InterruptedException, Exception;


    /**
     * 获取要执行的类的所有的测试方法
     * @return
     */
    List<String> getRunCaseMethod(String classId);

}
