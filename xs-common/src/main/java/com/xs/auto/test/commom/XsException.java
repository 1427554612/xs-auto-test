package com.xs.auto.test.commom;

/**
 * 自定义异常类
 */
public class XsException extends RuntimeException{
    private Integer code;
    private String message;

    public XsException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
    public XsException() {
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
    @Override
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
