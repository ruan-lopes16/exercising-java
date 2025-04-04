package challenges.LojaConcessionaria.model;

import challenges.LojaConcessionaria.exceptions.SaldoInvalidoException;
import challenges.LojaConcessionaria.exceptions.VeiculoNaoEncontradoException;

public class Usuario {
    // atributos
    private String nome;
    private double saldo;

    // construtor
    public Usuario(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

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
            double precoVenda = veiculo.getPreco();
            double taxaDesvalorizacao;
            if (veiculo instanceof Carro) {
                taxaDesvalorizacao = 0.10; // 10% para carros
            } else if (veiculo instanceof Moto) {
                taxaDesvalorizacao = 0.15; // 15% para motos
            } else {
                taxaDesvalorizacao = 0.08; // 8% para caminhões
            }
            double desvalorizacao = precoVenda * taxaDesvalorizacao;
            precoVenda -= desvalorizacao;
            saldo += precoVenda;
            System.out.println("Veículo vendido com sucesso! Preço de venda: R$" + String.format("%.2f", precoVenda));
        } catch (VeiculoNaoEncontradoException e) {
            System.out.println("Erro ao vender veículo: " + e.getMessage());
        }

    }
}
