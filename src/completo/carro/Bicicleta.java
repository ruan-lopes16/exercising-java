package completo.carro;

public class Bicicleta implements Veiculo {
    // atributos
    private String marca;
    private String modelo;
    private int aro;

    // construtor
   public Bicicleta( String modelo ) {
       this.modelo = modelo;
       System.out.printf( "\n%s foi criada.\n", modelo );
   }

    // getter
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAro() {
        return aro;
    }

    // setter
    public void setAro( int aro ) {
        this.aro = aro;
    }

    public void setMarca( String marca ) {
       this.marca = marca;
    }

    // metodos
    void pedalar(){
        System.out.println( "Partiu ficar fitness, vamos pedalar!!!" );
    }

    // metodos da interface
    @Override
    public void acelerar() {
        System.out.println( "Celera, celera, celera Jesus!" );
    }

    @Override
    public void frear() {
        System.out.println( "CABOOOOO U FREEEEEI!!!!" );
    }

    @Override
    public void exibirInfo() {
        System.out.println(
                "MARCA: " + getMarca() +
                ", MODELO: " + getModelo() +
                ", ARO: " + getAro()
        );
    }
}
