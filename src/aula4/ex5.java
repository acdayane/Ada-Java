package aula4;

import java.util.Scanner;

public class ex5 {
     
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número positivo: ");

        int input = scanner.nextInt();
        int quantidadeInput = 1;
        int soma = 0;

        while (input >= 0) {
            soma += input;
            quantidadeInput++;
            System.out.println("Digite um número positivo: ");
            input = scanner.nextInt();
        }

        System.out.println("A média é " + soma/quantidadeInput);
    }
}
