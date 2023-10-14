package edu.houseHolder.schoolproject.Application;

import edu.houseHolder.schoolproject.Database.MongoDBHandler;
import edu.houseHolder.schoolproject.Database.UserRepository;
import edu.houseHolder.schoolproject.Kafka.JSONKafkaProducer;
import edu.houseHolder.schoolproject.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    // Send a message to Kafka and store it in MongoDB
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

    // Read and display messages from MongoDB
    public void readMessages() {
        System.out.println("Reading messages:");

        List<User> users = userRepository.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    // Change the status of a chore in MongoDB
    public void changeStatus(String id) {
        mongoDBHandler.changeChoreStatusBy_id(id);
    }

    // Display a new page
    public void newPage() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"); // Add more line breaks if needed
    }
}
