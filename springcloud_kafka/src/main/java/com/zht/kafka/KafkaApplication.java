package com.zht.kafka;

import com.zht.kafka.sendMessage.KafkaSender;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
@Slf4j
public class KafkaApplication {

	@Autowired
	private KafkaSender kafkaSender;

	@PostConstruct
	public void init(){
		for (int i = 0; i < 10; i++) {
			//调用消息发送类中的消息发送方法
            log.info("》》》》》》》》》》》》》》》》第 {} ",i+"次发送消息");
			kafkaSender.send((long)i);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

}

