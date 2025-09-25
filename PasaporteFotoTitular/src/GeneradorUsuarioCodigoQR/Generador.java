
package GeneradorUsuarioCodigoQR;


public class Generador {
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("QR generado: " + qr);
    }
}
