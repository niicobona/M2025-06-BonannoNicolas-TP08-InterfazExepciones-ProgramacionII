
package figurasGeometricas;

import java.util.ArrayList;
import java.util.List;


public class Principal {
    public static void main(String[] args) {
        List <Figura> figuras = new ArrayList <>();
      
        figuras.add(new Rectangulo(8,4,"Rectangulo"));
        figuras.add(new Circulo(5.4, "Circulo"));
        
        for(Figura f : figuras){
            f.mostrarArea();
        }
        
    }
}
