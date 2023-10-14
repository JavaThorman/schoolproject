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

    // Define a bean for creating a MongoDB client.
    @Bean
    public MongoClient mongoClient() {
        // Define the connection string for MongoDB (localhost and default port).
        ConnectionString connectionString = new ConnectionString("mongodb://localhost:27017");
        // Create and return a MongoDB client.
        return MongoClients.create(connectionString);
    }

    // Define a bean for accessing the MongoDB database.
    @Bean
    public MongoDatabase mongoDatabase() {
        // Get the MongoDB client from the previously defined bean.
        return mongoClient().getDatabase("houseHolder");
    }

    // Define a bean for creating a MongoTemplate to interact with MongoDB.
    @Bean
    public MongoTemplate mongoTemplate() {
        // Get the MongoDB client and database factory.
        MongoClient mongoClient = mongoClient();
        SimpleMongoClientDatabaseFactory databaseFactory = new SimpleMongoClientDatabaseFactory(mongoClient, "houseHolder");
        // Create and return a MongoTemplate for MongoDB interaction.
        return new MongoTemplate(databaseFactory);
    }
}
