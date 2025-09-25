
package TarjetaClienteBanco;


public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, String fechaVencimiento) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public String getNumero() { return numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public Cliente getCliente() { return cliente; }
    public Banco getBanco() { return banco; }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this); 
        }
    }

    public void setBanco(Banco banco) {
        this.banco = banco; 
    }
    
    @Override
    public String toString() {
        return "TarjetaDeCredito{" +  "numero='" + numero + '\'' +", fechaVencimiento='" + fechaVencimiento + '\'' + ", cliente=" + (cliente != null ? cliente.getNombre() : "null") + ", banco=" + (banco != null ? banco.getNombre() : "null") + '}';
    }
}
