package main.java.com.kafka.producer;

import org.springframework.stereotype.Component;
import org.springframework.kafka.annotation.KafkaListener;

@Component
public class KafkaListeners {

    @KafkaListener(
        topics = "test",
        groupId = "group1"
    )
    public void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
