package challenges.veiculo;

public class Caminhao extends Veiculo implements Motorizado {
    // atributos
    private double capacidadeMax;
    private boolean trucado;
    private Motor motor;

    // metodo
    // com retorno
    public String trucado() {
        if (ehTrucado()) {
            return "Caminhão trucado.";

        } else {
            return "Caminhão não é trucado.";
        }
    }

    // sem retorno
    public void buzinar() {
        System.out.println("Fuuuuuuooooooooooooooooooom");
    }

    // construtores
    public Caminhao(String marca, String modelo, int ano, double preco) {
        super(marca, modelo, ano, preco);
    }

    // getters e setters
    public double getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(double capacidadeMax) {
        this.capacidadeMax = capacidadeMax;
    }

    public boolean ehTrucado() {
        return trucado;
    }

    public void setTrucado(boolean trucado) {
        this.trucado = trucado;
    }

    public boolean isTrucado() {
        return trucado;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    // sobreescrevendo método abstrato da classe abstrata
    @Override
    public void exibirDetalhes() {
        System.out.println(" === CAMINHÃO === " +
                "Marca: " + marca +
                "Modelo: " + modelo +
                "Ano: " + ano +
                "Preço: R$" + String.format("R$%.2f", preco) +
                "Capacidade Máxima: " + capacidadeMax +
                "É trucado? " + trucado +
                getMotor().getDescricaoMotor());
    }



    @Override
    public void ligarMotor() {

    }
}
