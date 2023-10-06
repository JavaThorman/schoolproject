package edu.houseHolder.schoolproject.Config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class TopicConfig {

    @Bean
    public NewTopic userTopic() {
        return TopicBuilder.name("user-update-notifications")
                .build();
    }

    @Bean
    public NewTopic userJsonTopic() {
        return TopicBuilder.name("user-update-notifications_json")
                .build();
    }
}