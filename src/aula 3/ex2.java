import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota: ");

        double nota = scanner.nextDouble();

        if (nota < 5) {
            System.out.println("Aluno reprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Aluno em recuperação");
        } else if (nota >= 7) {
            System.out.println("Aluno aprovado");
        }

    }
}
