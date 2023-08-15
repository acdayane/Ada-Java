package aula6;

public class MainContaBancaria {

    public static void main(String[] args) {
        ContaBancaria contaBancaria1 = new ContaBancaria("Maria", 1000);
        ContaBancaria contaBancaria2 = new ContaBancaria("João", 1500);
        
        contaBancaria1.depositar(500);
        contaBancaria2.depositar(500);

        contaBancaria1.consultarSaldo();
        contaBancaria2.consultarSaldo();
    }    
    
}
