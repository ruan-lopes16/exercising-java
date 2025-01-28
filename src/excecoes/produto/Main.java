package excecoes.produto;

public class Main {
    public static void main(String[] args) {

        try {
            // cadastro
            Produto produto = new Produto( "Caneta", 2.5, 10 );
            System.out.println( "Produto cadastrado: " + produto.getNome() );

            // venda
            System.out.println( "Estoque atual: " + produto.getEstoque() );
            produto.vender(3 );
            System.out.println( "Venda realizada! Estoque atual: " + produto.getEstoque() );

            // vender + que em estoque
            produto.vender( 8 );
        } catch ( EstoqueInsulficienteException exception ) {
            System.err.println( "ERRO: " + exception.getMessage() );

        } catch ( IllegalArgumentException exception ) {
            System.err.println( "ERRO DE VALIDAÇÃO: " + exception.getMessage() );

        }

        try {
            // repor
            Produto produto2 = new Produto( "Caderno", 10.0, 10 );
            System.out.println( "Produto cadastrado: " + produto2.getNome() );
            produto2.reporProduto( 20 );
            System.out.println( "Estoque após reabastecido: " + produto2.getEstoque() );

        } catch (IllegalArgumentException exception) {
            System.err.println("ERRO DE VALIDAÇÃO: " + exception.getMessage() );
        }
    }

}
