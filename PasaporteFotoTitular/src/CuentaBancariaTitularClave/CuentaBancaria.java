
package CuentaBancariaTitularClave;


public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad claveSeguridad) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = claveSeguridad;
    }

    public String getCbu() { return cbu; }
    public double getSaldo() { return saldo; }
    public ClaveSeguridad getClaveSeguridad() { return claveSeguridad; }
    public Titular getTitular() { return titular; }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "cbu='" + cbu + '\'' +  ", saldo=" + saldo + ", claveSeguridad=" + (claveSeguridad != null ? claveSeguridad.toString() : "null") +  ", titular=" + (titular != null ? titular.toString() : "null") +'}';
    }
}
