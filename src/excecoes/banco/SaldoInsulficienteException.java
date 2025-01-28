package excecoes.banco;

public class SaldoInsulficienteException extends Exception {
    public SaldoInsulficienteException(String message) {
        super(message);
    }
}
