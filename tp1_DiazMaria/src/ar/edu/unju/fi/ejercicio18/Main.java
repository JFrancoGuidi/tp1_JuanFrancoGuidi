import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<DestinoTuristico> destinos = new ArrayList<>();
        ArrayList<Pais> paises = new ArrayList<>();
        
        // Precargar algunos países
        paises.add(new Pais(1, "Argentina"));
        paises.add(new Pais(2, "Brasil"));
        paises.add(new Pais(3, "Chile"));

        int opcion;

        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1 - Alta de destino turístico");
            System.out.println("2 - Mostrar todos los destinos turísticos");
            System.out.println("3 - Modificar el país de un destino turístico");
            System.out.println("4 - Limpiar el ArrayList de destino turísticos");
            System.out.println("5 - Eliminar un destino turístico");
            System.out.println("6 - Mostrar los destinos turísticos ordenados por nombre");
            System.out.println("7 - Mostrar todos los países");
            System.out.println("8 - Mostrar los destinos turísticos que pertenecen a un país");
            System.out.println("9 - Salir");

            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    altaDestinoTuristico(destinos, paises, scanner);
                    break;
                case 2:
                    mostrarDestinosTuristicos(destinos);
                    break;
                case 3:
                    modificarPaisDestinoTuristico(destinos, paises, scanner);
                    break;
                case 4:
                    destinos.clear();
                    System.out.println("ArrayList de destinos turísticos limpiado.");
                    break;
                case 5:
                    eliminarDestinoTuristico(destinos, scanner);
                    break;
                case 6:
                    mostrarDestinosOrdenados(destinos);
                    break;
                case 7:
                    mostrarPaises(paises);
                    break;
                case 8:
                    mostrarDestinosPorPais(destinos, scanner);
                    break;
                case 9:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 9);

        scanner.close();
    }

    // Métodos para implementar las opciones del menú
    // Implementa según sea necesario
}
