
package empleados;


public class EmpleadoPlanta extends Empleado {
    private double sueldoEmpP;
    
    public EmpleadoPlanta(double sueldoBase, double sueldoEmpP) {
        super(sueldoBase);
        this.sueldoEmpP = sueldoEmpP;
    }

    
    @Override
    public double calcularSueldo() {
       return getSueldoBase() + sueldoEmpP;
    }

    @Override
    public void mostrarSueldoFinal() {
        System.out.println("Empleado de planta, sueldo: " + calcularSueldo());
    }


    
    
}
