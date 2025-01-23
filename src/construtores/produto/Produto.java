package gpt.OO.construtores.produto;

public class Produto {
    // atributos
    private String nome;
    private double preco;
    private int quantidade;

    // construtores
    public Produto(String nome) {   // 1 parametro
        this.nome = nome;
    }

    public Produto(String nome, double preco){ // 2 parametros
        this.nome = nome;
        this.preco = preco;
    }

    public Produto(String nome, double preco, int quantidade){ // todos parametros possiveis
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // getter
    public String getNome() {
        return this.nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    // setter
    // NAO PRECISA DE 'setNome()', pois não há construtor default e não precisarei colocar outro nome uma vez que cadastrado

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
