
package animales;


public class Gato extends Animal {
    
    public Gato(String nombre) {
        super(nombre);
    }
    
    @Override
       public String hacerSonido(){
        return "Miauuuu!!!";
    }



}
