import java.util.Scanner;

public class exe2 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número 1 a 4 corresponde a animais vertebrados: ");

        String animal = scanner.nextLine();
        
        switch (animal) {
            case "1":
                System.out.println("É um animal mamífero");
                break;
    
            case "2":
                System.out.println("É um animal ave");
                break;
    
            case "3": 
                System.out.println("É um animal réptil");
                break;
    
            case "4":
                System.out.println("É um animal anfíbio");
                break;
                
            default:
                System.out.println("Digite um número válido (1 a 4)");
                break;
        }
    }

    
}
