
package LibroAutorEditorial;


public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn) {
        this.titulo = titulo;
        this.isbn = isbn;
        
    }
    
    public String getTitulo() { return titulo; }
    public String getIsbn() { return isbn; }
    public Autor getAutor() { return autor; }
    public Editorial getEditorial() { return editorial; }
    
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    @Override
    public String toString() {
        return "Libro{" + "titulo='" + titulo + '\'' +", isbn='" + isbn + '\'' +", autor=" + (autor != null ? autor.getNombre() : "null") +", editorial=" + (editorial != null ? editorial.getNombre() : "null") + '}';
    }
    
}
