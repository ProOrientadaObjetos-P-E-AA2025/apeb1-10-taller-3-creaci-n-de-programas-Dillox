class Problema8_Cheque {
    String nombreCliente;
    String nombreBanco;
    double valorCheque;
    double comisionBanco;

    public Problema8_Cheque(String cliente, String banco, double valorCheque) {
        this.nombreCliente = cliente;
        this.nombreBanco = banco;
        this.valorCheque = valorCheque;
        comisionBanco = valorCheque * 0.003;
    }

    @Override
    public String toString() {
        return "Cheque:\n" +
               "Cliente: " + nombreCliente + "\n" +
               "Banco: " + nombreBanco + "\n" +
               "Valor Cheque: $" + valorCheque + "\n" +
               "Comisión Banco: $" + comisionBanco;
    }
}

// Ejecutor Problema 8 (Simplificado)
public class Problema8_ChequeEjecutor {
    public static void main(String[] args) {
        Problema8_Cheque cheque = new Problema8_Cheque("Francisca Lopez", "Banco de Loja", 1000);
        System.out.println(cheque);
    }
}
