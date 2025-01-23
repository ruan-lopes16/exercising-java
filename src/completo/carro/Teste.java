package completo.carro;

public class Teste {
    public static void main(String[] args) {
        Carro hillux = new Carro( "Toyota", "Hillux" );
        hillux.setPlaca("PWR4Q99");
        hillux.estadoIgnicao(false);
        hillux.acelerar();
        hillux.frear();

        hillux.exibirInfo();

        System.out.println("-------------------------------------------------------------------------");

        Bicicleta bike = new Bicicleta( "MTB" );
        bike.setMarca( "OGGY" );
        bike.setAro(29);
        bike.pedalar();
        bike.acelerar();
        bike.frear();

        bike.exibirInfo();
    }
}
