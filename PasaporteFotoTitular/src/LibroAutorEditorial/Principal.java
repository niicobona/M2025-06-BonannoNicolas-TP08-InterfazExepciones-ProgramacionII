
package LibroAutorEditorial;


public class Principal {
    
    public static void main(String[] args) {
        Autor a = new Autor("J.k.Rowling", "Inglesa");
        Editorial e = new Editorial("Salamandra", "España");

        Libro l = new Libro("Harry Potter Y La Piedra Filosofal", "978-84-376-0494-7");
        l.setAutor(a);        
        l.setEditorial(e);    

        System.out.println(a);
        System.out.println(e);
        System.out.println(l);
    }
}
