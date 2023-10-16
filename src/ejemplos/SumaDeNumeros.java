package ejemplos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SumaDeNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numeros = new ArrayList<>();

        System.out.println("Introduce números de tipo double. Introduce un número negativo o una letra para terminar.");

        while (true) {
            try {
                System.out.print("Introduce un número: ");
                double numero = sc.nextDouble();

                // Si el usuario introduce un número negativo, terminamos la recopilación de datos.
                if (numero < 0) {
                    break;
                }

                numeros.add(numero);  // Agrega el número al ArrayList
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Finalizando la recopilación de datos.");
                break;  // Termina el bucle si la entrada no es un número
            } finally {
                sc.nextLine();  // Limpia el buffer del Scanner
            }
        }

        // Calcula y muestra la suma de los números
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }

        System.out.println("La suma de los números introducidos es: " + suma);

        sc.close();
    }
}
