package challenges.veiculo.model;

public class Motor {
    // atributos
    private double potencia;
    private TipoCombustivel combustivel;

    // construtor
    public Motor(double potencia, TipoCombustivel combustivel) {
        if (potencia > 0) {
            this.potencia = potencia;
        }
        this.combustivel = combustivel;
    }

    // metodo
    public String getDescricaoMotor() {
        return "Motor à " + combustivel + " com " + potencia + "cv(cavalos).";
    }

    // getters e setters
    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public TipoCombustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(TipoCombustivel combustivel) {
        this.combustivel = combustivel;
    }
}
