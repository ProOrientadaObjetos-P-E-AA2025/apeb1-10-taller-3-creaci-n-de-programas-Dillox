public class Problema4_EquipoCelular {
    String sistemaOperativo;
    double tamanoPantalla;
    double costoInicial;
    double porcentajeIva;
    double ivaCostoInicial;
    double costoFinal;
    String direccionMac;
    String informacionImei;

    public Problema4_EquipoCelular(String sistemaOperativo, double tamanoPantalla, double costoInicial, double porcentajeIva, String direccionMac, String informacionImei) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.costoInicial = costoInicial;
        this.porcentajeIva = porcentajeIva;
        this.direccionMac = direccionMac;
        this.informacionImei = informacionImei;
        ivaCostoInicial = (porcentajeIva / 100) * costoInicial;
        costoFinal = costoInicial + ivaCostoInicial;
    }

    @Override
    public String toString() {
        return "Equipo Celular:\n" +
               "Sistema Operativo: " + sistemaOperativo + "\n" +
               "Tamaño Pantalla: " + tamanoPantalla + " pulgadas\n" +
               "Costo Inicial: $" + costoInicial + "\n" +
               "IVA: " + porcentajeIva + "%\n" +
               "Costo Final: $" + costoFinal + "\n" +
               "MAC: " + direccionMac + "\n" +
               "IMEI: " + informacionImei;
    }
}

class Problema4_EquipoCelularEjecutor {
    public static void main(String[] args) {
        Problema4_EquipoCelular celular = new Problema4_EquipoCelular("iOS", 6.1, 500, 10, "AA:BB:CC:DD:EE:FF", "123456789012345");
        System.out.println(celular);
    }
}