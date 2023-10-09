package ejemplos;

import java.util.Scanner;

public class PalabraAnalizada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, introduce una palabra:");
        String palabra = sc.next();
        sc.close();

        // Reversa la palabra
        String palabraReversa = new StringBuilder(palabra).reverse().toString();

        // Cuenta el número de letras en la palabra
        int numLetras = palabra.length();

        // Elimina las vocales de la palabra
        String palabraSinVocales = palabra.replaceAll("[aeiouAEIOU]", "");

        // Muestra los resultados
        System.out.println("La palabra del revés es: " + palabraReversa);
        System.out.println("El número de letras que tiene la palabra es: " + numLetras);
        System.out.println("La palabra sin sus vocales es: " + palabraSinVocales);
    }
}
