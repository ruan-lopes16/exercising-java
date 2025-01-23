package gpt.OO.gettersSetters.pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa ruan = new Pessoa();
        ruan.setNome("Ruan");
        ruan.setIdade(21);
        ruan.setCpf("12345678901");

        System.out.println("Nome: " + ruan.getNome() + ", idade: " + ruan.getIdade() + " anos, cpf: " + ruan.getCpf());

        System.out.println("-------------------------------------------------");

        Pessoa patrick = new Pessoa();
        patrick.setNome("Patrick");
        patrick.setIdade(31);
        patrick.setCpf("32165498701");

        System.out.println("Nome: " + patrick.getNome() + ", idade: " + patrick.getIdade() + " anos, cpf: " + patrick.getCpf());

        System.out.println("-------------------------------------------------");

        Pessoa hyan = new Pessoa();
        hyan.setNome("Hyan");
        hyan.setIdade(23);
        hyan.setCpf("12365478901");

        System.out.println("Nome: " + hyan.getNome() + ", idade: " + hyan.getIdade() + " anos, cpf: " + hyan.getCpf());
    }
}
