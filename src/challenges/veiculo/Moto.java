package challenges.veiculo;

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

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
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
                "Marca: " + marca +
                "Modelo: " + modelo +
                "Ano: " + ano +
                "Preço: R$" + String.format("R$%.2f", preco) +
                "Cilindradas: " + cilindradas +
                "Comporta passageiros? " + comportaPassageiro +
                getMotor().getDescricaoMotor());
    }

    // interface
    // metodo sem retorno
    @Override
    public void ligarMotor() {
        System.out.println("Motor da moto ligado.");
    }
}
