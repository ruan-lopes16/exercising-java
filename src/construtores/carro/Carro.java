package construtores.carro;

public class Carro {
    // atributos
    private String marca;
    private String modelo;
    private int ano;
    private String cor;

    // construtor
    public Carro(String marca, String modelo){ // 2 parametro
        this.marca = marca;
        this.modelo = modelo;
    }

    public Carro(String marca, String modelo, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public Carro(String marca, String modelo, int ano, String cor) {    // todos atributos
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    // getter
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public String getCor() {
        return cor;
    }

    // setter
    /* não precisa
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
     */

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
