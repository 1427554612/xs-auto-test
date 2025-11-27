package com.xs.auto.test.ui_auto_test.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class JsonParseUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    /**
     * json转字符
     * @param jsonMap
     * @return
     */
    public static String jsonToString(Map<String,Object> jsonMap){
        String str = "";
        try {
            str = objectMapper.writeValueAsString(jsonMap);
        }catch (Exception e ){
            e.printStackTrace();
        }
        return str;
    }

}
