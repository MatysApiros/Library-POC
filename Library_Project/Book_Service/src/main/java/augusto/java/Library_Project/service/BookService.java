package augusto.java.Library_Project.service;

import augusto.java.Library_Project.dto.Book;
import augusto.java.Library_Project.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> ListAllBooks(){
        return bookRepository.listAllBooks();
    }
}
