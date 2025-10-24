
package Sistema_ECommers;


public class Cliente implements Notificable {
    private String nombre;
    private String email;
   

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email; 
    }

    public String getEmail() {
        return email;
    }
    
    
    @Override
    public void notCambio(String mensaje) {
        System.out.println("Notificacion a " +this.nombre + ", " +this.email + ", " + mensaje+ ".");
    }
    
}
