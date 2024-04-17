package main;

import java.util.Scanner;
import model.Producto;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear un arreglo para almacenar los productos
        Producto[] productos = new Producto[3];

        // Solicitar al usuario que ingrese los datos para cada producto
        for (int i = 0; i < productos.length; i++) {
            Producto producto = new Producto();
            System.out.println("\nIngrese los datos para el producto " + (i + 1) + ":");
            System.out.print("Nombre: ");
            producto.setNombre(scanner.nextLine());
            System.out.print("Código: ");
            producto.setCodigo(scanner.nextLine());
            System.out.print("Precio: ");
            producto.setPrecio(scanner.nextDouble());
            System.out.print("Descuento (%): ");
            producto.setDescuento(scanner.nextInt());
            scanner.nextLine(); // Limpiar el buffer del scanner

            // Agregar el producto al arreglo
            productos[i] = producto;
        }

        // Mostrar los datos ingresados para cada producto y el resultado de calcularDescuento()
        for (int i = 0; i < productos.length; i++) {
            System.out.println("\nDatos del producto " + (i + 1) + ":");
            System.out.println("Nombre: " + productos[i].getNombre());
            System.out.println("Código: " + productos[i].getCodigo());
            System.out.println("Precio: $" + productos[i].getPrecio());
            System.out.println("Descuento (%): " + productos[i].getDescuento());
            System.out.println("Precio con descuento: $" + productos[i].calcularDescuento());
        }

        // Cerrar el objeto Scanner después de su uso
        scanner.close();
    }
}
