package edu.houseHolder.schoolproject.Controller;

import edu.houseHolder.schoolproject.Kafka.KafkaProducer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class MessageController {
    private final KafkaProducer kafkaProducer;

    public MessageController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping("/publish") // Remove the "?" here
    public ResponseEntity<String> publish(@RequestBody String message) { // Use @RequestBody to read JSON from the request body
        try {
            kafkaProducer.sendMessage(message);
            return ResponseEntity.ok("Message sent to the Topic");
        } catch (Exception e) {
            // Log the exception for debugging
            e.printStackTrace();
            return ResponseEntity.status(500).body("Internal server error");
        }
    }
}


