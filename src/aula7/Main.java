package aula7;

public class Main {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("João", 20, 7.5);
        
        // Boolean alunoAprovado = aluno1.isAproved(aluno1.nota);
        // if (alunoAprovado == true) {
        //     System.out.println("Aluno aprovado");
        // } else {
        //     System.out.println("Aluno reprovado");
        // }

        if (aluno1.isAproved(aluno1.nota)) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }

    }
}
