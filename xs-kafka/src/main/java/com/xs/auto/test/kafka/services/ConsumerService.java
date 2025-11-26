package com.xs.auto.test.kafka.services;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private static Logger logger  = LoggerFactory.getLogger(ProductService.class);


    @KafkaListener(topics = "my-topic", groupId = "my-group-1")
    public void listenWithConsumerRecord1(ConsumerRecord<String, String> record, Acknowledgment ack) {
        logger.info("消费者组1执行了，消费消息为：" + record.value() + ",分区为：" + record.partition());
        ack.acknowledge();
    }

    @KafkaListener(topics = "my-topic", groupId = "my-group-2")
    public void listenWithConsumerRecord2(ConsumerRecord<String, String> record, Acknowledgment ack) {
        logger.info("消费者组2执行了，消费消息为：" + record.value() + ",分区为：" + record.partition());
        ack.acknowledge();
    }

//    @KafkaListener( groupId = "my-group",topicPartitions = {
//            @TopicPartition( topic = "my-topic",partitions = {"0"})
//    })
//    public void listenWithConsumerRecord2(ConsumerRecord<String, String> record, Acknowledgment ack) {
//        logger.info("消费者执行了，消费消息为：" + record.value() +",分区为：" + record.partition());
//        ack.acknowledge();
//    }




}
