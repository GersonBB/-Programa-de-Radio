// MainProgram.java
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una implementación de Radio:");
            System.out.println("1. RadioCarro");
            System.out.println("2. Otra implementación (por ahora simulada)");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");

            int opcionImplementacion = scanner.nextInt();
            scanner.nextLine();  // Consumir el carácter de nueva línea

            if (opcionImplementacion == 0) {
                System.out.println("¡Hasta luego!");
                break;
            }

            Radio radio;
            if (opcionImplementacion == 1) {
                radio = new RadioCarro();
            } else {
                // Agregar más implementaciones de Radio según sea necesario
                System.out.println("Opción no válida");
                continue;
            }

            while (true) {
                mostrarMenu();
                int opcion = scanner.nextInt();
                scanner.nextLine();  // Consumir el carácter de nueva línea

                switch (opcion) {
                    case 1:
                        radio.encender();
                        break;

                    case 2:
                        radio.cambiarFrecuencia();
                        break;

                    case 3:
                        radio.avanzarDial();
                        break;

                    case 4:
                        System.out.print("Ingrese el número de botón (1-12): ");
                        int botonGuardar = scanner.nextInt();
                        radio.guardarEmisora(botonGuardar);
                        break;

                    case 5:
                        System.out.print("Ingrese el número de botón (1-12): ");
                        int botonSeleccionar = scanner.nextInt();
                        radio.seleccionarEmisora(botonSeleccionar);
                        break;

                    case 6:
                        radio.apagar();
                        break;

                    case 0:
                        System.out.println("¡Hasta luego!");
                        System.exit(0);

                    default:
                        System.out.println("Opción no válida");
                }
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("----- Menú -----");
        System.out.println("1. Prende el radio");
        System.out.println("2. Cambia de AM a FM a AM");
        System.out.println("3. Avanzar en el dial de las emisoras");
        System.out.println("4. Permite guardar una emisora en uno de los 12 botones");
        System.out.println("5. Permite seleccionar la emisora puesta en un botón");
        System.out.println("6. Apagar el radio");
        System.out.println("0. Salir");
        System.out.print("Ingrese una opción: ");
    }
}
