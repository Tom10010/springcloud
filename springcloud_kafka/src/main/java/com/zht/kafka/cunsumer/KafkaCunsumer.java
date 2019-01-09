package com.zht.kafka.cunsumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class KafkaCunsumer {

    @KafkaListener(topics = {"zht", "zhtm"})
    public void consumer(ConsumerRecord<?, ?> consumerRecord) {
        //判断是否为空
        Optional<?> kafkaMessage = Optional.ofNullable(consumerRecord.value());
        log.info(">>>>>>>>>>>>> record =" + kafkaMessage);
        if (kafkaMessage.isPresent()) {
            //得到Optional实例中的值
            Object message = kafkaMessage.get();
            log.info(">>>>>>>接受消息Message = " + message);
        }

    }
}
