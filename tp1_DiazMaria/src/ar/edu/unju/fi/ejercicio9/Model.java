package model;

public class Producto {
    // Atributos
    private String nombre;
    private String codigo;
    private double precio;
    private int descuento; // Valor entero comprendido entre [0,50]

    // Constructor por defecto
    public Producto() {
        // Inicialización de atributos
        this.nombre = "";
        this.codigo = "";
        this.precio = 0.0;
        this.descuento = 0;
    }

    // Métodos accesores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    // Método para calcular el descuento
    public double calcularDescuento() {
        return precio - (precio * descuento / 100.0);
    }
}
