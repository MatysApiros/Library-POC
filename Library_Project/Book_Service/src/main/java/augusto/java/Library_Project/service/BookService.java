package augusto.java.Library_Project.service;

import augusto.java.Library_Project.dto.Book;
import augusto.java.Library_Project.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> ListAllBooks() {
        return bookRepository.listAllBooks();
    }

    public Boolean insertBook(Book book) {
        if (book == null) {
            return false;
        } else {
            bookRepository.insertBook(book);
            return true;
        }
    }

    public Book findBookByTitle(String title) {
        Book book = bookRepository.findBookByTitle(title);
        if (book == null)
            throw new NullPointerException("Livro nao encontrado.");
        else
            return book;
    }

    public String deleteBook(String title) {
        Book book = findBookByTitle(title);

        if (book == null) {
            throw new NullPointerException("Livro nao existe no banco de dados.");
        } else {
            bookRepository.deleteBook(title);
            return "Livro deletado";
        }
    }
}
