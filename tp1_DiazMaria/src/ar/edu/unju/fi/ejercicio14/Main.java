package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero en el rango [3, 10]
        int tamanoArray;
        do {
            System.out.print("Ingrese un número entero entre 3 y 10: ");
            tamanoArray = scanner.nextInt();
        } while (tamanoArray < 3 || tamanoArray > 10);

        // Crear un array de tamaño tamanoArray para almacenar números enteros
        int[] numeros = new int[tamanoArray];

        // Solicitar al usuario que ingrese los valores para llenar el array
        System.out.println("Ingrese " + tamanoArray + " números enteros:");

        int suma = 0;
        for (int i = 0; i < tamanoArray; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];
        }

        // Mostrar por consola el valor de cada posición y la suma de todos los valores
        System.out.println("\nValores almacenados en el array:");

        for (int i = 0; i < tamanoArray; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }

        System.out.println("Suma de todos los valores: " + suma);

        scanner.close();
    }
}
