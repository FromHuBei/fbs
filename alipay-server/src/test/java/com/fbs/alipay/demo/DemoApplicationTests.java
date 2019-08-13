package com.fbs.alipay.demo;

import com.fbs.alipay.demo.rabbitmq.FanoutAConsumer;
import com.fbs.alipay.demo.rabbitmq.RabbitProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private RabbitProducer producer;


    @Test
    public void testStringSend() {
        for (int i = 0; i < 10; i++) {
            producer.fanoutSend();
        }
    }


}
