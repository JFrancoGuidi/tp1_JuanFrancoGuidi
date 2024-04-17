package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaración de variables
        int numero;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero entre 1 y 9
        System.out.print("Ingrese un número entero entre 1 y 9: ");
        numero = scanner.nextInt(); // Leer el número ingresado por el usuario

        // Validar que el número esté dentro del rango [1, 9]
        if (numero < 1 || numero > 9) {
            System.out.println("El número ingresado está fuera del rango permitido.");
        } else {
            // Mostrar la tabla de multiplicar del número ingresado utilizando un bucle for
            System.out.println("Tabla de multiplicar del " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

        // Cerrar el objeto Scanner después de su uso
        scanner.close();

        
    }
}