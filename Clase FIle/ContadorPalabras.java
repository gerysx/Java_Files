import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ContadorPalabras {

    public static void main(String[] args) {
        // Ruta del archivo a leer
        String rutaArchivo = "datos.txt"; // Cambia esta ruta según tu archivo

        File archivo = new File(rutaArchivo);
        int contadorPalabras = 0;

        try (Scanner scanner = new Scanner(archivo)) {
            // Leer el archivo y contar palabras en una sola línea
            while (scanner.hasNext()) {
                // Cada "siguiente" token se cuenta como una palabra
                scanner.next();
                contadorPalabras++;
            }

            // Mostrar el número total de palabras
            System.out.println("El archivo tiene " + contadorPalabras + " palabras.");

        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo: " + rutaArchivo);
        }
    }
}
