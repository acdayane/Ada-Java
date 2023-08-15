package aula6;

public class MainCalculadora {
    public static void main(String[] args) {

        // Calculadora calculadora = new Calculadora();
        // int resultadoSoma = calculadora.soma(10, 25);
        // como não precisa identificar o obj, ou seja, é um comportamento genérico:
        int resultadoSoma = Calculadora.soma(50, 25);
        System.out.println("Soma: " + resultadoSoma);

        int resultadoSub = Calculadora.subtracao(50, 25);
        System.out.println("Subtracao: " + resultadoSub);

        int resultadoMultiplicacao = Calculadora.multiplicacao(20, 10);
        System.out.println("Multiplicacao: " + resultadoMultiplicacao);

        int resultadoDivisao = Calculadora.divisao(20, 10);
        System.out.println("Divisao: " + resultadoDivisao);
    }
}
