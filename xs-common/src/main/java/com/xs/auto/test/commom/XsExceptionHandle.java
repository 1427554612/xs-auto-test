package com.xs.auto.test.commom;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class XsExceptionHandle extends Throwable{

    /**
     * 全局异常处理器
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    public R error(Exception e){
        e.printStackTrace();
        System.out.println("~~~~~~~~  全局异常函数执行了~~~~~~~");
        return R.error().message(e.getMessage());
    }

    /**
     * 全局异常处理器
     * @param e
     * @return
     */
    @ExceptionHandler(NullPointerException.class)
    public R error(NullPointerException e){
        e.printStackTrace();
        System.out.println("~~~~~~~~  空指针异常执行了 ~~~~~~~");
        return R.error().message(e.getMessage());
    }

    /**
     * 全局异常处理器
     * @param e
     * @return
     */
    @ExceptionHandler(XsException.class)
    public R myException(XsException e){
        e.printStackTrace();
        System.out.println("~~~~~~~~  自定义异常执行了 ~~~~~~~");
        return R.error().message(e.getMessage());
    }
}
