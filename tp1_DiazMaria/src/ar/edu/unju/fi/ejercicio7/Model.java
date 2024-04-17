package model;

public class Empleado {
    // Atributos
    private String nombre;
    private int legajo;
    private double salario;

    // Constantes
    private static final double SALARIO_MINIMO = 210000.00;
    private static final double AUMENTO_POR_MERITOS = 20000.00;

    // Constructor parametrizado
    public Empleado(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;

        // Asignación del salario según la lógica especificada
        if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
        } else {
            this.salario = SALARIO_MINIMO;
        }
    }

    // Métodos
    public void mostrarDatos() {
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Legajo: " + legajo);
        System.out.println("Salario $: " + salario);
    }

    public void darAumento() {
        salario += AUMENTO_POR_MERITOS;
    }
}
