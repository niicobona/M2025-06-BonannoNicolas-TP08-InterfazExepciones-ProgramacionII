
package animales;

import java.util.ArrayList;
import java.util.List;


public class Principal {
        public static void main(String[] args) {
            
         List<Animal>animales = new ArrayList<>();
         
         animales.add(new Gato ("Gato"));
         animales.add(new Gato ("Gato2"));
         animales.add(new Perro ("Perro"));
         animales.add(new Vaca ("Vaca"));
         animales.add(new Perro ("Perro2"));
         
         for (Animal a : animales){
             a.describirAnimal();
         }
    }
}
