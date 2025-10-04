
package BibliotecaLibros;


public class Principal {
public static void main(String[] args) {
    
    
   Autor a1 = new Autor("1234", "J.K.Rowling", "Britanica");
   Autor a2 = new Autor("5678", "J. R. R. Tolkien", "Britanica");
   Autor a3 = new Autor("8901", "George R. R. Martin","Estadounidense");
   Biblioteca b1 = new Biblioteca("Mundo Libro");
   
   
   //AGREGAR LIBROS A LA BIBLIOTECA
    
   b1.agregarLibro("ABC456", "Harry Potter y La Piedra Filosofal", 1997, a1);
   b1.agregarLibro("JKL789", "El Hobbit", 1937, a2);
   b1.agregarLibro("QWE123", "Cancion de hielo y fuego", 1996, a3);
   b1.agregarLibro("ABC457", "Harry Potter y La Camara Secreta", 1998, a1);
   b1.agregarLibro("ABC458", "Harry Potter y el Prisionero de Azkaban", 1998, a1);
   
  
   //LISTAR LIBROS
    System.out.println("");
   System.out.println("-------- Listar libros --------");
   b1.listarLibros();
   
   //BUSCAR LIBRO POR ISBN
   System.out.println("");
   System.out.println("-------- Buscar libro (ISBN) --------");
   System.out.println(b1.buscarLibroPorIsbn("QWE123"));
   
     //FILTRAR LIBROS POR ANIO.
     System.out.println("");
    System.out.println("-------- Filtrar libros por anio --------");
    System.out.println(b1.filtrarLibrosPorAnio(1998).toString());
   
    
   //ELIMINAR LIBRO POR ISBN
   System.out.println("");
   System.out.println("-------- Eliminar libro (ISBN) --------");
   b1.eliminarLibro("sdjghve324");
   b1.eliminarLibro("ABC456");
   b1.listarLibros();
   
   //CANTIDAD TOTAL DE LIBROS.
   System.out.println("");
   System.out.println("-------- Cantidad libros --------");
   System.out.println(b1.obtenerCantidadLibros());
    

    //MOSTRAR AUTORES DISPONIBLES.
    System.out.println("");
    System.out.println("-------- Mostrar Autores disponibles --------");
    b1.mostrarAutoresDisponibles();
}
}
