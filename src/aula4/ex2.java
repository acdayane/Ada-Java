package aula4;

import java.util.Scanner;

public class ex2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        while (true) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                soma += numero;
            } else {
                break;
            }
        }

        System.out.println("A soma dos números pares é: " + soma);
    }
}
