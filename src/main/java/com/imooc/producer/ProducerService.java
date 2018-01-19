package com.imooc.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import javax.annotation.Resource;
import javax.jms.*;

/**
 * @Author Zhuang YeFan
 * @Date
 * @Description
 **/
public class ProducerService {

    @Autowired
    JmsTemplate jmsTemplate;

    @Resource(name = "queueDestination")
    Destination queueDestination;

    @Resource(name = "topicDestination")
    Destination topicDestination;


    public void sendQueueMessage(final String message){
        jmsTemplate.send(queueDestination,new MessageCreator() {
        @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage(message);
                System.out.println("发送num："+ textMessage.getText());
                return textMessage;
            }
        });
    }

    public void sendTopicMessage(final String msg) {
        jmsTemplate.send(topicDestination,new MessageCreator() {
            public Message createMessage(Session session) throws JMSException {
                System.out.println("向队列" + topicDestination.toString() + "发送了消息num------------" + msg);
                return session.createTextMessage(msg);
            }
        });
    }
}
