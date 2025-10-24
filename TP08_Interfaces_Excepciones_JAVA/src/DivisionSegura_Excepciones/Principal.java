
package DivisionSegura_Excepciones;

import java.util.Scanner;


public class Principal {
       
        public static void main(String[] args) {
        Scanner solicitarNumero = new Scanner(System.in);

        System.out.print("Ingresa el numerador: ");
        int a = solicitarNumero.nextInt();

        System.out.print("Ingresa el denominador: ");
        int b = solicitarNumero.nextInt();

        try {
            int resultado = a / b; 
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
        }
 
    }

}
