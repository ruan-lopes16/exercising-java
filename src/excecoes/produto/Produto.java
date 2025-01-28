package excecoes.produto;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto( String nome, double preco, int estoque ) {
        if ( preco <= 0 ) {
            throw new IllegalArgumentException( "[PRECO MENOR OU IGUAL A 0(ZERO)" );
        }
        if ( estoque < 0 ) {
            throw new IllegalArgumentException( "[ESTOQUE MENOR QUE 0(ZERO)]" );
        }
        this.estoque = estoque;
        this.nome = nome;
        this.preco = preco;
    }

    void vender( int quantidade ) throws EstoqueInsulficienteException {
        if ( quantidade <= 0 ) {
            throw new IllegalArgumentException( "A quantidade a ser vendida dever ser maior que 0(zero)." );
        }
        if ( this.estoque >= quantidade ) {
            this.estoque -= quantidade;
        } else {
            throw new EstoqueInsulficienteException( "Estoque insuficiente! Estoque atual: " + this.estoque );
        }
    }

    void reporProduto ( int quantidade ) {
        if ( quantidade <= 0 ) {
            throw new IllegalArgumentException( "A quantidade a se repor dever ser maior que 0(zero)" );
        }
        this.estoque += quantidade;
    }

    // getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    // setter
    public void setPreco( double preco ) {
        if ( preco < 0 ) {
            throw new IllegalArgumentException( "[PREÇO MENOR QUE 0 (ZERO)]" );
        }
        this.preco = preco;
    }
}
