package aula5;

import java.util.Random;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Boolean numeroExiste = false;

        Random random = new Random();   
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 50: ");

        int input = scanner.nextInt();

        for(int i=0; i<numeros.length; i++) {
            int numeroAleatorio = random.nextInt(51);
            numeros[i] = numeroAleatorio;
        }

        for (int variavelTemporaria : numeros) {
            if (variavelTemporaria == input) {
                System.out.println("O número existe");   
                numeroExiste = true;
                break;                       
            } 
        }
        if (numeroExiste == false) System.out.println("O número não existe");
    }
}
