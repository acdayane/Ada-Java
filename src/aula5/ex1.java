package aula5;

import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        //20 numeros aleatorios entre 1 e 100, qual é o maior e o menor (numeros e posições)

        int[] numeros = new int[20];
        int menorValor = 100;
        int maiorValor = 0;
        int menorIndice = 0;
        int maiorIndice = 0;

        Random random = new Random();
       

        for(int i=0; i<numeros.length; i++) {
            int numeroAleatorio = random.nextInt(101);
            numeros[i] = numeroAleatorio;

            if (numeroAleatorio <= menorValor) {
                menorValor = numeroAleatorio;
                menorIndice = i;
            }
            if (numeroAleatorio >= maiorValor) {
                maiorValor = numeroAleatorio;
                maiorIndice = i;
            }
        }

        System.out.println("Maior número é " + maiorValor + " na posição " + maiorIndice);
        System.out.println("Menor número é " + menorValor + " na posição " + menorIndice);

    }
}
