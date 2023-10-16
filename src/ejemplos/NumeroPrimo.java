package ejemplos;

import java.util.Scanner;
import java.util.InputMismatchException;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduce un número entero:");

        try {
            int numero = sc.nextInt(); // Lee el número del usuario
            if (esPrimo(numero)) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Lo siento, eso no es un número entero válido.");
        } finally {
            sc.close();
        }
    }

    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false; // Los números menores o iguales a 1 no son primos
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // Si el número es divisible por algún número menor que él mismo (excluyendo el
                // 1), no es primo
            }
        }
        return true; // Si pasa todas las comprobaciones, es primo
    }
}
