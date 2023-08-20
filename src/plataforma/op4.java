package plataforma;

import java.text.DecimalFormat;

public class op4 {
    
    public static double[] custosCarro(double[] input) {
        double[] percentualDistribuidorEImpostos = {0, 0};
        DecimalFormat df = new DecimalFormat("#.00");

        percentualDistribuidorEImpostos[0] = Double.parseDouble(df.format(input[0]*100 / input[1]));
        percentualDistribuidorEImpostos[1] = Double.parseDouble(df.format(input[1]*100 / input[2]));
        
        return percentualDistribuidorEImpostos;
    }
}
