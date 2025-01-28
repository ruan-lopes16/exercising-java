package excecoes.banco;

public class Main {
    public static void main(String[] args) throws Exception {

        ContaBancaria conta = null;

        try {
            conta = new ContaBancaria(1, "Ruan");  // altere numero para 0, teste de exception
            conta.depositar(1000);
            conta.sacar(50);
            //conta.sacar(1001);    // retire o comentario para testar exception

        } catch ( Exception e) {
            System.err.println( "O motivo do erro foi: " + e.getMessage() );

        } finally {
            if ( conta != null ) {
                conta.infoConta();

            } else {
                System.err.println( "Conta não inicializada!" );

            }
        }
    }
}