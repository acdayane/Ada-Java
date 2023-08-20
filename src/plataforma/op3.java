package plataforma;

import java.text.DecimalFormat;

public class op3 {
    
    public static double salarioComComissao( double[] input) {

        double fixoPorCarro = input[3]*input[0];

        double variavelPorValor = input[1]*0.05;

        double salarioTotal = input[2] + fixoPorCarro + variavelPorValor;

        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(df.format(salarioTotal));
    }
}
