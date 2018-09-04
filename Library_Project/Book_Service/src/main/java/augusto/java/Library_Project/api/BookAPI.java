package augusto.java.Library_Project.api;

import augusto.java.Library_Project.dto.Book;
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

    @DeleteMapping("/remove")
    public ResponseEntity<?> deleteBook(@RequestBody BookInput bookInput) {
        return ResponseEntity.ok(bookService.deleteBook(bookInput.getTitle()));
    }

    @PostMapping("/insert")
    public ResponseEntity<?> addBook(@RequestBody BookInput bookInput) {
        return ResponseEntity.ok(bookService.insertBook(BookMapper.map(bookInput)));
    }

    @GetMapping("/find/{title}")
    public ResponseEntity<?> findBook(@PathVariable("title") String title) {
        return ResponseEntity.ok(objectMapper.convertValue(bookService.findBookByTitle(title), BookOutput.class));
    }
}
