
package GeneradorUsuarioCodigoQR;


public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() { return valor;}

    public Usuario getUsuario() {return usuario; }

    @Override
    public String toString() {
        return "CodigoQR{" + "valor='" + valor + '\'' + ", usuario=" + (usuario != null ? usuario.toString() : "null") + '}';
    }
}
