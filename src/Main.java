import ejemplos.Circunferencia;
import ejemplos.PrimitivasVsEnvolventes;
import ejemplos.NumeroPrimo;
import ejemplos.SerieFibonacci;
import ejemplos.SumaDeNumeros;
import ejemplos.NumerosEnArray;
import ejemplos.NumerosEnArrayForEach;
import ejemplos.PalabraAnalizada;
import ejemplos.Coche;


// Clase con el método main
public class Main {

    // Clase interna Foo
    public static class HelloWorld {
        // Método que imprime "Hello, world!"
        public void sayHello() {
            System.out.println("Hello, world!");
        }
    }

    public static void main(String[] args) {
        // Crea un objeto de la clase HelloWorld
        HelloWorld helloWorld = new HelloWorld();

        // Llama al método sayHello del objeto myFoo
        helloWorld.sayHello();
        // Llama a los métodos main de los ejemplos

        System.out.print("\nCircunferencia\n\n");
        Circunferencia.main(args);

        System.out.print("\nPrimitivasVsEnvolventes\n\n");
        PrimitivasVsEnvolventes.main(args);

        System.out.print("\nNumeroPrimo\n\n");
        NumeroPrimo.main(args);

        System.out.print("\nSerieFibonacci\n\n");
        SerieFibonacci.main(args);

        System.out.print("\nSumaDeNumeros\n\n");
        SumaDeNumeros.main(args);

        System.out.print("\nNumerosEnArray\n\n");
        NumerosEnArray.main(args);

        System.out.print("\nNumerosEnArrayForEach\n\n");
        NumerosEnArrayForEach.main(args);

        System.out.print("\nPalabraAnalizada\n\n");
        PalabraAnalizada.main(args);

        System.out.print("\nCoche\n\n");
        creaUnCoche();

    }

    /*
    public static void creaUnCoche() {
        // Crear un objeto de la clase Coche
        Coche miCoche = new Coche("Toyota", "Corolla", 2020);

        // Mostrar algunas propiedades del coche
        System.out.println("Marca del coche: " + miCoche.getMarca());
        System.out.println("Modelo del coche: " + miCoche.getModelo());
        System.out.println("Año de fabricación: " + miCoche.getAnio());

        // Invocar métodos del objeto
        miCoche.arrancar();
        miCoche.detener();
    }
    */
}














