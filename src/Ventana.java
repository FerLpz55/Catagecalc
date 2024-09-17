import java.util.Scanner;

class Ventana {
    private Scanner scanner = new Scanner(System.in);
    private Gato[] gatos = new Gato[3];  // Store 3 cat objects
    private int contador = 0;

    // Method to get user input for cat details
    public void ingresarGato() {
        if (contador < 3) {
            System.out.print("Ingrese el nombre del gato: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese la raza del gato: ");
            String raza = scanner.nextLine();
            System.out.print("Ingrese la edad del gato (en años): ");
            int edad = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after nextInt()

            gatos[contador] = new Gato(edad, nombre, raza);
            contador++;
        } else {
            System.out.println("Ya ha ingresado 3 gatos.");
        }
    }

    // Method to display the last three cats
    public void mostrarGatos() {
        System.out.println("Últimos tres gatos ingresados:");
        for (int i = 0; i < contador; i++) {
            System.out.println(gatos[i].mostrarDatos());
        }
    }

    // Method to show menu and handle user options
    public void mostrarMenu() {
        int opcion = 0;
        do {
            System.out.println("1. Ingresar datos de un nuevo gato");
            System.out.println("2. Ver los últimos tres gatos ingresados");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (opcion) {
                case 1:
                    ingresarGato();
                    break;
                case 2:
                    mostrarGatos();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
            }
        } while (opcion != 3);
    }
}
