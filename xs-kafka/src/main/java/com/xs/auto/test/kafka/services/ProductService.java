package com.xs.auto.test.kafka.services;

import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
public class ProductService {
    // 直接注入 KafkaTemplate，Spring Boot 已自动配置好
    // Key 和 Value 的类型与我们配置的序列化器一致，这里是 String, String
    @Autowired
    private  KafkaTemplate<String, String> kafkaTemplate;
    private static Logger logger  = LoggerFactory.getLogger(ProductService.class);


    /**
     * 发送带key的消息,一般key由这个业务的唯一值，类似user_id，order_id等
     * @param topic
     * @param message
     */
    public void sendMessage(String topic,String message) {
        /**
         * record对象可以用来设置/获取 topic、key、header等属性
         */
        ProducerRecord<String,String> record = new ProducerRecord<>(topic,  message);
        record.headers().add("version","1.0".getBytes());
        kafkaTemplate.send(record);
    }
}
