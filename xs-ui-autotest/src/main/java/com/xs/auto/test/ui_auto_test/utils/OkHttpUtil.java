package com.xs.auto.test.ui_auto_test.utils;

import okhttp3.OkHttpClient;

import java.util.concurrent.TimeUnit;

public class OkHttpUtil {
    private static OkHttpClient okHttpClient = createOkHttpClient();
    /**
     * 创建okHttp对象
     * @return
     */
    public static OkHttpClient createOkHttpClient(){
        if (null == okHttpClient){
            return new OkHttpClient.Builder()
//                .proxy(new java.net.Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 7890)))
                    .connectTimeout(30, TimeUnit.MINUTES)
                    .callTimeout(30,TimeUnit.MINUTES)
                    .readTimeout(30,TimeUnit.MINUTES)
                    .build();
        }
        return okHttpClient;
    }
}
