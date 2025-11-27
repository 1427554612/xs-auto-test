package com.xs.auto.test.commom;

import java.util.HashMap;
import java.util.Map;

public class R {

    public final static Integer RESULT_CODE_SUCCESS = 20000;
    public final static Integer RESULT_CODE_ERROR = 20001;

    private String message;      // 返回结果信息
    private Integer code;         // 返回状态码 20000
    private Boolean SUCCESS;     // 是否成功返回
    private Map<String,Object> data = new HashMap<>();  // 返回数据

    private R(){}

    /**
     * 返回成功，且未装载响应数据的响应Model对象
     * @return
     */
    public static R ok(){
        R r = new R();
        r.setCode(R.RESULT_CODE_SUCCESS);
        r.setMessage("成功");
        r.setSUCCESS(true);
        return r;
    }
    /**
     * 返回失败，且未装载响应数据的响应Model对象
     * @return
     */
    public static R error(){
        R r = new R();
        r.setCode(R.RESULT_CODE_ERROR);
        r.setMessage("失败");
        r.setSUCCESS(false);
        return r;
    }


    public R data(String key, Object value){
        this.data.put(key,value);
        return this;
    }

    public R data(Map<String,Object> map){
        this.setData(map);
        return this;
    }

    public R success(Boolean success){
        this.setSUCCESS(success);
        return this;
    }

    public R message(String message){
        this.setMessage(message);
        return this;
    }

    public R code(Integer code){
        this.setCode(code);
        return this;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Boolean getSUCCESS() {
        return SUCCESS;
    }

    public void setSUCCESS(Boolean SUCCESS) {
        this.SUCCESS = SUCCESS;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
