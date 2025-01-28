package excecoes.produto;

public class EstoqueInsulficienteException extends Exception {
    public EstoqueInsulficienteException(String message) {
        super(message);
    }
}
