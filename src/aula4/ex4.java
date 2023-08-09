package aula4;

import java.util.Scanner;

public class ex4 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número e veja sua tabuada: ");

        int numero = scanner.nextInt();

        int contador = 1;

        while (contador <= 10) {
            System.out.println(numero + "x" + contador + "=" + numero*contador);
            contador ++;
        }
    }
}
