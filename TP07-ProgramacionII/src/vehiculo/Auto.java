
package vehiculo;


public class Auto extends Vehiculo {
    
    private int cantidadDePuertas;

    public Auto(int cantidadDePuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadDePuertas = cantidadDePuertas;
    }
        
    @Override
    public void mostrarInfo(){
        System.out.println("Auto:" + super.getMarca() + ", Modelo:" + super.getModelo() + ", Puertas:" + cantidadDePuertas + " puertas.");
    }

}
