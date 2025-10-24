
package TryWithResources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class TryWithResources {
    
     public static void main(String[] args) {
        Scanner rutaArchivo = new Scanner(System.in);
        System.out.print("Ruta del archivo a leer: ");
        String ruta = rutaArchivo.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) { 
            System.out.println("No se pudo leer el archivo: " + e.getMessage());
        }

    }
}
