package aula5;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        String[] cidades = {"São Paulo", "Itu", "Santos", "Itumirim", "BH", "Rio", "Maricá", "Barueri", "Osasco", "Manaus"};
        Boolean cidadeExiste = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome de uma cidade: ");

        String input = scanner.nextLine();

        for (String variavelTemporaria : cidades) {
            if (variavelTemporaria.equals(input)) {
                System.out.println("A cidade foi encontrada");
                cidadeExiste = true;
                break;          
            } 
        }
        if (cidadeExiste == false) System.out.println("A cidade não foi encontrada");
    }
}
