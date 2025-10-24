
package LecturaDeArchivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class LecturaDeArchivo {
    
    public static void main(String[] args) {
        
        Scanner rutaArchivo = new Scanner(System.in);
        System.out.print("Ruta del archivo de texto: ");
        String ruta = rutaArchivo.nextLine();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(ruta)); // aquí puede tirar FileNotFoundException
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe: " + ruta);
        } catch (IOException e) {
            System.out.println("Error leyendo el archivo.");
        } finally {
            try { if (br != null) br.close(); } catch (IOException ignored) {}
        }

    }
}
