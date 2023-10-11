package edu.houseHolder.schoolproject.Application;

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

    @Autowired
    public MessageMenuBackend(JSONKafkaProducer kafkaProducer, UserRepository userRepository) {
        this.kafkaProducer = kafkaProducer;
        this.userRepository = userRepository;
    }

    public void sendMessage(String holder, String notification, String doer) {
        User user = new User();
        user.setHolder(holder);
        user.setNotification(notification);
        user.setDoer(doer);

        kafkaProducer.sendMessage(user);

        // Save the user document in MongoDB
        userRepository.save(user);

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
}
