package plataforma;

import java.util.Arrays;

public class ex4 {

    public static int[] ordenar(int[] input) {
        int[] inputOrdenado = Arrays.copyOf(input, input.length);
        Arrays.sort(inputOrdenado);

        return inputOrdenado;
    }
}
