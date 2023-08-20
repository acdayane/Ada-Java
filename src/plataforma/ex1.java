package plataforma;

public class ex1 {
    public static String geraRecibo(double[] input) {
        Double menorValor = Double.POSITIVE_INFINITY;
        double valorTotal = 0;
        double descontos = 0;
        double valorPago = 0;

        for (int i=0; i<input.length; i++) {
            if (input[i] < menorValor) {
                menorValor = input[i];
            }
            valorTotal += input[i];
        }
        descontos = menorValor*0.5;
        valorPago = valorTotal - descontos;
        
        return  "Valor total: " + valorTotal + " | Valor de descontos: " + descontos + " | Valor a pagar: " + valorPago;
    }
}
