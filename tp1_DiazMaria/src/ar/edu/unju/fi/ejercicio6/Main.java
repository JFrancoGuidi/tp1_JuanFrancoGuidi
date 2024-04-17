package main;

import model.Persona;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Objeto utilizando constructor por defecto
        Persona persona1 = new Persona();
        System.out.println("Ingrese DNI:");
        persona1.setDni(scanner.nextLine());
        System.out.println("Ingrese nombre:");
        persona1.setNombre(scanner.nextLine());
        System.out.println("Ingrese fecha de nacimiento (YYYY-MM-DD):");
        LocalDate fechaNacimiento1 = LocalDate.parse(scanner.nextLine());
        persona1.setFechaNacimiento(fechaNacimiento1);
        persona1.mostrarDatos();

        // Objeto utilizando constructor parametrizado
        System.out.println("\nIngrese DNI:");
        String dni2 = scanner.nextLine();
        System.out.println("Ingrese nombre:");
        String nombre2 = scanner.nextLine();
        System.out.println("Ingrese fecha de nacimiento (YYYY-MM-DD):");
        LocalDate fechaNacimiento2 = LocalDate.parse(scanner.nextLine());
        System.out.println("Ingrese provincia:");
        String provincia2 = scanner.nextLine();
        Persona persona2 = new Persona(dni2, nombre2, fechaNacimiento2, provincia2);
        persona2.mostrarDatos();

        // Objeto utilizando constructor con valores por defecto
        System.out.println("\nIngrese DNI:");
        String dni3 = scanner.nextLine();
        System.out.println("Ingrese nombre:");
        String nombre3 = scanner.nextLine();
        System.out.println("Ingrese fecha de nacimiento (YYYY-MM-DD):");
        LocalDate fechaNacimiento3 = LocalDate.parse(scanner.nextLine());
        Persona persona3 = new Persona(dni3, nombre3, fechaNacimiento3);
        persona3.mostrarDatos();

        scanner.close();
    }
}
