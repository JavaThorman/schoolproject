package edu.houseHolder.schoolproject.Database;

import edu.houseHolder.schoolproject.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class MongoDBHandler {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public MongoDBHandler(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void storeMessage(User user) {
        try {
            String newId = generateNewId("chores");
            user.setId(newId);

            // Store the user document in the "chores" collection.
            mongoTemplate.save(user, "chores");
        } catch (Exception e) {
            // Handle the exception as needed, e.g., log it
            e.printStackTrace();
        }
    }

    public String generateNewId(String collectionName) {
        int documentCount = getDocumentCount(collectionName);
        // Create a new string ID based on the document count
        return "" + (documentCount + 1);
    }

    public int getDocumentCount(String collectionName) {
        // Query to count all documents in the specified collection
        long count = mongoTemplate.count(new Query(), User.class, collectionName);
        return (int) count;
    }

    public User getDocumentBy_id(String id) {
        // Create a query to find the chore by _id
        Query query = new Query(Criteria.where("_id").is(id));

        // Retrieve the chore from MongoDB
        return mongoTemplate.findOne(query, User.class);
    }

    public void changeChoreStatusBy_id(String choreId) {
        // Create a query to find the chore by _id
        Query query = new Query(Criteria.where("_id").is(choreId));

        // Retrieve the chore from MongoDB
        User chore = mongoTemplate.findOne(query, User.class);

        if (chore != null) {
            // Check if the chore is not done (status is false)
            if (!chore.getStatus()) {
                // Set the status to true (chore is done)
                chore.setStatus(true);

                // Create an update to set the status field to true
                Update update = new Update();
                update.set("status", true);

                // Update the chore in MongoDB
                mongoTemplate.updateFirst(query, update, User.class);

                System.out.println("Chore status changed to 'done' with _id: " + choreId);
            } else {
                System.out.println("Chore with _id: " + choreId + " is already marked as 'done'.");
            }
        } else {
            System.out.println("Chore not found with _id: " + choreId);
        }
    }



}
