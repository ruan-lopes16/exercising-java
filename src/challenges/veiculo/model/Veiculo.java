package challenges.veiculo.model;

import challenges.veiculo.exceptions.InvalidInputException;

public abstract class Veiculo {
    // atributos
    private String marca;
    private String modelo;
    public int ano;
    public double preco;

    // construtores
    public Veiculo(String marca, String modelo, int ano, double preco) throws InvalidInputException {
        this.marca = marca;
        this.modelo = modelo;
        if (ano > 0) {
            this.ano = ano;
        } else {
            throw new InvalidInputException("Ano não pode ser menor que 0(zero).");
        }
        if (preco > 0) {
            this.preco = preco;
        } else {
            throw new InvalidInputException("Preço não pode ser menor que 0(zero).");
        }
    }

    // getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getPreco() {
        return preco;
    }

    // metodos
    public abstract void exibirDetalhes();

    // metodos com retorno
    public static double calcularImposto(double preco) {
        return preco * 0.04; // Imposto de 4% sobre o preço
    }

    public boolean isNovo() {
        return ano > 2020; // apenas veiculos apos 2020 são novos
    }
}
