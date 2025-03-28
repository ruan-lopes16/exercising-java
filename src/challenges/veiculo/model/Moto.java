package challenges.veiculo.model;

import challenges.veiculo.exceptions.InvalidInputException;

public class Moto extends Veiculo implements Motorizado {
    // atributos
    private int cilindradas;
    private boolean comportaPassageiro;
    private Motor motor;

    // construtor
    public Moto(String marca, String modelo, int ano, double preco) {
        super(marca, modelo, ano, preco);
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
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) throws InvalidInputException {
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
                "Marca: " + getMarca() +
                "Modelo: " + getModelo() +
                "Ano: " + ano +
                "Preço: R$" + String.format("R$%.2f", preco) +
                "Cilindradas: " + cilindradas +
                "Comporta passageiros? " + comportaPassageiro +
                getMotor().getDescricaoMotor());
    }

    // toString
    @Override
    public String toString() {
        return "Moto{" +
                "cilindradas=" + cilindradas +
                ", comportaPassageiro=" + comportaPassageiro +
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
        System.out.println("Motor da moto ligado.");
    }

    @Override
    public void desligarMotor() {
        System.out.println("Motor da moto desligado.");
    }
}
