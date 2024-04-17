package main;

import java.util.Scanner;
import model.Pizza;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo para almacenar las pizzas
        Pizza[] pizzas = new Pizza[3];

        // Solicitar al usuario que ingrese los datos para cada pizza
        for (int i = 0; i < pizzas.length; i++) {
            Pizza pizza = new Pizza();
            System.out.println("\nIngrese los datos para la pizza " + (i + 1) + ":");
            System.out.print("Diámetro (20, 30 o 40): ");
            pizza.setDiametro(scanner.nextInt());
            System.out.print("¿Lleva ingredientes especiales? (true/false): ");
            pizza.setIngredientesEspeciales(scanner.nextBoolean());
            scanner.nextLine(); // Limpiar el buffer del scanner

            // Calcular el precio y el área de la pizza
            pizza.calcularPrecio();
            pizza.calcularArea();

            // Agregar la pizza al arreglo
            pizzas[i] = pizza;
        }

        // Mostrar los datos ingresados para cada pizza
        for (int i = 0; i < pizzas.length; i++) {
            System.out.println("\n** Pizza " + (i + 1) + " **");
            System.out.println("Diámetro = " + pizzas[i].getDiametro());
            System.out.println("Ingredientes especiales = " + pizzas[i].isIngredientesEspeciales());
            System.out.println("Precio Pizza = $" + pizzas[i].getPrecio());
            System.out.println("Área de la pizza = " + pizzas[i].getArea());
        }

        // Cerrar el objeto Scanner después de su uso
        scanner.close();
    }
}
