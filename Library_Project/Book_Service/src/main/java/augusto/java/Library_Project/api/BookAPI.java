package augusto.java.Library_Project.api;

import augusto.java.Library_Project.dto.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
@RequestMapping("/books")
public class BookAPI {



    @GetMapping("/list")
    public void listAllBooks(){

    }

    @DeleteMapping("/remove/{title}")
    public void deleteBook(){

    }

    @PostMapping("/insert")
    public void addBook(){

    }

    @GetMapping("/find/{title}")
    public void findBook(){

    }
}
