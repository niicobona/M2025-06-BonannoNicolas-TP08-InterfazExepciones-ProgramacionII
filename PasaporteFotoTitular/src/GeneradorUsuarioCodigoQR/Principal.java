
package GeneradorUsuarioCodigoQR;


public class Principal {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Nicolas", "NicoBona@gmail.com");

        Generador generador = new Generador();
        generador.generar("ABC123", usuario);
    }
}
