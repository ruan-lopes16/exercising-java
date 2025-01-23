package gettersSetters.conta;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta();

        conta1.setTitular("Ruan");
        conta1.setNumeroConta(1);
        conta1.depositar(1000);
        System.out.println("Saldo: R$" + conta1.getSaldo());
        conta1.sacar(150);

        System.out.println("O titular da conta é: " + conta1.getTitular());
        System.out.println("Numero da conta: " + conta1.getNumeroConta());
        System.out.println("Saldo: R$" + conta1.getSaldo());

        System.out.println("----------------------------------------");

        Conta conta2 = new Conta();
        conta2.setTitular("Rafaella");
        conta2.setNumeroConta(2);
        conta2.depositar(1985.60);
        System.out.println("Saldo: R$" + conta2.getSaldo());
        conta2.sacar(85.60);

        System.out.println("O titular da conta é: " + conta2.getTitular());
        System.out.println("Numero da conta: " + conta2.getNumeroConta());
        System.out.println("Saldo: R$" + conta2.getSaldo());

    }

}
