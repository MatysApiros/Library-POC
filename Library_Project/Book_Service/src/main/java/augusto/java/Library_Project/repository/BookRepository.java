package augusto.java.Library_Project.repository;

import augusto.java.Library_Project.dto.Book;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.mongodb.client.model.Filters.eq;

@Repository
public class BookRepository {

    private MongoCollection<Document> mongoCollection;

    public BookRepository(MongoCollection<Document> mongoCollection) {
        this.mongoCollection = mongoCollection;
    }

    public List<Book> listAllBooks() {
        List<Document> listBooks = mongoCollection.find().into(new ArrayList<Document>());

        return listBooks.stream()
                .map(books -> new Book(books.getString("title"), books.getString("author"), books.getString("genre")))
                .collect(Collectors.toList());
    }

    public void insertBook(Book book) {
        Document document = new Document("title",book.getTitulo())
                .append("author",book.getAutor()).append("genre",book.getGenero());

            mongoCollection.insertOne(document);
    }

    public Book findBookByTitle(String title) {
        return mongoCollection.find().first().get(title, Book.class);
    }

    public Boolean deleteBook(String title) {
        if (mongoCollection.find().first().get(title, Book.class) == null) {
            return false;
        } else {
            mongoCollection.deleteOne(eq("title", title));
            return true;
        }
    }

}