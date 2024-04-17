package main;

import java.util.Scanner;
import model.CalculadoraEspecial;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el valor de n
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();

        // Construir un objeto de la clase CalculadoraEspecial
        CalculadoraEspecial calculadora = new CalculadoraEspecial(n);

        // Invocar los métodos y mostrar los resultados
        System.out.println("La sumatoria es: " + calculadora.calcularSumatoria());
        System.out.println("La productoria es: " + calculadora.calcularProductoria());

        // Cerrar el objeto Scanner después de su uso
        scanner.close();
    }
}
