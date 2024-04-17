package model;

public class CalculadoraEspecial {
    // Atributo
    private int n;

    // Constructor por defecto
    public CalculadoraEspecial() {
        // Inicialización del atributo
        this.n = 0;
    }

    // Constructor parametrizado
    public CalculadoraEspecial(int n) {
        this.n = n;
    }

    // Métodos accesores
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    // Método para calcular la sumatoria
    public double calcularSumatoria() {
        double sumatoria = 0;
        for (int k = 1; k <= n; k++) {
            sumatoria += (k * (k + 1) / 2.0);
        }
        return sumatoria;
    }

    // Método para calcular la productoria
    public double calcularProductoria() {
        double productoria = 1;
        for (int k = 1; k <= n; k++) {
            productoria *= (k * (k + 4));
        }
        return productoria;
    }
}
