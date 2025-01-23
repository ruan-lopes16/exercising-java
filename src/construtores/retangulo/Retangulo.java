package construtores.retangulo;

public class Retangulo {
    // atributos
    private double largura;
    private double altura;
    private double area;

    // construtor
    public Retangulo(double largura, double altura){
        this.altura = altura;
        this.largura = largura;
        this.area = largura * altura;   // Inicializa a área no construtor
    }

    // OU PODERIA CRIAR UM METODO PARA O CALCULO - METODO OPCIONAL - tiraria linha 13
/*    public double calcularArea(){
        return this.largura * this.altura;
    } */

    public void exibirDetalhes(){
        System.out.printf("Largura do retângulo: %.2f cm\n", this.largura);
        System.out.printf("Altura do retângulo: %.2f cm\n", this.altura);
        System.out.printf("Área do retângulo: %.2f cm²\n", this.area);

        // METODO OPCIONAL - tiraria a linha 24
      // System.out.println("A área do retângulo é de: " + calcularArea() + "cm²");
    }
}
