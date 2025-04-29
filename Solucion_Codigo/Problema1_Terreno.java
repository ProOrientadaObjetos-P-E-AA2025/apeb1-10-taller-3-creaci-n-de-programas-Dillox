public class Problema1_Terreno {
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    private double costoTerreno;

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public void calcularArea() {
        area = largo * ancho;
    }

    public void calcularCostoTerreno() {
        costoTerreno = area * valorMetroCuadrado;
    }

    @Override
    public String toString() {
        return String.format("Terreno:\nAncho: %.2f m\nLargo: %.2f m\nÁrea: %.2f m2\nValor por metro: $%.2f\nCosto total: $%.2f",
                              ancho, largo, area, valorMetroCuadrado, costoTerreno);
    }
}

class Problema1_TerrenoEjecutor {
    public static void main(String[] args) {
        Problema1_Terreno terreno = new Problema1_Terreno();
        terreno.setAncho(15);
        terreno.setLargo(30);
        terreno.setValorMetroCuadrado(150);
        terreno.calcularArea();
        terreno.calcularCostoTerreno();
        System.out.println(terreno);
    }
}
