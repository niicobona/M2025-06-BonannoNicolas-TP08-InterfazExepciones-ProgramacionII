
package CuentaBancariaTitularClave;

public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public CuentaBancaria getCuentaBancaria() { return cuentaBancaria; }

    public void setCuentaBancaria(CuentaBancaria cuenta) {
        this.cuentaBancaria = cuenta;
        if (cuenta != null && cuenta.getTitular() != this) {
            cuenta.setTitular(this);
        }
    }

    @Override
    public String toString() {
        return "Titular{" + "nombre='" + nombre + '\'' +", dni='" + dni + '\'' +", cuentaBancaria=" + (cuentaBancaria != null ? cuentaBancaria.getCbu() : "null") + '}';
    }
}
