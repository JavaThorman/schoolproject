    package edu.houseHolder.schoolproject.Database;

    import edu.houseHolder.schoolproject.payload.User;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.data.mongodb.core.MongoTemplate;
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
                mongoTemplate.insert(user, "chores");
            } catch (Exception e) {
                // Handle the exception as needed, e.g., log it
                e.printStackTrace();
            }
        }
    }
