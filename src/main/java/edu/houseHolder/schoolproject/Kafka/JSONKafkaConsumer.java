package edu.houseHolder.schoolproject.Kafka;

import edu.houseHolder.schoolproject.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class JSONKafkaConsumer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JSONKafkaConsumer.class);
    @KafkaListener(topics = "user_update_notifications_json", groupId = "myGroup")
    public void consume(User user) {
        LOGGER.info(String.format("Json message received -> %", user.toString()));
    }
}
