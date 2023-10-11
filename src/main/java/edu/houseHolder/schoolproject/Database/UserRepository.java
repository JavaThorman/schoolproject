package edu.houseHolder.schoolproject.Database;

import edu.houseHolder.schoolproject.payload.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {

    List<User> findByHolder(String holder);

    List<User> findByNotification(String notification);

    List<User> findByDoer(String doer);

    List<User> findByHolderAndNotification(String holder, String notification);

    // Custom query methods
    List<User> findByHolderAndDoer(String holder, String doer);

    List<User> findByNotificationAndDoer(String notification, String doer);

    List<User> findByHolderAndNotificationAndDoer(String holder, String notification, String doer);
}
