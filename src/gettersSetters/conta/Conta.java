package gettersSetters.conta;

public class Conta {
    // atributos
    private String titular;
    private int numeroConta;
    private double saldo;

    // getters
    public String getTitular(){
        return this.titular;
    }

    public int getNumeroConta(){
        return this.numeroConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    // setters
    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }

    // metodos
    public void depositar(double valor) {
        saldo += valor;
        System.out.printf("[DEPOSITO] R$%.2f\n", valor);
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.printf("Saque de R$%.2f realizado com sucesso!\n", valor);
        } else {
            System.out.println("Não foi possível realizar o saque.\n");
        }
    }
}
