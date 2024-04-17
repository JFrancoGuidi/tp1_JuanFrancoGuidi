package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaración de variables
        int numero;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        numero = scanner.nextInt(); // Leer el número ingresado por el usuario

        // Cerrar el objeto Scanner después de su uso
        scanner.close();

        // Estructura de control condicional para determinar si el número es par o impar
        if (numero % 2 == 0) {
            // Si el número es par, mostrar el triple del número
            System.out.println("El número ingresado es par.");
            System.out.println("El triple del número es: " + (numero * 3));
        } else {
            // Si el número es impar, mostrar el doble del número
            System.out.println("El número ingresado es impar.");
            System.out.println("El doble del número es: " + (numero * 2));
        }

        
    }
}