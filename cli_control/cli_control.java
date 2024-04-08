package cli_control;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cli_control {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        String opcion = "3";

        while (!opcion.equals("4")) {
            // Obtener la fecha y hora actuales
            LocalDateTime fechaHoraActual = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            System.out.println("Sistema para el control de un motor de corriente directa");
            System.out.println("Desarrollado por Figueroa");
            System.out.println(fechaHoraActual.format(formatter));

            System.out.println();
            System.out.println("Menu");
            System.out.println("1. Girar en sentido horario");
            System.out.println("2. Girar en sentido antihorario");
            System.out.println("3. Detener el motor");
            System.out.println("4. Salir");
            System.out.println();

            if (opcion.equals("1")) {
                System.out.println("Estado del motor: Girando en sentido horario");
            } else if (opcion.equals("2")) {
                System.out.println("Estado del motor: Girando en sentido antihorario");
            } else if (opcion.equals("3")) {
                System.out.println("Estado del motor: Detenido");
            }

            System.out.println("Seleccione una opcion: ");
            opcion = scanner.nextLine();
            System.out.println();
        }

        System.out.println("Saliendo del sistema...");
    }
}