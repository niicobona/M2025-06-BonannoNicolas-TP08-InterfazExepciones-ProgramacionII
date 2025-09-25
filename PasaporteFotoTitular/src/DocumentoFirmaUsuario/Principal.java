
package DocumentoFirmaUsuario;


public class Principal {
    public static void main(String[] args) {
        Usuario u = new Usuario("Nicolas Bonanno", "NicoBona@gmail.com");
        FirmaDigital f = new FirmaDigital("ABC123HASH", "2025-09-25", u);
        Documento d = new Documento("Contrato", "Contenido del contrato...", f);

        System.out.println(u);
        System.out.println(f);
        System.out.println(d);
    }
}
