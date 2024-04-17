package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un array de 8 elementos para almacenar números enteros
        int[] numeros = new int[8];

        // Pedir al usuario que ingrese los valores para llenar el array
        System.out.println("Ingrese 8 números enteros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Mostrar por consola el índice y el valor almacenado en esa posición
        System.out.println("\nValores almacenados en el array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        scanner.close();
    }
}
