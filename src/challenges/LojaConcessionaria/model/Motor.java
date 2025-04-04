package challenges.LojaConcessionaria.model;

import challenges.LojaConcessionaria.exceptions.InvalidInputException;

public class Motor {
    // atributos
    private double potencia;
    private TipoCombustivel combustivel;

    // construtor
    public Motor(double potencia, TipoCombustivel combustivel) {
        if (potencia > 0) {
            this.potencia = potencia;
        } else {
            throw new InvalidInputException("A potência do motor deve ser maior que 0(zero)");
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
