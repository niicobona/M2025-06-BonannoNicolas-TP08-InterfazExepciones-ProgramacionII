
package ConversionCadenaNumero;

import java.util.Scanner;


public class Conversion {
    
    public static void main(String[] args) {
        Scanner solicitarCadena = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        String texto = solicitarCadena.nextLine();

        try {
            int numero = Integer.parseInt(texto); 
            System.out.println("El doble es: " + (numero * 2));
        } catch (NumberFormatException e) {
            System.out.println("El texto ingresado no es un entero valido.");
        }

    }
}
