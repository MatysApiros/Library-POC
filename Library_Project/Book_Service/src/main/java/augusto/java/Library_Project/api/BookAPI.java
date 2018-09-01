package augusto.java.Library_Project.api;

import augusto.java.Library_Project.input.BookInput;
import augusto.java.Library_Project.mapper.BookMapper;
import augusto.java.Library_Project.output.BookOutput;
import augusto.java.Library_Project.service.BookService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookAPI {

    private BookService bookService;
    private ObjectMapper objectMapper;

    public BookAPI(BookService bookService, ObjectMapper objectMapper) {
        this.bookService = bookService;
        this.objectMapper = objectMapper;
    }

    @GetMapping("/list")
    public ResponseEntity<?> listAllBooks() {
        return ResponseEntity.ok(bookService.ListAllBooks()
                .stream().map(book -> objectMapper.convertValue(book, BookOutput.class)));
    }

    @RequestMapping("/remove")
    public ResponseEntity<?> deleteBook(@RequestParam("title") String title) {
        return ResponseEntity.ok(bookService.deleteBook(title));
    }

    @RequestMapping("/insert")
    public ResponseEntity<?> addBook(@RequestParam("title") String title, @RequestParam("author") String author, @RequestParam("genre") String genre) {
        BookInput bookInput = new BookInput();
        bookInput.setTitle(title);
        bookInput.setAuthor(author);
        bookInput.setGenre(genre);
        bookService.insertBook(BookMapper.map(bookInput));
        return ResponseEntity.ok("Anexado.");
    }

    @GetMapping("/find")
    public ResponseEntity<?> findBook(@RequestParam("title") String title) {
        return ResponseEntity.ok(objectMapper.convertValue(bookService.findBookByTitle(title), BookOutput.class));
    }
}
