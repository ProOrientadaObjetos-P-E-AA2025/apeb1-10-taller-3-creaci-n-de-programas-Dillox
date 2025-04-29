 class Problema5_Estudiante {
    String nombre;
    double calificacion1;
    double calificacion2;
    double calificacion3;
    double promedio;
    String estado;

    public Problema5_Estudiante(String nombre, double c1, double c2, double c3) {
        this.nombre = nombre;
        this.calificacion1 = c1;
        this.calificacion2 = c2;
        this.calificacion3 = c3;
        promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        if (promedio >= 6.5) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + "\n" +
               "Notas: " + calificacion1 + ", " + calificacion2 + ", " + calificacion3 + "\n" +
               "Promedio: " + promedio + "\n" +
               "Estado: " + estado;
    }
}

public class Problema5_EstudianteEjecutor {
    public static void main(String[] args) {
        Problema5_Estudiante estudiante = new Problema5_Estudiante("Santiago Diaz", 7, 6.5, 7.75);
        System.out.println(estudiante);
    }
}
