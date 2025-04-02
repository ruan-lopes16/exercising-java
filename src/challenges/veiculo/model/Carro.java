package challenges.veiculo.model;

import challenges.veiculo.exceptions.InvalidInputException;
import challenges.veiculo.exceptions.InvalidPercentualException;

public class Carro extends Veiculo implements Motorizado {
    // atributos
    private int numPortas;
    private boolean estepe;
    private Motor motor;

    public Carro(String marca, String modelo, int ano, double preco, int numPortas, boolean estepe, Motor motor) {
        super(marca, modelo, ano, preco);
        this.numPortas = numPortas;
        this.estepe = estepe;
        this.motor = motor;
    }

    // metodos
    // sem retorno
    void calcDesconto(double percentual) throws InvalidPercentualException {
        if (percentual <= 0 && percentual >= 100) {
            throw new InvalidPercentualException("O percentual deve ser maior que 0(zero).");

        }
        double desconto = getPreco() * (percentual / 100);
        setPreco(getPreco() - desconto);

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
        if (numPortas > 1) {
            this.numPortas = numPortas;
        } else {
            throw new InvalidInputException("A quantidade de portas não pode ser menor que 1(um).");
        }
    }

    public double setPreco(double preco) {
        return preco;
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
                "Marca: " + getMarca() +
                "Modelo: " + getModelo() +
                "Ano: " + getAno() +
                "Preço: R$" + String.format("R$%.2f", getPreco()) +
                "Número de portas: " + getNumPortas() +
                "Tem estepe? " + temEstepeTexto() +
                getMotor().getDescricaoMotor());

        if (motor != null) {
            System.out.println(motor.getDescricaoMotor());
        } else {
            System.out.println("Motor não informado.");
        }
    }

    // toString
    @Override
    public String toString() {
        return "Carro{" +
                "numPortas=" + numPortas +
                ", estepe=" + estepe +
                ", preco=" + preco +
                ", ano=" + ano +
                ", modelo='" + getModelo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                "} " + super.toString();
    }

    // interface
    // metodo sem retorno
    @Override
    public void ligarMotor() {
        System.out.println("Motor do carro ligado.");
    }

    @Override
    public void desligarMotor() {
        System.out.println("Motor do carro desligado.");
    }
}
