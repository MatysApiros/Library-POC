package augusto.java.Library_Project.repository;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    private MongoCollection<Document> mongoCollection;

    public UserRepository(MongoCollection<Document> mongoCollection) {
        this.mongoCollection = mongoCollection;
    }
}
