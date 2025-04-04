package challenges.veiculo.model;

import challenges.veiculo.exceptions.InvalidInputException;

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
    public Caminhao(String marca, String modelo, int ano, double preco, Motor motor, boolean trucado, double capacidadeMax) {
        super(marca, modelo, ano, preco);
        this.motor = motor;
        this.trucado = trucado;
        this.capacidadeMax =capacidadeMax;
    }

    // getters e setters
    public double getCapacidadeMax() {
        return capacidadeMax;
    }

    public void setCapacidadeMax(double capacidadeMax) throws InvalidInputException {
        if (capacidadeMax > 0) {
            this.capacidadeMax = capacidadeMax;
        } else {
            throw new InvalidInputException("A capacidade máxima não pode ser menor que 0(zero).");
        }
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
                "Marca: " + getMarca() +
                "\nModelo: " + getModelo() +
                "\nAno: " + ano +
                "\nPreço: R$" + String.format("%.2f", preco) +
                "\nCapacidade Máxima: " + capacidadeMax +
                "\nÉ trucado? " + isTrucado() +
                "\nTipo de Combustível: " + motor.getCombustivel() +
                "\nPotência: " + motor.getPotencia() + "cv"
        );
    }

    // toString
    @Override
    public String toString() {
        return "Caminhao{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                ", capacidadeMax=" + capacidadeMax +
                ", trucado=" + isTrucado() +
                ", motor=" + motor +
                '}';
    }

    @Override
    public void ligarMotor() {
        System.out.println("Motor do caminhão ligado.");
    }
    @Override
    public void desligarMotor() {
        System.out.println("Motor do caminhão desligado.");
    }
}
