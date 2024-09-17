import java.util.Scanner;

class Gato {
    private int edad;    // Age of the cat
    private String nombre;  // Name of the cat
    private String raza;    // Breed of the cat

    // Constructor
    public Gato(int edad, String nombre, String raza) {
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
    }

    // Getters
    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    // Method to calculate human age equivalent
    public int calcularEdadHumana() {
        if (edad == 1) {
            return 15;
        } else if (edad == 2) {
            return 15 + 9;
        } else {
            return 15 + 9 + (edad - 2) * 4;
        }
    }

    // Method to display cat data
    public String mostrarDatos() {
        return "Nombre: " + nombre + ", Raza: " + raza + ", Edad: " + edad + " años, Edad humana: " + calcularEdadHumana() + " años.";
    }
}