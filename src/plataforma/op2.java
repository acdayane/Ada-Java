package plataforma;

import java.text.DecimalFormat;

public class op2 {
    
    public static double valorEntrada(double[] input) {
        double finalPrice = input[1];

        if (input[0] == 1.0 || input[0] == 2.0 || input[0] == 4.0) {
            finalPrice = finalPrice - finalPrice*0.25;
        }

        if (input[2] == 1.0) {
            finalPrice = finalPrice + input[1]*0.15;
        }

        DecimalFormat df = new DecimalFormat("#.000");
        return Double.parseDouble(df.format(finalPrice));
    }
}
