
package empleados;


public class EmpleadoTemporal extends Empleado{
    private double sueldoEmpT;
    public EmpleadoTemporal(double sueldoBase, double sueldoEmpT) {
        super(sueldoBase);
        this.sueldoEmpT = sueldoEmpT;
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBase() + sueldoEmpT;
    }
        @Override
    public void mostrarSueldoFinal() {
        System.out.println("Empleado Temporal, sueldo: " + calcularSueldo());
    }

}
