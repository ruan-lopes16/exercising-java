package gettersSetters.carro;

public class Main {
    public static void main(String[] args) {
        Carro up = new Carro();
        up.setMarca("VW");
        up.setModelo("Up!");
        up.setAno(2015);
        up.setVelocidadeAtual(50);

        System.out.printf("Carro: %s %s %d\n", up.getMarca(), up.getModelo(), up.getAno());
        System.out.println("Velocidade atual: " + up.getVelocidadeAtual() + "km/h\n");

        up.acelerar(65);
        System.out.println("[RADAR 110km/h]");
        up.frear(10);
    }
}
