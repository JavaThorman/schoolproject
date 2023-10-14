package edu.houseHolder.schoolproject.Controller;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping(path = "/publish", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> publish(@RequestBody String message) {
        try {
            kafkaTemplate.send("user_notification_updates_json", message);
            return ResponseEntity.ok("Message sent to the Topic");
        } catch (Exception e) {
            e.printStackTrace(); // Log the exception for debugging
            return ResponseEntity.status(500).body("Internal server error");
        }
    }
}
