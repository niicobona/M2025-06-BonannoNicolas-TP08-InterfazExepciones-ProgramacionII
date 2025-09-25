
package CelularBateriaUsuario;


public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Usuario usuario;
    private Bateria bateria;

    public Celular(String imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;

    }

    public String getImei() { return imei; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public Bateria getBateria() { return bateria; }
    public Usuario getUsuario() { return usuario; }
    
   public void setBateria(Bateria bateria) {
        this.bateria = bateria; 
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }
    
    @Override
    public String toString() {
        return "Celular{" +"imei='" + imei + '\'' + ", marca='" + marca + '\'' + ", modelo='" + modelo + '\'' +", bateria=" + bateria +", usuario=" + (usuario != null ? usuario.getNombre() : "null") +'}';
    }    
    
}
