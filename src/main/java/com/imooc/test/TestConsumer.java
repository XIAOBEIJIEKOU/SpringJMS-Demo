package com.imooc.test;

import com.imooc.producer.ProducerService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author Zhuang YeFan
 * @Date
 * @Description
 **/
public class TestConsumer {
    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
    }
}
