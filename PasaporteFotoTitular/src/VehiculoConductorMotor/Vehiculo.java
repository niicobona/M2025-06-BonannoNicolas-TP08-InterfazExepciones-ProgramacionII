
package VehiculoConductorMotor;


public class Vehiculo {
    private String patente;
    private String modelo;
    private Conductor conductor;
    private Motor motor;         

    public Vehiculo(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
    }

    public String getPatente() { return patente; }
    public String getModelo() { return modelo; }
    public Conductor getConductor() { return conductor; }
    public Motor getMotor() { return motor; }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this); 
        }
    }

    public void setMotor(Motor motor) {
        this.motor = motor; 
    }
    @Override
    public String toString() {
        return "Vehiculo{" +"patente='" + patente + '\'' + ", modelo='" + modelo + '\'' +", conductor=" + (conductor != null ? conductor.getNombre() : "null") +", motor=" + (motor != null ? motor.toString() : "null") +'}';
    }
}
