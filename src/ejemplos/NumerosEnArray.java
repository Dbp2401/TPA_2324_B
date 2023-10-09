package ejemplos;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumerosEnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Introduce números enteros. Introduce 'x' para terminar.");

        while (true) {
            System.out.print("Introduce un número: ");
            if (sc.hasNextInt()) {
                int numero = sc.nextInt();
                numeros.add(numero);  // Agrega el número al ArrayList
            } else {
                String entrada = sc.next();
                if ("x".equalsIgnoreCase(entrada)) {
                    break;  // Termina el bucle si se introduce 'x'
                } else {
                    System.out.println("Entrada no válida. Usa un número entero o 'x' para salir.");
                }
            }
            sc.nextLine();  // Limpia el buffer del Scanner
        }

        // Imprime los números separados por comas
        System.out.print("Los números introducidos son: ");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i));
            if (i < numeros.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();  // Salto de línea al final

        sc.close();
    }
}
