package edu.houseHolder.schoolproject.Database;

import edu.houseHolder.schoolproject.payload.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {


}
