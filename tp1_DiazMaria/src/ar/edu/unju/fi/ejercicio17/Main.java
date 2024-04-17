import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 - Alta de jugador");
            System.out.println("2 - Mostrar los datos del jugador");
            System.out.println("3 - Mostrar todos los jugadores ordenados por apellido");
            System.out.println("4 - Modificar los datos de un jugador");
            System.out.println("5 - Eliminar un jugador");
            System.out.println("6 - Mostrar la cantidad total de jugadores");
            System.out.println("7 - Mostrar la cantidad de jugadores que pertenecen a una nacionalidad");
            System.out.println("8 - Salir");

            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    altaJugador(jugadores, scanner);
                    break;
                case 2:
                    mostrarDatosJugador(jugadores, scanner);
                    break;
                case 3:
                    mostrarJugadoresOrdenados(jugadores);
                    break;
                case 4:
                    modificarDatosJugador(jugadores, scanner);
                    break;
                case 5:
                    eliminarJugador(jugadores, scanner);
                    break;
                case 6:
                    mostrarCantidadTotalJugadores(jugadores);
                    break;
                case 7:
                    mostrarCantidadJugadoresNacionalidad(jugadores, scanner);
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 8);

        scanner.close();
    }

    // Método para agregar un jugador
    public static void altaJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = scanner.nextLine();
        // Ingresar fecha de nacimiento, nacionalidad, estatura, peso, posición...
        // Implementa según sea necesario
        // Luego crear un objeto Jugador y agregarlo al ArrayList
        // jugadores.add(new Jugador(nombre, apellido, ...));
    }

    // Método para mostrar los datos de un jugador por nombre y apellido
    public static void mostrarDatosJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
        System.out.print("Ingrese el nombre del jugador: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del jugador: ");
        String apellido = scanner.nextLine();

        // Buscar el jugador por nombre y apellido
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                // Mostrar los datos del jugador
                // Implementa según sea necesario
                return;
            }
        }
        System.out.println("Jugador no encontrado.");
    }

    // Método para mostrar todos los jugadores ordenados por apellido
    public static void mostrarJugadoresOrdenados(ArrayList<Jugador> jugadores) {
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores para mostrar.");
            return;
        }

        // Ordenar los jugadores por apellido
        Collections.sort(jugadores, (j1, j2) -> j1.getApellido().compareToIgnoreCase(j2.getApellido()));

        // Mostrar los jugadores ordenados
        for (Jugador jugador : jugadores) {
            // Mostrar los datos del jugador
            // Implementa según sea necesario
        }
    }

    // Métodos para modificar los datos de un jugador
    // Implementa según sea necesario

    // Método para eliminar un jugador
    public static void eliminarJugador(ArrayList<Jugador> jugadores, Scanner scanner) {
        System.out.print("Ingrese el nombre del jugador a eliminar: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del jugador a eliminar: ");
        String apellido = scanner.nextLine();

        // Utilizar un Iterator para recorrer la lista y eliminar el jugador
        Iterator<Jugador> iterator = jugadores.iterator();
        while (iterator.hasNext()) {
            Jugador jugador = iterator.next();
            if (jugador.getNombre().equalsIgnoreCase(nombre) && jugador.getApellido().equalsIgnoreCase(apellido)) {
                iterator.remove(); // Eliminar el jugador
                System.out.println("Jugador eliminado correctamente.");
                return;
            }
        }
        System.out.println("Jugador no encontrado.");
    }

    // Métodos para mostrar la cantidad total de jugadores y la cantidad de jugadores por nacionalidad
    // Implementa según sea necesario
}
