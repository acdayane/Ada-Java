import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dia da semana (1 = segunda e 7 = domingo): ");

        int dia = scanner.nextInt();

        switch (dia) {
            case 1: System.out.println("Hoje é segunda"); break;
            case 2: System.out.println("Hoje é terça"); break;
            case 3: System.out.println("Hoje é quarta"); break;
            case 4: System.out.println("Hoje é quinta"); break;
            case 5: System.out.println("Hoje é sexta"); break;
            case 6: System.out.println("Hoje é sábado"); break;
            case 7: System.out.println("Hoje é domingo"); break;
            default: System.out.println("Digite um número válido (1 a 7)");
        }

    }
}
