package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero en el rango [5, 10]
        int tamanoArray;
        do {
            System.out.print("Ingrese un número entero entre 5 y 10: ");
            tamanoArray = scanner.nextInt();
        } while (tamanoArray < 5 || tamanoArray > 10);

        // Crear un array de tipo String con el tamaño ingresado por el usuario
        String[] nombres = new String[tamanoArray];

        // Solicitar al usuario que ingrese nombres de personas para llenar el array
        System.out.println("Ingrese " + tamanoArray + " nombres de personas:");

        for (int i = 0; i < tamanoArray; i++) {
            System.out.print("Ingrese el nombre en la posición " + i + ": ");
            scanner.nextLine(); // Limpiar el buffer del scanner
            nombres[i] = scanner.nextLine();
        }

        // Mostrar el contenido del array en orden ascendente (primer índice 0)
        System.out.println("\nContenido del array en orden ascendente:");
        for (int i = 0; i < tamanoArray; i++) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        // Mostrar el contenido del array en orden descendente (última posición primero)
        System.out.println("\nContenido del array en orden descendente:");
        for (int i = tamanoArray - 1; i >= 0; i--) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }

        scanner.close();
    }
}
