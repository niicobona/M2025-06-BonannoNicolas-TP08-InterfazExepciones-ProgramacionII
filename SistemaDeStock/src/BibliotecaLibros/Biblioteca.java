
package BibliotecaLibros;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
   private String nombre;
   private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() { return nombre;}
   
   public void  agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor){
    libros.add(new Libro(isbn,titulo,anioPublicacion,autor ));
   }
   
   public void listarLibros(){
       for(Libro l : libros){
           System.out.println("-------------------------------------");
           l.mostrarInfo();
           
       }
   }
   
   public Libro buscarLibroPorIsbn(String isbn){
        int i = 0;
        Libro libroIsbn = null;
        while (i < libros.size() && !this.libros.get(i).getIsbn().equals(isbn)) {
            i++;
        }
        if (i < libros.size()) {
            libroIsbn = this.libros.get(i);
            return libroIsbn;
        } 
        System.out.println("El producto con ese ISBN no existe en la Biblioteca.");
        return libroIsbn;
       
   }
   
   public void eliminarLibro(String isbn){
       Libro eliminarLibro = buscarLibroPorIsbn(isbn);
       if (eliminarLibro != null){
       libros.remove(eliminarLibro);
       System.out.println("Libro eliminado con exito.");
       
       } else {
           System.out.println("No se encontro un libro con el ISBN: " + isbn);
           System.out.println("-------------------------------------");
       }
   }
   
   public int obtenerCantidadLibros(){
       int cant = 0;
       for (Libro l : libros){
            cant ++;
       }
    return cant;    
   }
   
   public List<Libro> filtrarLibrosPorAnio(int anio){    
        List<Libro> librosAnio = new ArrayList<>();
        for (Libro l : libros){
           if (l.getAnioPublicacion() == anio){
               librosAnio.add(l);
           } 
        }
        
        return librosAnio;
   }
   

   
   public  void mostrarAutoresDisponibles(){
        List<String> idAutor = new ArrayList<>();
        for (Libro l : libros) {
        Autor a = l.getAutor();
        if (a != null && a.getId() != null ){
            String id = a.getId();
            if (!idAutor.contains(id)) { 
                 idAutor.add(id);
                 System.out.println(a.getNombre());
                 }
         }
   }
}
   
}
