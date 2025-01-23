package construtores.pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa carla = new Pessoa(); // populando Pessoa atraves de set - default
        carla.setNome("Carla");
        carla.setIdade("147258369");

        System.out.println("Nome: " + carla.getNome());    // Carla
        System.out.println("cpf: " + carla.getCpf());     // 1472580369

        System.out.println("----------------------");

        Pessoa cassio = new Pessoa("Cássio", "369258147"); // populando Pessoa com os parametros
        System.out.println("Nome:" + cassio.getNome());   // Cássio
        System.out.println("cpf: " + cassio.getCpf());    // 369258147
    }
}
