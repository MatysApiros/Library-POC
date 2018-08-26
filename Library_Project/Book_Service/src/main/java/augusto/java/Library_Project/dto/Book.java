package augusto.java.Library_Project.dto;

public class Book {

    private int id;
    private String title;
    private String author;
    private String genre;

    public Book(int id, String titulo, String autor, String genero) {
        this.id = id;
        this.title = titulo;
        this.author = autor;
        this.genre = genero;
    }

    public Book() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return title;
    }

    public void setTitulo(String titulo) {
        this.title = titulo;
    }

    public String getAutor() {
        return author;
    }

    public void setAutor(String autor) {
        this.author = autor;
    }

    public String getGenero() {
        return genre;
    }

    public void setGenero(String genero) {
        this.genre = genero;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Titulo: " + title + " Genero: " + genre + " Autor: " + author;
    }
}