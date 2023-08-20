package aula7;

public class Aluno {
    String nome;
    int idade;
    double nota;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public Boolean isAproved(double nota) {
        // if (nota >= 6.0) {
        //     return true;
        // } else {
        //     return false;
        // }
        return nota >= 6;
    }
}
