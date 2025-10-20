
package empleados;

import java.util.ArrayList;
import java.util.List;


public class Principal {
    public static void main(String[] args) {
        
        List<Empleado> empleados = new ArrayList<>();    
        
       empleados.add(new EmpleadoPlanta(1000, 1500));
       empleados.add(new EmpleadoPlanta(1000, 500));
       empleados.add(new EmpleadoPlanta(1000, 1500));
       empleados.add(new EmpleadoPlanta(1000, 500));
       
       for(Empleado e : empleados){
           if ( e instanceof EmpleadoPlanta){
               e.mostrarSueldoFinal();
           } else if  (e instanceof EmpleadoTemporal){ 
             e.mostrarSueldoFinal();
           }
       }
        
    }
}
