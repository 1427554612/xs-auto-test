package com.xs.auto.test.ui_auto_test.script;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xs.auto.test.ui_auto_test.utils.EncryptUtil;
import com.xs.auto.test.ui_auto_test.utils.OkHttpUtil;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

/**
 * 发钱并发脚本
 */
public class OkhttpService {
    private static String ADMIN_BASE_URL = "https://admin.jogosdev.com";
    private static final String USER_BASE_URL = "https://api.jogosdev.com";
    private static String cookie = "JOGOS_ADMIN=YThlOWZlMWYtZTVkOS00N2QwLWEyODctN2Y5Nzc2MDM5OGM3";

    /**
     * 获取密码盐
     * @param client
     * @return
     */
    public static String getPasswordSalt(OkHttpClient client){
        Request password_salt_request  = null;
        try {
            password_salt_request = new Request.Builder()
                    .url(new URL(ADMIN_BASE_URL + "/api/calorcoin/airdrop/salt"))
                    .header("Cookie",cookie)
                    .get().build();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        String password_salt_responseBody = null;
        try {
            password_salt_responseBody = client.newCall(password_salt_request).execute().body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("password_salt_responseBody = " + password_salt_responseBody);
        // 获取密码盐
        ObjectMapper objectMapper = new ObjectMapper();
        String password_salt = null;
        try {
            password_salt = objectMapper.readTree(password_salt_responseBody).get("data").asText();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return password_salt;
    }

    /**
     * 发空投
     * @param client
     */
    public static void kongtou(OkHttpClient client){
        // 将密码转码为base64
        String passwordSalt = OkhttpService.getPasswordSalt(client);

        String code = "s2c3j.";
        String password_base64 = Base64.getEncoder().encodeToString(EncryptUtil.md5((code)).getBytes());
        String final_password = Base64.getEncoder().encodeToString(EncryptUtil.md5((
                password_base64 + passwordSalt)).getBytes());
        String requestBody = "{\n" +
                "    \"thoroughfareId\": 53,\n" +
                "    \"typeId\": 15,\n" +
                "    \"payTarget\": 2,\n" +
                "    \"hostNumber\": 10,\n" +
                "    \"password\": \""+final_password+"\",\n" +
                "    \"accountList\": [\n" +
                "        \"1427554612@qq.com\"\n" +
                "    ]\n" +
                "}";
        Request cc_request =  new Request.Builder().url(ADMIN_BASE_URL + "/api/calorcoin/airdrop/execute")
                .header("Cookie",cookie)
                .post(RequestBody.create(MediaType.parse("application/json;charset=utf-8"),requestBody))
                .build();
        String cc_response = null;
        try {
            cc_response = client.newCall(cc_request).execute().body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(cc_response);
    }

    /**
     * 抽奖领奖励
     * @throws IOException
     * @throws InterruptedException
     */
    public static void activiteClim(OkHttpClient client){
        String cookie = "JOGOS_WEB=NjA0MTYxYWQtY2NlNC00Y2QwLTg2MGUtMDMzNmU5MmEwNTQx; SESSION=13722656-8db5-4bc3-9136-8fa59dceae9e";
        Request cc_request =  new Request.Builder().url(USER_BASE_URL + "/api/web/activityDetail/executeLottery?activityId=900")
                .addHeader("Cookie",cookie)
                .get().build();
        String cc_response = null;
        try {
            cc_response = client.newCall(cc_request).execute().body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(cc_response);
    }

    /**
     * 任务领奖励
     * @throws IOException
     * @throws InterruptedException
     */
    public static void taskClim(OkHttpClient client){
        String cookie = "JOGOS_WEB=NjA0MTYxYWQtY2NlNC00Y2QwLTg2MGUtMDMzNmU5MmEwNTQx; SESSION=b1282f60-953e-4a2c-ad76-61231178162e";
        Request cc_request =  new Request.Builder().url(USER_BASE_URL + "/api/web/activityDetail/receiveAward?rewardId=245&prizeType=1")
                .addHeader("Cookie",cookie)
                .get().build();
        String cc_response = null;
        try {
            cc_response = client.newCall(cc_request).execute().body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(cc_response);
    }


    /**
     * 游戏互动操作
     * @throws IOException
     * @throws InterruptedException
     */
    public static void gameAction(OkHttpClient client){
        String cookie = "JOGOS_WEB=NjA0MTYxYWQtY2NlNC00Y2QwLTg2MGUtMDMzNmU5MmEwNTQx; SESSION=5074ed86-2563-4d21-9ab6-bfb6c5809dc0";
        String requestBody = "{\"gameId\":9983,\"acttype\":4,\"cattype\":0}";
        Request cc_request =  new Request.Builder().url(USER_BASE_URL + "/api/games/action")
                .post(RequestBody.create(MediaType.parse("application/json;charset=utf-8"),requestBody))
                .addHeader("Cookie",cookie)
                .build();
        String cc_response = null;
        try {
            cc_response = client.newCall(cc_request).execute().body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(cc_response);
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        OkHttpClient okHttpClient = OkHttpUtil.createOkHttpClient();

        // 开始执行并发脚本
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
                gameAction(okHttpClient);
            }).run();
        }

    }


}
