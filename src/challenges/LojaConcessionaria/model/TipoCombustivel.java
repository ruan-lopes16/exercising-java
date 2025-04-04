package challenges.LojaConcessionaria.model;

public enum TipoCombustivel {
    GASOLINA("Gasolina"),
    ETANOL("Etanol"),
    FLEX("Flex"),
    DIESEL("Diesel"),
    ELETRICO("Elétrico"),
    HIBRIDO("Híbrido");

    private final String descricao; // Atributo que armazena o nome do combustível

    // Construtor do enum
    TipoCombustivel(String descricao) {
        this.descricao = descricao;
    }

//    // Método getter para acessar a descrição
//    public String getDescricao() {
//        return descricao;
//    }

    @Override
    public String toString() {
        return descricao;
    }
}
