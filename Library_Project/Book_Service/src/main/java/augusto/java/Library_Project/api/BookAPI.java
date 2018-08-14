package augusto.java.Library_Project.api;

import augusto.java.Library_Project.dto.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
@RestController
@RequestMapping("/books")
public class BookAPI {



    @GetMapping
    public void getBook(){
    }

}
