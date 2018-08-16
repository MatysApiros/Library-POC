package augusto.java.Library_Project.repository;

import augusto.java.Library_Project.dto.Book;
import com.mongodb.client.MongoCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.bson.Document;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class BookRepository {

    private MongoCollection<Document> mongoCollection;

    @Autowired
    public BookRepository(MongoCollection<Document> mongoCollection){
        this.mongoCollection = mongoCollection;
    }

    public List<Book> listAllBooks(){
        List<Document> listBooks = mongoCollection.find().into(new ArrayList<Document>());

        return listBooks.stream()
                .map(books -> new Book(books.getInteger("id"), books.getString("title"), books.getString("author"), books.getString("genre")))
                .collect(Collectors.toList());
    }


    
}
