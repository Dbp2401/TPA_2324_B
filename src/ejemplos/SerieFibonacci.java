package ejemplos;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SerieFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduce un número entero:");

        try {
            int limite = sc.nextInt(); // Lee el número del usuario
            mostrarFibonacciMenoresQue(limite);
        } catch (InputMismatchException e) {
            System.out.println("Lo siento, eso no es un número entero válido.");
        } finally {
            sc.close();
        }
    }

    public static void mostrarFibonacciMenoresQue(int limite) {
        int primero = 0, segundo = 1;

        System.out.println("Números de la serie de Fibonacci menores que " + limite + ":");

        if (limite >= primero) {
            System.out.print(primero);
            if (limite >= segundo) {
                System.out.print(", " + segundo);
            }
        }

        int siguiente = primero + segundo;

        while (siguiente < limite) {
            System.out.print(", " + siguiente);
            primero = segundo;
            segundo = siguiente;
            siguiente = primero + segundo;
        }
        System.out.println();  // Salto de línea al final
    }
}
