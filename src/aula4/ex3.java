package aula4;

import java.util.Random;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);
        //System.out.println(numeroAleatorio);

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        while (numeroAleatorio != input) {
            if (numeroAleatorio < input) {
                System.out.println("Tente um número menor!");
                input = scanner.nextInt();
            } else {
                System.out.println("Tente um número maior!");
                input = scanner.nextInt();
            }
        }

        System.out.println("Acertou!");
    }
}
