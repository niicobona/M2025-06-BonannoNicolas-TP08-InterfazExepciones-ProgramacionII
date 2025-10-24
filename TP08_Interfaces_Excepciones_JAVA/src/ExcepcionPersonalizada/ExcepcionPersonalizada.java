
package ExcepcionPersonalizada;

import java.util.Scanner;

public class ExcepcionPersonalizada {
    
      static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad invalida: " + edad + ". Debe estar entre 0 y 120.");
        }
        
         }
      
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        try {
            validarEdad(edad);
            System.out.println("Edad valida!");
        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        }

    }
    
}
