package plataforma;

public class ex3 {

    public static String parImpar(int[] input) {
        int pares = 0;
        int impares = 0;

        for (int i=0; i<input.length; i++) {
            if (input[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        return pares + " pares, " + impares + " impares";
    }    
}
