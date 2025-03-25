package challenges.veiculo;

public abstract class Veiculo {
    // atributos
    public String marca;
    public String modelo;
    public int ano;
    public double preco;

    // construtores
    public Veiculo(String marca, String modelo, int ano, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
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
