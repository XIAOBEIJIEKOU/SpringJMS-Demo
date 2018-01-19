package com.imooc.consumer;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * @Author Zhuang YeFan
 * @Date
 * @Description
 **/
public class ConsumerService implements MessageListener{
    @Override
    public void onMessage(Message message) {
        try {
            System.out.println("接受消息:"+((TextMessage)message).getText());
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
