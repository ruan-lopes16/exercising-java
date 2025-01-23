package gpt.OO.construtores.retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo(5,6);
        retangulo1.exibirDetalhes();

        System.out.println("---------------------------------------");

        Retangulo retangulo2 = new Retangulo(9,6);
        retangulo2.exibirDetalhes();

        System.out.println("---------------------------------------");

        Retangulo retangulo3 = new Retangulo(10, 20);
        retangulo3.exibirDetalhes();

    }
}
