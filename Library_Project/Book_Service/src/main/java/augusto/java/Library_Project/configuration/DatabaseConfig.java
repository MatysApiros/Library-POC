package augusto.java.Library_Project.configuration;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

    @Bean
    public MongoCollection<Document> mongoClient() {
        return new MongoClient().getDatabase("BookDB").getCollection("BookDB");
    }
}
