import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        MZFecha fechaPrincipal = new MZFecha();

        int opcion = 0;
        int d, m, a; // Variables para día, mes y año

        System.out.println("--- GESTIÓN DE FECHAS (MZFecha) ---");
        System.out.println("Fecha actual de trabajo (Inicial): " + fechaPrincipal.toString());

        while (opcion != 4) {

            System.out.println("\n----------------------------------");
            System.out.println("Fecha de trabajo actual: " + fechaPrincipal.toString());
            System.out.println("----------------------------------");
            System.out.println("1. Establece fecha (d, m, a)");
            System.out.println("2. Imprimir fecha");
            System.out.println("3. Diferencia entre dos fechas");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            if (teclado.hasNextInt()) {
                opcion = teclado.nextInt();
            } else {
                System.err.println("ERROR: Introduce un número válido.");
                teclado.next(); // Limpiar el buffer de entrada
                continue;
            }

            switch (opcion) {
                case 1:
                    // • establir data → Demana el daa, mes i any
                    System.out.print("Introduce el DÍA: ");
                    d = teclado.nextInt();
                    System.out.print("Introduce el MES: ");
                    m = teclado.nextInt();
                    System.out.print("Introduce el AÑO: ");
                    a = teclado.nextInt();

                    fechaPrincipal.setFecha(d, m, a);
                    System.out.println("=> La fecha de trabajo se ha establecido.");
                    break;

                case 2:

                    System.out.println("\n=> Fecha actual establecida:");
                    fechaPrincipal.imprime();
                    break;

                case 3:
                    System.out.println("\n[Cálculo de diferencia]");
                    System.out.print("Introduce el DÍA de la segunda fecha: ");
                    d = teclado.nextInt();
                    System.out.print("Introduce el MES de la segunda fecha: ");
                    m = teclado.nextInt();
                    System.out.print("Introduce el AÑO de la segunda fecha: ");
                    a = teclado.nextInt();

                    MZFecha fechaSecundaria = new MZFecha(d, m, a);

                    int diferencia = fechaPrincipal.diferenciaDias(fechaSecundaria);

                    System.out.println("La diferencia entre " + fechaPrincipal.toString() +
                            " y " + fechaSecundaria.toString() +
                            " es de " + diferencia + " días.");
                    break;

                case 4:
                    System.out.println("\nSaliendo del programa");
                    break;

                default:
                    System.err.println("ERROR: Opción no válida. Vuelve a intentar.");
            }
        }
        teclado.close(); //
    }
}