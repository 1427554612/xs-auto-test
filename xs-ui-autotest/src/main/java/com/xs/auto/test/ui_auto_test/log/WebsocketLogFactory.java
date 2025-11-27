package com.xs.auto.test.ui_auto_test.log;

import com.xs.auto.test.ui_auto_test.utils.DateTimeParseUtil;
import com.xs.auto.test.ui_auto_test.utils.JsonParseUtil;
import com.xs.auto.test.web.websocket.WebSocketController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * log4j+websocket实时
 * @param <T>
 */
public class WebsocketLogFactory<T> {

    private Logger logger;
    private WebSocketController webSocketController;
    public String name;
    public StringBuilder stringBuilder = new StringBuilder();
    public Class<T> tClass;


    public WebsocketLogFactory(Class<T> tClass){
        this.tClass = tClass;
        this.logger = LoggerFactory.getLogger(tClass);
    }

    public WebsocketLogFactory(Class<T> tClass, WebSocketController webSocketController,String name){
        this.tClass = tClass;
        this.logger = LoggerFactory.getLogger(tClass);
        this.name = name;
        this.webSocketController = webSocketController;
    }


    public void setLogger(Class<T> tClass) {
        this.logger = LoggerFactory.getLogger(tClass);;
    }

    public String getName() {
        return name;
    }

    /**
     * 写正常日志
     * @param msg
     * @return
     */
    public String info(String msg){
        logger.info(msg);
        return baseLog(msg);
    }

    /**
     * 写错误日志
     * @param msg
     * @return
     */
    public String error(String msg){
        logger.error(msg);
        return baseLog(msg,"error");
    }

    public String warn(String msg){
        logger.warn(msg);
        return baseLog(msg);
    }

    /**
     * 推送消息
     * @param msg
     */
    private String baseLog( String msg){
        return baseLog(msg,"wait");
    }

    private String baseLog(String msg,String type){
        Map<String,Object> messageMap = new HashMap<>();
        String currentTime = DateTimeParseUtil.getParseTime(new Date());
        messageMap.put("title",msg);
        messageMap.put("status",type);
        messageMap.put("time", DateTimeParseUtil.getParseTime(new Date()));
        stringBuilder.append(currentTime).append(" ").append(tClass.getName()).append(" ").append(msg).append("\n");
        try {
            WebSocketController.sendToClient(this.name, JsonParseUtil.jsonToString(messageMap));
        }catch (Exception e){
            logger.error("websocket消息发送失败，错误原因：" +e.getMessage());
        }
        return stringBuilder.toString();
    }

    /**
     * 清空之前日志
     */
    public void clearLogs() {
        if (stringBuilder != null) {
            stringBuilder.setLength(0); // 清空StringBuilder内容
        }
    }

}
