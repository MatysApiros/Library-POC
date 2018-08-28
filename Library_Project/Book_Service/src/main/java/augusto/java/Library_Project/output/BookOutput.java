package augusto.java.Library_Project.output;

public class BookOutput {
    private String title;
    private String author;
    private String genre;

    public BookOutput(String titulo, String autor, String genero) {
        this.title = titulo;
        this.author = autor;
        this.genre = genero;
    }

    public BookOutput() {

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
        return "Titulo: " + title + " Genero: " + genre + " Autor: " + author;
    }
}
