class Problema6_Profesor {
    String nombre;
    String apellido;
    double sueldoBasico;
    double sueldoTotal;
    String cedula;

    public Problema6_Profesor(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
        sueldoTotal = sueldoBasico + (0.2 * sueldoBasico);
    }

    @Override
    public String toString() {
        return "Profesor: " + nombre + " " + apellido + "\n" +
               "Cédula: " + cedula + "\n" +
               "Sueldo Básico: $" + sueldoBasico + "\n" +
               "Sueldo Total: $" + sueldoTotal;
    }
}

// Ejecutor Problema 6 (Simplificado)
public class Problema6_ProfesorEjecutor {
    public static void main(String[] args) {
        Problema6_Profesor profesor = new Problema6_Profesor("Brayan", "Patiño", 400, "0987982746");
        System.out.println(profesor);
    }
}

