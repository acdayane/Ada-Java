package plataforma;

public class op1 {
    
    public static double calculoSalario(double[] input) {

        if (input[0] < 5) {
            return input[2]*1.01;
        }
        if (input[0] >= 5 && input[0] < 10) {
            return input[2]*1.015;            
        }
        if (input[0] >= 10) {
            return input[2]*1.02 + input[2]*0.02;
        }
        return 0;     
    }
}
