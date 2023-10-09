// FileNotFoundException
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// IOException
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Excepciones {

    public static void main(String[] args) {

        // ArithmeticException`
        // Lanzada cuando ocurre una excepción aritmética, como la división por cero.
        try {
            int result = 10 / 0;
            System.out.println("Resultado: " + result);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero.");
            System.out.println("Mensaje: " + e.getMessage());
            System.out.println("ToString: " + e.toString());

        }

        // NullPointerException
        // Lanzada cuando se intenta acceder a un método o propiedad de un objeto nulo.
        String str = null;
        try {
            int length = str.length();
            System.out.println("Longitud de la cadena: " + length);
        } catch (NullPointerException e) {
            System.out.println("El objeto es nulo.");
            System.out.println("Mensaje: " + e.getMessage());
            System.out.println("ToString: " + e.toString());
        }

        // ArrayIndexOutOfBoundsException
        // Lanzada cuando se intenta acceder a un índice de arreglo que no existe.
        int[] array = {1, 2, 3};
        try {
            int value = array[5];
            System.out.println("Valor: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice del arreglo fuera de límites.");
            System.out.println("Mensaje: " + e.getMessage());
            System.out.println("ToString: " + e.toString());
        }

        // NumberFormatException
        // Lanzada cuando intentamos convertir una cadena en un tipo numérico, pero la cadena no tiene el formato correcto.
        try {
            int number = Integer.parseInt("XYZ");
            System.out.println("Número: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Formato numérico inválido.");
            System.out.println("Mensaje: " + e.getMessage());
            System.out.println("ToString: " + e.toString());
        }

        // FileNotFoundException
        // Lanzada cuando no se encuentra un archivo especificado. Es importante notar que esta excepción es verificada, por lo que es necesario manejarla o declararla en la firma del método con `throws`.
        try {
            Scanner scanner = new Scanner(new File("archivo_inexistente.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado.");
            System.out.println("Mensaje: " + e.getMessage());
            System.out.println("ToString: " + e.toString());
        }

        // IOException
        // Una excepción general para errores de entrada/salida. También es una excepción verificada.
        try {
            BufferedReader reader = new BufferedReader(new FileReader("somefile.txt"));
            String line = reader.readLine();
            System.out.println("Línea leída: " + line);
        } catch (IOException e) {
            System.out.println("Error de IO: " + e.getMessage());
            System.out.println("Mensaje: " + e.getMessage());
            System.out.println("ToString: " + e.toString());
            System.out.println("printStackTrace:");
            e.printStackTrace(System.out);
        }
    }
}
*/