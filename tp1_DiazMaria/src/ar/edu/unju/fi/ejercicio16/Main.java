package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir y crear un array para almacenar 5 elementos de tipo String
        String[] nombres = new String[5];

        // Pedir al usuario que ingrese nombres utilizando un bucle for
        System.out.println("Ingrese 5 nombres de personas:");
        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre en la posición " + i + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Mostrar los valores guardados en el array utilizando un bucle while
        System.out.println("\nValores guardados en el array:");
        int index = 0;
        while (index < nombres.length) {
            System.out.println("Posición " + index + ": " + nombres[index]);
            index++;
        }

        // Mostrar el tamaño del array utilizando length
        System.out.println("\nTamaño del array: " + nombres.length);

        // Solicitar al usuario que ingrese un índice para eliminar un elemento del arreglo utilizando un bucle do-while
        byte indice;
        do {
            System.out.print("Ingrese el índice del elemento a eliminar (0-" + (nombres.length - 1) + "): ");
            indice = scanner.nextByte();
        } while (indice < 0 || indice >= nombres.length);

        // Eliminar el elemento del arreglo y realizar desplazamientos si es necesario
        for (int i = (int) indice; i < nombres.length - 1; i++) {
            nombres[i] = nombres[i + 1];
        }
        nombres[nombres.length - 1] = ""; // Asignar un espacio en blanco al último elemento para eliminarlo

        // Mostrar nuevamente el arreglo
        System.out.println("\nArreglo después de eliminar el elemento en el índice " + indice + ":");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        scanner.close();
    }
}
