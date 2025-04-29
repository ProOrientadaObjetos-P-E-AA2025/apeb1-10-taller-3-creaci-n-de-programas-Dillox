 class Problema7_Automotor {
    String cedulaDuenio;
    String marcaVehiculo;
    int anioFabricacion;
    double valorVehiculo;
    double valorMatricula;

    public Problema7_Automotor(String cedula, String marca, int anio, double valor) {
        this.cedulaDuenio = cedula;
        this.marcaVehiculo = marca;
        this.anioFabricacion = anio;
        this.valorVehiculo = valor;
        int antiguedad = 2025 - anioFabricacion;
        valorMatricula = valorVehiculo * 0.002 * antiguedad;
    }

    @Override
    public String toString() {
        return "Automotor:\n" +
               "Cédula Dueño: " + cedulaDuenio + "\n" +
               "Marca: " + marcaVehiculo + "\n" +
               "Año: " + anioFabricacion + "\n" +
               "Valor Vehículo: $" + valorVehiculo + "\n" +
               "Valor Matrícula: $" + valorMatricula;
    }
}

// Ejecutor Problema 7 (Simplificado)
public class Problema7_AutomotorEjecutor {
    public static void main(String[] args) {
        Problema7_Automotor auto = new Problema7_Automotor("1150373676", "Mercedes", 2019, 125000);
        System.out.println(auto);
    }
}