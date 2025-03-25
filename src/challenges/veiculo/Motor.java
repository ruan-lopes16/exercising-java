package challenges.veiculo;

public class Motor {
    // atributos
    private double potencia;
    private String combustivel;

    // construtor
    public Motor(double potencia, String combustivel) {
        this.potencia = potencia;
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

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }
}
