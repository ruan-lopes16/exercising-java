package construtores.carro;

public class Main {
    public static void main(String[] args) {
        Carro corsa = new Carro("Chevrolet", "Corsa");
        corsa.setAno(2003);
        corsa.setCor("Prata");

        System.out.println("Informações do Carro:");
        System.out.println("Marca: " + corsa.getMarca() + "\nModelo: " + corsa.getModelo());
        System.out.println("Cor: " + corsa.getCor() + "\nAno: " + corsa.getAno());

        System.out.println("----------------------------");

        Carro palio = new Carro("Fiat", "Palio Adventure", "Prata");
        palio.setAno(2009);

        System.out.println("Informações do Carro:");
        System.out.println("Marca: " + palio.getMarca() + "\nModelo: " + palio.getModelo());
        System.out.println("Cor: " + palio.getCor() + "\nAno: " + palio.getAno());

        System.out.println("----------------------------");

        Carro up = new Carro("VW", "Up!", 2015, "Branco");
        System.out.println("Informações do Carro:");
        System.out.println("Marca: " + up.getMarca() + "\nModelo: " + up.getModelo());
        System.out.println("Cor: " + up.getCor() + "\nAno: " + up.getAno());

    }
}
