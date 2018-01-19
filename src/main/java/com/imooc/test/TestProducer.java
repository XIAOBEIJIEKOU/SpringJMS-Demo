package com.imooc.test;

import com.imooc.producer.ProducerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Zhuang YeFan
 * @Date
 * @Description
 **/
public class TestProducer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService producerService = context.getBean(ProducerService.class);
        for (int i = 0; i < 100; i++) {
            producerService.sendTopicMessage("damon---------"+i);
        }
        for (int i = 0; i < 100; i++) {
            producerService.sendQueueMessage("stefan---------"+i);
        }
        context.close();
        context.close();
    }
}
