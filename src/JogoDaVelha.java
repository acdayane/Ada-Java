import java.util.Scanner;

public class JogoDaVelha {
    static String [][] matriz = {{"- ", "- ", "- "},{"- ", "- ", "- "},{"- ", "- ", "- "}};
    static boolean player1Turn = true;
    static int line = 0;
    static int column = 0;
    static int numberOfTurn = 0;
 
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jogo da Velha");

        while (numberOfTurn <= 9) {
            printGame();
   
            if (player1Turn == true) {
                System.out.println("Jogador 1: Insira o número da linha em que deseja jogar (1 a 3): ");
                line = scanner.nextInt();
                System.out.println("Jogador 1: Insira o número da coluna em que deseja jogar (1 a 3): ");
                column = scanner.nextInt();

                if (checkInput() == true) {
                    matriz[line-1][column-1] = "X ";
                    numberOfTurn ++;             
                    if (numberOfTurn >= 5 && checkGame() == true) break;
                    player1Turn = false;
                } else {
                    System.out.println("Você precisa jogar em uma casa vazia!");
                } 

            } else {
                System.out.println("Jogador 2: Insira o número da linha em que deseja jogar (1 a 3): ");
                line = scanner.nextInt();
                System.out.println("Jogador 2: Insira o número da coluna em que deseja jogar (1 a 3): ");
                column = scanner.nextInt();

                if (checkInput() == true) {
                    matriz[line-1][column-1] = "O ";
                    numberOfTurn ++;             
                    if (numberOfTurn >= 5 && checkGame() == true) break;
                    player1Turn = true;
                } else {
                    System.out.println("Você precisa jogar em uma casa vazia!");
                } 
            }
        }
    }

    private static boolean checkGame() {
        boolean winnerExist = false;

        if (matriz[0][0].equals(matriz[0][1]) && matriz[0][0].equals(matriz[0][2]) && !matriz[0][0].equals("- ")) winnerExist = true;
        if (matriz[1][0].equals(matriz[1][1]) && matriz[1][0].equals(matriz[1][2]) && !matriz[1][0].equals("- ")) winnerExist = true;
        if (matriz[2][0].equals(matriz[2][1]) && matriz[2][0].equals(matriz[2][2]) && !matriz[2][0].equals("- ")) winnerExist = true;

        if (matriz[0][0].equals(matriz[1][0]) && matriz[0][0].equals(matriz[2][0]) && !matriz[0][0].equals("- ")) winnerExist = true;
        if (matriz[0][1].equals(matriz[1][1]) && matriz[0][1].equals(matriz[2][1]) && !matriz[0][1].equals("- ")) winnerExist = true;
        if (matriz[0][2].equals(matriz[1][2]) && matriz[0][2].equals(matriz[2][2]) && !matriz[0][2].equals("- ")) winnerExist = true;

        if (matriz[0][0].equals(matriz[1][1]) && matriz[0][0].equals(matriz[2][2]) && !matriz[0][0].equals("- ")) winnerExist = true;
        if (matriz[0][2].equals(matriz[1][1]) && matriz[0][2].equals(matriz[2][0]) && !matriz[0][2].equals("- ")) winnerExist = true;

        if (winnerExist == true) {
            printGame();

            if (player1Turn == true) {
                System.out.println("Jogador 1 é o vencedor!");
            } else {
                System.out.println("Jogador 2 é o vencedor!");
            }   

        } else {
            if (numberOfTurn == 9) {
                System.out.println("Partida sem vencedor!");
            }
        }

        return winnerExist;
    }

    private static boolean checkInput() {
        if (matriz[line-1][column-1].equals("- ")) {
            return true;
        } else {
            return false;
        }
    } 
    
    private static void printGame() {
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
           System.out.println("");
        }
    }
}
