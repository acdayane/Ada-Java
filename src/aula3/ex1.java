public class ex1 {
    public static void main(String[] args) throws Exception {

        int idade = 120;

        if (idade >= 0 && idade <= 12) {
            System.out.println("É criança");
        } else if (idade >= 13 && idade <= 19) {
            System.out.println("É adolescente");
        } else if (idade > 19 && idade < 150) {
            System.out.println("É adulto");
        } else {
            System.out.println("Digite uma idade válida");
        }
    }
}
