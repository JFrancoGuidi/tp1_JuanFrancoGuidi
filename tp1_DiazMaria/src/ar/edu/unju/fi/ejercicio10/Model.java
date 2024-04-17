package model;

public class Pizza {
    // Atributos
    private int diametro;
    private double precio;
    private double area;
    private boolean ingredientesEspeciales;

    // Constantes
    private static final double ADICIONAL_20 = 500;
    private static final double ADICIONAL_30 = 750;
    private static final double ADICIONAL_40 = 1000;

    // Constructor por defecto
    public Pizza() {
        // Inicialización de atributos
        this.diametro = 0;
        this.precio = 0;
        this.area = 0;
        this.ingredientesEspeciales = false;
    }

    // Métodos accesores
    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public double getPrecio() {
        return precio;
    }

    public double getArea() {
        return area;
    }

    public boolean isIngredientesEspeciales() {
        return ingredientesEspeciales;
    }

    public void setIngredientesEspeciales(boolean ingredientesEspeciales) {
        this.ingredientesEspeciales = ingredientesEspeciales;
    }

    // Método para calcular el precio de la pizza
    public void calcularPrecio() {
        if (diametro == 20) {
            precio = ingredientesEspeciales ? 4500 + ADICIONAL_20 : 4500;
        } else if (diametro == 30) {
            precio = ingredientesEspeciales ? 4800 + ADICIONAL_30 : 4800;
        } else if (diametro == 40) {
            precio = ingredientesEspeciales ? 5500 + ADICIONAL_40 : 5500;
        } else {
            System.out.println("Diámetro no válido.");
        }
    }

    // Método para calcular el área de la pizza
    public void calcularArea() {
        double radio = diametro / 2.0;
        area = Math.PI * radio * radio;
    }
}
