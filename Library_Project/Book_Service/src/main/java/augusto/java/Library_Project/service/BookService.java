package augusto.java.Library_Project.service;

import augusto.java.Library_Project.dto.Book;
import augusto.java.Library_Project.repository.BookRepository;

import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public List<Book> addBook(){
        return bookRepository.listAllBooks();
    }
}
