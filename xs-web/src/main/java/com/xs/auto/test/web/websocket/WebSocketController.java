package com.xs.auto.test.web.websocket;

import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@Component
@ServerEndpoint(value = "/ws/{name}")
public class WebSocketController {

    // 使用静态Map管理所有会话
    private static final Map<String, Session> SESSION_MAP = new ConcurrentHashMap<>();
    private static final Map<String, WebSocketController> CONTROLLER_MAP = new ConcurrentHashMap<>();

    private Session session; // 当前对象会话
    private String name;     // 当前对象用户

    /**
     * 连接成功后的回调
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("name") String name){
        System.out.println("建立链接的name：" + name);
        this.session = session;
        this.name = name;
        session.setMaxIdleTimeout(60000*60);
        // 保存到静态Map中
        SESSION_MAP.put(name, session);
        CONTROLLER_MAP.put(name, this);
        System.out.println(name + "，连接成功，当前连接数:" +SESSION_MAP.size());
    }

    /**
     * 关闭连接后的回调
     */
    @OnClose
    public void onClose(Session session) {
        SESSION_MAP.remove(this.name);
        CONTROLLER_MAP.remove(this.name);
        System.out.println(this.name + "，断开连接，剩余连接数:"+SESSION_MAP.size());
    }

    /**
     * 向指定客户端发送消息
     */
    public static boolean sendToClient(String clientName, String message) {
        try {
            Session targetSession = SESSION_MAP.get(clientName);
            if (targetSession != null && targetSession.isOpen()) {
                targetSession.getBasicRemote().sendText(message);
                return true;
            }
            return false;
        } catch (Exception e) {
            System.out.println("向客户端:" + clientName + "发送消息失败: " + e.getMessage());
            return false;
        }
    }

    /**
     * 向所有客户端广播消息
     */
    public static void broadcast(String message) {
        SESSION_MAP.forEach((clientName, session) -> {
            if (session != null && session.isOpen()) {
                try {
                    session.getBasicRemote().sendText(message);
                } catch (Exception e) {
                    System.out.println("向客户端:" + clientName + "广播消息失败: " + e.getMessage());
                }
            }
        });
    }

    /**
     * 获取当前连接的所有客户端名称
     */
    public static Set<String> getConnectedClients() {
        return new HashSet<>(SESSION_MAP.keySet());
    }

    /**
     * 检查指定客户端是否连接
     */
    public static boolean isClientConnected(String clientName) {
        Session session = SESSION_MAP.get(clientName);
        return session != null && session.isOpen();
    }

    /**
     * 获取当前会话
     * @return
     */
    public Session getSession() {
        return session;
    }

    /**
     * 获取当前用户
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 获取链接总数
     * @return
     */
    public static int getConnectionCount() {
        return SESSION_MAP.size();
    }
}