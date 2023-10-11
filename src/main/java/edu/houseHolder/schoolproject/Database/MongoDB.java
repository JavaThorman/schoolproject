package edu.houseHolder.schoolproject.Database;

import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MongoDB {

    @Bean
    public MongoClient mongoClient() {
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017");
        return MongoClients.create(connectionString);
    }

    @Bean
    public MongoDatabase mongoDatabase() {
        return mongoClient().getDatabase("houseHolder");
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        MongoClient mongoClient = mongoClient();
        SimpleMongoClientDatabaseFactory databaseFactory = new SimpleMongoClientDatabaseFactory(mongoClient, "houseHolder");
        return new MongoTemplate(databaseFactory);
    }
}
