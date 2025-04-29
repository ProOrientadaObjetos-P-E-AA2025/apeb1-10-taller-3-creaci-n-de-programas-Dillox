 class Problema3_InstitucionEducativa {
    private String nombre;
    private String tipoInstitucion;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastoPorEstudiante;
    private double presupuesto;

    public Problema3_InstitucionEducativa(String nombre, String tipo, int alumnos, int docentes, int sedes, double gasto) {
        this.nombre = nombre;
        this.tipoInstitucion = tipo;
        this.numeroAlumnos = alumnos;
        this.numeroDocentes = docentes;
        this.numeroSedes = sedes;
        this.gastoPorEstudiante = gasto;
        this.presupuesto = numeroAlumnos * gastoPorEstudiante;
    }

    @Override
    public String toString() {
        return "Institución: " + nombre + "\n" +
               "Tipo: " + tipoInstitucion + "\n" +
               "Alumnos: " + numeroAlumnos + "\n" +
               "Docentes: " + numeroDocentes + "\n" +
               "Sedes: " + numeroSedes + "\n" +
               "Gasto por Estudiante: $" + gastoPorEstudiante + "\n" +
               "Presupuesto Total: $" + presupuesto;
    }
}

public class Problema3_InstitucionEducativaEjecutor {
    public static void main(String[] args) {
        Problema3_InstitucionEducativa institucion = new Problema3_InstitucionEducativa(
            "Escuela Primaria", "Privada", 300, 15, 1, 100.50
        );
        System.out.println(institucion);
    }
}
