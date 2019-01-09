package com.rabbitmq.zht;

import com.rabbitmq.zht.rabbit.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMQApplicationTests {

	@Autowired
	private Sender sender;
	@Test
	public void contextLoads() throws Exception{
		sender.send();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>finish");
	}

}

