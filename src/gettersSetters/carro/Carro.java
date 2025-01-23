package gettersSetters.carro;

public class Carro {
    // atributos
    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;

    // getters
    public String getMarca(){
        return this.marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    // setters

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    // metodos
    public void acelerar(double velocidadeUp){
        this.velocidadeAtual += velocidadeUp;
        System.out.println("Aceleração de " + velocidadeUp + "km/h");
        System.out.println("Velocidade atual: " + velocidadeAtual + "km/h" );
    }

    public void frear(double velocidadeDown){
        this.velocidadeAtual -= velocidadeDown;
        System.out.println("Desaceleração de " + velocidadeDown + "km/h");
        System.out.println("Velocidade atual: " + velocidadeAtual + "km/h" );
    }
}
