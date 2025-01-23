package completo.carro;

public class Carro implements Veiculo {
    // atributos
    private String placa;
    private String modelo;
    private String marca;
    private boolean ignicaoLigada = false;

    // construtor
    public Carro( String marca, String modelo ) {
        this.marca = marca;
        this.modelo = modelo;
        System.out.printf( "\n%s %s foi criado.\n", marca, modelo );
    }

    // getter
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    // setter
    public void setModelo( String modelo ) {
        this.modelo = modelo;
    }

    public void setMarca( String marca ) {
        this.marca = marca;
    }

    public void setPlaca( String placa ) {
        this.placa = placa;
    }

    // metodos
    boolean verificarIgnicao() {
        System.out.println( "Verificando componentes para partida..." );
        return ignicaoLigada;
    }

    public void estadoIgnicao( boolean estado ){
        this.ignicaoLigada = estado;
    }

    // metodos da interface
    @Override
    public void acelerar() {
        if (verificarIgnicao()) {
            System.out.println( "ACELERAAAAA, ACELERAAA ESSA BOMBA!" );
        } else {
            System.out.println( "Abençoado, como você quer acelerar se nem ligou o carro?" );
            System.out.println( "Verifique painel e componentes!" );
        }
    }

    @Override
    public void frear() {
        if ( verificarIgnicao() == false ) {
            System.out.println( "Abençoado, como você quer frear se nem ligou o carro?" );
        } else {
            System.out.println( "QUAAAASE MORREU, NUM ACELERA MAIS NÃO!" );
        }
    }

    @Override
    public void exibirInfo() {
        System.out.println(
                "MARCA: " + getMarca() +
                ", MODELO: " + getModelo() +
                ", PLACA: " + (getPlaca() != null ? getPlaca() : "N/A") +
                ", ESTADO: " + (ignicaoLigada ? "Ligado" : "Desligado")
        );
    }
}
