import java.util.Scanner;

public class ex3 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7 (segunda = 1 e domingo = 7): ");

        int diaDaSemana = scanner.nextInt();

        if (diaDaSemana >= 1 && diaDaSemana < 6) {
            System.out.println("É dia útil");
        } else if (diaDaSemana == 6 || diaDaSemana == 7) {
            System.out.println("É final de semana");
        } else {
            System.out.println("Número inválido (deveria ser de 1 a 7)");
        }

    }
}
