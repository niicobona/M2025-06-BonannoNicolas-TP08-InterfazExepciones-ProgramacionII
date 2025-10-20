
package animales;


public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {  return nombre;}
    
    public abstract String hacerSonido();
    
    public void describirAnimal(){
        System.out.println("Este animal es un: " + getNombre() +
                           " y su sonido es: " + hacerSonido());
    }
      
    
}
