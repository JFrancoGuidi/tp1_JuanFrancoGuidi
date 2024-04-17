import java.util.Calendar;
import java.util.Date;

public class Jugador {
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String nacionalidad;
    private double estatura;
    private double peso;
    private String posicion;

    // Constructor
    public Jugador(String nombre, String apellido, Date fechaNacimiento, String nacionalidad, double estatura, double peso, String posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.nacionalidad = nacionalidad;
        this.estatura = estatura;
        this.peso = peso;
        this.posicion = posicion;
    }

    // Método para calcular la edad del jugador
    public int calcularEdad() {
        Calendar fechaActual = Calendar.getInstance();
        Calendar fechaNac = Calendar.getInstance();
        fechaNac.setTime(fechaNacimiento);

        int edad = fechaActual.get(Calendar.YEAR) - fechaNac.get(Calendar.YEAR);

        if (fechaActual.get(Calendar.DAY_OF_YEAR) < fechaNac.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        return edad;
    }

    // Getters y setters
    // Implementa según sea necesario
}
