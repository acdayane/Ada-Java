package aula6;

public class ContaBancaria {
   
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
      this.saldo += deposito;
    }

    public void consultarSaldo() {
        System.out.println(this.titular + " seu saldo é " + this.saldo);
    }
}
