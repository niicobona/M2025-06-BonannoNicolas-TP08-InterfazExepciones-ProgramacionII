
package empleados;


public abstract class Empleado {
    
    private double sueldoBase;

    public Empleado(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getSueldoBase() {  return sueldoBase; }
    
    public abstract void mostrarSueldoFinal ();
    public abstract double calcularSueldo();
}
