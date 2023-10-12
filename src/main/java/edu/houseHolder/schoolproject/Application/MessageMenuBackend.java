package edu.houseHolder.schoolproject.Application;

import edu.houseHolder.schoolproject.Database.MongoDBHandler;
import edu.houseHolder.schoolproject.Database.UserRepository;
import edu.houseHolder.schoolproject.Kafka.JSONKafkaProducer;
import edu.houseHolder.schoolproject.payload.User;
import org.apache.kafka.common.protocol.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
public class MessageMenuBackend {

    private final JSONKafkaProducer kafkaProducer;
    private final UserRepository userRepository;
    private final MongoDBHandler mongoDBHandler; // Inject the MongoDBHandler

    @Autowired
    public MessageMenuBackend(JSONKafkaProducer kafkaProducer, UserRepository userRepository, MongoDBHandler mongoDBHandler, MessageMenuFrontend frontend) {
        this.kafkaProducer = kafkaProducer;
        this.userRepository = userRepository;
        this.mongoDBHandler = mongoDBHandler;
    }

    public void sendMessage(String title, String holder, String notification, String doer, Boolean status) {
        User user = new User();

        user.set_id(mongoDBHandler.generateNewId("chores"));

        user.setTitle(title);
        user.setHolder(holder);
        user.setNotification(notification);
        user.setDoer(doer);
        user.setStatus(status);


        kafkaProducer.sendMessage(user);

        // Save the user document in MongoDB
        mongoDBHandler.storeMessage(user);

        System.out.println("Json message sent to Kafka topic and stored in MongoDB.");
    }

    public void readMessages() {
        System.out.println("Reading messages:");

        // Query and display messages from MongoDB
        List<User> users = userRepository.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    public void changeStatus(String id) {

        // Find chore by _id
        mongoDBHandler.changeChoreStatusBy_id(id);

        // Replace boolean value of false with true (if done)

        // send updates to MongoDB.
    }
}
