package ejemplos;

public class PrimitivasVsEnvolventes {
    public static void main(String[] args) {
        int size = 10000000; // tamaño del array

        // Usando tipos primitivos
        int[] primitiveArray = new int[size];
        for (int i = 0; i < size; i++) {
            primitiveArray[i] = i;
        }

        long startTime = System.nanoTime();
        int sumPrimitive = 0;
        for (int i = 0; i < size; i++) {
            sumPrimitive += primitiveArray[i];
        }
        long endTime = System.nanoTime();
        long durationPrimitive = endTime - startTime;
        System.out.println("Suma con primitivos: " + sumPrimitive);
        System.out.println("Tiempo con primitivos: " + durationPrimitive + " nanosegundos");


        // Usando clases envolventes
        Integer[] wrapperArray = new Integer[size];
        for (int i = 0; i < size; i++) {
            wrapperArray[i] = i;
        }

        startTime = System.nanoTime();
        Integer sumWrapper = 0;
        for (int i = 0; i < size; i++) {
            sumWrapper += wrapperArray[i];
        }
        endTime = System.nanoTime();
        long durationWrapper = endTime - startTime;
        System.out.println("Suma con envolventes: " + sumWrapper);
        System.out.println("Tiempo con envolventes: " + durationWrapper + " nanosegundos");

        // Mostrar la diferencia de rendimiento
        System.out.println("Diferencia de tiempo: " + (durationWrapper - durationPrimitive) + " nanosegundos");
    }
}
