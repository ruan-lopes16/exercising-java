package gpt.OO.gettersSetters.produto;

public class Main {
    public static void main(String[] args){
        Produto memoria = new Produto(); // instanciando um produto

        // atribuindo valores
        memoria.setNome("Memória RAM");
        memoria.setPreco(239.4);
        memoria.setQuantidade(123);

        System.out.println("Produto: " + memoria.getNome());
        System.out.println("Preço: R$" + memoria.getPreco());
        System.out.println("Quantidade em estoque: " + memoria.getQuantidade() + " unidades");

        System.out.println("-------------------------------------------");

        Produto celular = new Produto();
        celular.setNome("IPhone");
        celular.setPreco(4100.99);
        celular.setQuantidade(59);

        System.out.println("Produto: " + celular.getNome());
        System.out.println("Preço: R$" + celular.getPreco());
        System.out.println("Quantidade em estoque: " + celular.getQuantidade() + " unidades");

        System.out.println("-------------------------------------------");

        Produto oculos = new Produto();
        oculos.setNome("Óculos Armatti");
        oculos.setPreco(300);
        oculos.setQuantidade(3);

        System.out.println("Produto: " + oculos.getNome());
        System.out.println("Preço: R$" + oculos.getPreco());
        System.out.println("Quantidade em estoque: " + oculos.getQuantidade() + " unidades");

        System.out.println("-------------------------------------------");

        Produto caixaSom = new Produto();
        caixaSom.setNome("Multimidia Pionner");
        caixaSom.setPreco(687.9);
        caixaSom.setQuantidade(6);

        System.out.println("Produto: " + caixaSom.getNome());
        System.out.println("Preço: R$" + caixaSom.getPreco());
        System.out.println("Quantidade em estoque: " + caixaSom.getQuantidade() + " unidades");

    }
}
