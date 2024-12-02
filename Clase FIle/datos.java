import java.io.*;
import java.util.Scanner;

public class datos {

    public static void main(String[] args) {
        // Declarar las variables necesarias
        FileWriter archivo = null;
        PrintWriter escribir = null;
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Especificar la ruta del archivo
            archivo = new FileWriter("datos2.txt");
            escribir = new PrintWriter(archivo);

            // Pedir al usuario ingresar datos
            System.out.println("Escriba en la primera línea el nombre de la asignatura:");
            String asignatura = scanner.nextLine();

            System.out.println("Escriba en la segunda línea su nombre:");
            String nombre = scanner.nextLine();

            // Escribir los datos ingresados por el usuario en el archivo
            escribir.println(asignatura);
            escribir.println(nombre);
            
            System.out.println("Archivo creado y datos escritos correctamente.");

        } catch (IOException e) {
            System.out.println("Ocurrió un problema al crear su archivo.");
            e.printStackTrace();
        } finally {
            // Cerrar el archivo si fue creado correctamente
            if (escribir != null) {
                escribir.close();
            }
            scanner.close();
        }
    }
}
