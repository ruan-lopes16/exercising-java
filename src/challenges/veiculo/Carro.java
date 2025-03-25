package challenges.veiculo;

public class Carro extends Veiculo implements Motorizado{
    // atributos
    private int numPortas;
    private boolean estepe;
    private Motor motor;

    public Carro(String marca, String modelo, int ano, double preco) {
        super(marca, modelo, ano, preco);
    }

    // metodos
    // sem retorno
    void calcDesconto(double percentual) {
        double desconto = preco * (percentual / 100);
        preco -= desconto;
    }


    // com retorno
    public String temEstepeTexto() {
        if (temEstepe()) {
            return "Tem estepe.";
        } else {
            return "Não tem estepe.";
        }
    }


    // getters e setter
    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public boolean temEstepe() {
        return estepe;
    }

    public void setEstepe(boolean estepe) {
        this.estepe = estepe;
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
        System.out.println(" === CARRO === " +
                "Marca: " + marca +
                "Modelo: " + modelo +
                "Ano: " + ano +
                "Preço: R$" + String.format("R$%.2f", preco) +
                "Número de portas: " + numPortas +
                "Tem estepe? " + temEstepeTexto() +
                getMotor().getDescricaoMotor());
    }

    // toString
    @Override
    public String toString() {
        return "Carro{" +
                "numPortas=" + numPortas +
                ", estepe=" + estepe +
                ", preco=" + preco +
                ", ano=" + ano +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                "} " + super.toString();
    }

    // interface
    // metodo sem retorno
    @Override
    public void ligarMotor() {
        System.out.println("Motor do carro ligado.");
    }
}
