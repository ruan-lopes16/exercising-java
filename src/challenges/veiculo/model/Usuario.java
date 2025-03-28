package challenges.veiculo.model;

import challenges.veiculo.exceptions.SaldoInvalidoException;
import challenges.veiculo.exceptions.VeiculoNaoEncontradoException;

public class Usuario {
    // atributos
    private String nome;
    private double saldo;

    // getters
    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    // metodos de compra e venda
    public void comprarVeiculo(Veiculo veiculo, GaragemUsuario garagemUsuario) throws SaldoInvalidoException {
        if (saldo >= veiculo.getPreco()) {
            saldo -= veiculo.getPreco();
            garagemUsuario.adicionarVeiculo(veiculo);
            System.out.println("Parabéns pela compra");

        } else {
            throw new SaldoInvalidoException("Você não tem saldo suficiente para comprar o veículo");
        }
    }

    public void venderVeiculo(Veiculo veiculo, GaragemUsuario garagemUsuario) throws VeiculoNaoEncontradoException {
        try {
            garagemUsuario.removerVeiculo(veiculo);
            saldo += veiculo.getPreco();
            System.out.println("Veículo vendido com sucesso!");
        } catch (VeiculoNaoEncontradoException e) {
            System.out.println("Erro ao vender veículo: " + e.getMessage());
        }

    }
}
