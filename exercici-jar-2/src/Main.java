import java.util.Scanner;
import es.iesmz.prueba.Coche; // Paquete confirmado en el JAR

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        Coche miCoche = new Coche("Fiat", "Panda", "Amarillo");

        String dato;
        int velocidad;

        System.out.println("--- PRUEBA DE LA CLASE COCHE ---");

        while (opcion != 9) {

            System.out.println("\n----------------------------------");
            System.out.print("ESTADO ACTUAL DEL COCHE: ");
            miCoche.imprime();
            System.out.println("----------------------------------");
            System.out.println("1. Imprimir datos del coche");
            System.out.println("2. Pintar el coche");
            System.out.println("3. Establecer Marca");
            System.out.println("4. Establecer Model");
            System.out.println("5. Establecer Color");
            System.out.println("6. Acelerar");
            System.out.println("7. Frenar");
            System.out.println("8. Parar");
            System.out.println("9. Salir");
            System.out.print("Selecciona una opción: ");

            if (teclado.hasNextInt()) {
                opcion = teclado.nextInt();
                teclado.nextLine();
            } else {
                System.err.println("ERROR: Introduce un número válido.");
                teclado.next();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n=> Datos del Coche:");
                    miCoche.imprime();
                    break;

                case 2:
                    miCoche.pinta();
                    break;

                case 3:
                    System.out.print("Nueva Marca: ");
                    dato = teclado.nextLine();
                    miCoche.setMarca(dato);
                    System.out.println("=> Marca establida a " + dato + ".");
                    break;

                case 4:
                    System.out.print("Nuevo Modelo: ");
                    dato = teclado.nextLine();
                    miCoche.setModelo(dato);
                    System.out.println("=> Modelo establecido a " + dato + ".");
                    break;

                case 5:
                    System.out.print("Nuevo Color: ");
                    dato = teclado.nextLine();
                    miCoche.setColor(dato);
                    System.out.println("=> Color establecido a " + dato + ".");
                    break;

                case 6:
                    System.out.print("Velocidad a acelerar (km/h): ");
                    velocidad = teclado.nextInt();
                    miCoche.acelera(velocidad);
                    break;

                case 7:
                    System.out.print("Velocidad a frenar (km/h): ");
                    velocidad = teclado.nextInt();
                    miCoche.frena(velocidad);
                    break;

                case 8:
                    miCoche.para();
                    break;

                case 9:
                    System.out.println("\nSaliendo del programa. ¡Hasta pronto!");
                    break;

                default:
                    System.err.println("ERROR: Opción no válida.");
            }
        }
        teclado.close();
    }
}