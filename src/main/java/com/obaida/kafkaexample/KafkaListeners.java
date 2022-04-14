package com.obaida.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "${topic}", groupId = "groupId")
    public void listener(Message data) {
        System.out.println("Listener received " + data + "😜");
    }
}
