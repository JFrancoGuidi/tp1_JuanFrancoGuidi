import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (formato: dd/mm/aaaa): ");
        String fechaStr = scanner.nextLine();

        // Convertir la fecha de nacimiento a Calendar
        String[] partesFecha = fechaStr.split("/");
        int dia = Integer.parseInt(partesFecha[0]);
        int mes = Integer.parseInt(partesFecha[1]) - 1; // Se resta 1 porque en Calendar los meses van de 0 a 11
        int anio = Integer.parseInt(partesFecha[2]);
        Calendar fechaNacimiento = new GregorianCalendar(anio, mes, dia);

        Persona persona = new Persona(nombre, fechaNacimiento);

        // Mostrar los datos de la persona y los resultados de los métodos
        System.out.println("\nDatos de la persona:");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Fecha de nacimiento: " + dia + "/" + (mes + 1) + "/" + anio); // Se suma 1 al mes porque en la entrada del usuario los meses van de 1 a 12
        System.out.println("Edad: " + persona.calcularEdad() + " años");
        System.out.println("Signo del zodiaco: " + persona.obtenerSignoZodiaco());
        System.out.println("Estación del año: " + persona.obtenerEstacion());

        scanner.close();
    }
}
