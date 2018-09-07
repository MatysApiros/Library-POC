package augusto.java.Library_Project.repository;

import augusto.java.Library_Project.entity.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserEntity, String> {

}