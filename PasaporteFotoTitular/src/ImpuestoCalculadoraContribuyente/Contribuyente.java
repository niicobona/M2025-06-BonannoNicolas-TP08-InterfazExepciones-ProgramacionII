
package ImpuestoCalculadoraContribuyente;


public class Contribuyente {
    private String nombre;
    private String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    public String getNombre() { return nombre; }
    public String getCuil() { return cuil; }

    @Override
    public String toString() {
        return "Contribuyente{" + "nombre='" + nombre + '\'' + ", cuil='" + cuil + '\'' + '}';
    }
}
