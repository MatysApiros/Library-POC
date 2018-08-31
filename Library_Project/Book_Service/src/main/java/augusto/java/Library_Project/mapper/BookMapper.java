package augusto.java.Library_Project.mapper;

import augusto.java.Library_Project.dto.Book;
import augusto.java.Library_Project.input.BookInput;

public class BookMapper {

    public static Book map(BookInput bookInput){
        Book book = new Book();
        book.setTitulo(bookInput.getTitle());
        book.setAutor(bookInput.getAuthor());
        book.setGenero(bookInput.getGenre());
        return book;
    }
}
