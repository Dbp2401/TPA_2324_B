package ejemplos;

public class Coche {
    // Atributos de la clase
    private String marca;
    private String modelo;
    private int anio;

    // Constructor de la clase
    public Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    // Métodos específicos
    public void arrancar() {
        System.out.println("El coche ha arrancado");
    }

    public void detener() {
        System.out.println("El coche se ha detenido");
    }
}
