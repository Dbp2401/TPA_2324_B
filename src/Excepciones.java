// FileNotFoundException
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
// IOException
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Excepciones {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        // ArithmeticException
        // Lanzada cuando ocurre una excepción aritmética, como la división por cero.

        int result = 10 / 0;
        System.out.println("Resultado: " + result);

        // NullPointerException
        // Lanzada cuando se intenta acceder a un método o propiedad de un objeto nulo.

        String str = null;
        int length = str.length();
        System.out.println("Longitud de la cadena: " + length);

        // ArrayIndexOutOfBoundsException
        // Lanzada cuando se intenta acceder a un índice de arreglo que no existe.
        int[] array = {1, 2, 3};
        int value = array[5];
        System.out.println("Valor: " + value);

        // NumberFormatException
        // Lanzada cuando intentamos convertir una cadena en un tipo numérico, pero la cadena no tiene el formato correcto.
        int number = Integer.parseInt("XYZ");
        System.out.println("Número: " + number);

        // FileNotFoundException
        // Lanzada cuando no se encuentra un archivo especificado. Es importante notar que esta excepción es verificada, por lo que es necesario manejarla o declararla en la firma del método con `throws`.        
        Scanner scanner = new Scanner(new File("archivo_inexistente.txt"));

        // IOException
        // Una excepción general para errores de entrada/salida. También es una excepción verificada.        
        BufferedReader reader = new BufferedReader(new FileReader("somefile.txt"));
        String line = reader.readLine();
        System.out.println("Línea leída: " + line);
    }
}