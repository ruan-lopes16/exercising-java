package excecoes.banco;

public class ContaBancaria {
    // atributos
    private String titular;
    private int numero;
    private double saldo;

    // construtor
    public ContaBancaria( int numero, String titular ) throws NumeroContaInvalidaException {
        if (numero > 0 ) {
            this.numero = numero;
        } else {
            throw new NumeroContaInvalidaException( "O número da conta deve ser maior que 0(zero)." );
        }

        this.titular = titular;
    }

    // getters
    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public int getNumero() {
        return numero;
    }

    // não precisarei dos setters

    // métodos
    void depositar( double valor ) {
        this.saldo += valor;
    }

    void sacar ( double valor ) throws SaldoInsulficienteException{
        if ( valor > saldo ) {
            throw new SaldoInsulficienteException( "Saldo insuficiente!" );
        }
        this.saldo -= valor;
    }

    void exibirSaldo() {
        System.out.println( "SALDO ATUAL: R$" + getSaldo() );
    }

    void infoConta(){
        System.out.println(
                "--------- BANCO RSL ---------\n" +
                "Titular: " + titular + "\n" +
                "Número da conta: " + numero + "\n" +
                "Saldo: R$" + saldo
        );
    }

}