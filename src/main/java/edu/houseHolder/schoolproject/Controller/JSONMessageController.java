package edu.houseHolder.schoolproject.Controller;

import edu.houseHolder.schoolproject.Database.MongoDBHandler;
import edu.houseHolder.schoolproject.Kafka.JSONKafkaProducer;
import edu.houseHolder.schoolproject.payload.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class JSONMessageController {

    private final JSONKafkaProducer kafkaProducer;
    private final MongoDBHandler mongoDBHandler; // Inject the MongoDBHandler

    public JSONMessageController(JSONKafkaProducer kafkaProducer, MongoDBHandler mongoDBHandler) {
        this.kafkaProducer = kafkaProducer;
        this.mongoDBHandler = mongoDBHandler;
    }

    @PostMapping
    public ResponseEntity<String> publish(@RequestBody User user) {
        // Send the JSON message to Kafka
        kafkaProducer.sendMessage(user);

        // Store the JSON message in MongoDB
        mongoDBHandler.storeMessage(user);

        return ResponseEntity.ok("Json message sent to Kafka topic and stored in MongoDB");
    }

}
