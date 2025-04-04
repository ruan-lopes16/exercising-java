package challenges.LojaConcessionaria.model;

import challenges.LojaConcessionaria.exceptions.InvalidInputException;

public class Moto extends Veiculo implements Motorizado {
    // atributos
    private double cilindradas;
    private boolean comportaPassageiro;
    private Motor motor;

    // construtor
    public Moto(String marca, String modelo, int ano, double preco, Motor motor, double cilindradas, boolean comportaPassageiro) {
        super(marca, modelo, ano, preco);
        this.motor = motor;
        this.cilindradas = cilindradas;
        this.comportaPassageiro = comportaPassageiro;
    }

    // metodo
    // com retorno
    public String passageiro() {
        if (comportaPassageiro) {
            return "Comporta passageiro.";

        } else {
            return "Não comporta passageiro.";
        }
    }

    // getters e setters
    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) throws InvalidInputException {
        if (cilindradas > 0) {
            this.cilindradas = cilindradas;
        } else {
            throw new InvalidInputException("A cilindrada não pode ser menor que 0(zero).");
        }
    }

    public boolean ComportaPassageiro() {
        return comportaPassageiro;
    }

    public void setComportaPassageiro(boolean comportaPassageiro) {
        this.comportaPassageiro = comportaPassageiro;
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
        System.out.println(" === MOTO === " +
                "\nMarca: " + getMarca() +
                "\nModelo: " + getModelo() +
                "\nAno: " + getAno() +
                "\nPreço: R$" + String.format("%.2f", getPreco()) +
                "\nCilindradas: " + getCilindradas() +
                "\nComporta passageiros? " + (comportaPassageiro ? "Sim" : "Não") +
                "\nTipo de Combustível: " + getMotor().getCombustivel() +
                "\nPotência: " + getMotor().getPotencia() + "cv"
        );
    }

    // toString
    @Override
    public String toString() {
        return "Moto {" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", ano=" + getAno() +
                ", preco=R$" + String.format("%.2f", getPreco()) +
                ", cilindradas=" + getCilindradas() +
                ", comportaPassageiro=" + (comportaPassageiro ? "Sim" : "Não") +
                ", motor=" + getMotor().toString() + // Inclui a representação do motor
                '}';
    }


    // interface
    // metodo sem retorno
    @Override
    public void ligarMotor() {
        System.out.println("Motor da moto ligado.");
    }

    @Override
    public void desligarMotor() {
        System.out.println("Motor da moto desligado.");
    }
}
