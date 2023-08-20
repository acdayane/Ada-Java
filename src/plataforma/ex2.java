package plataforma;

public class ex2 {
    public static boolean elementosRepetidos(double[] input) {
        for (int i=0; i<input.length; i++) {
            for (int j=i+1; j<input.length; j++) {
                if (input[i] == input[j]) {
                    return true;
                }
            }
        }

        return false;
    }
}
