
package VehiculoConductorMotor;


public class Principal {
    public static void main(String[] args) {
        Motor m = new Motor("V8", "M-98765");
        Conductor c = new Conductor("Nicolas Bonanno", "LIC-12345");
        Vehiculo v = new Vehiculo("ABC123", "Ford Mustang");

        v.setMotor(m);    
        v.setConductor(c); 

        System.out.println(m);
        System.out.println(c);
        System.out.println(v);
    }
}
