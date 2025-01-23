package gpt.OO.construtores.produto;

public class Main {
    public static void main(String[] args) {
        Produto oleoMotor = new Produto("Óleo 20W-50"); // instanciação com 1 parametro
        oleoMotor.setPreco(40.90);
        oleoMotor.setQuantidade(190);

        System.out.println("Produto: " + oleoMotor.getNome());
        System.out.println("Preço: R$" + oleoMotor.getPreco());
        System.out.println("Quantidade em estoque: " + oleoMotor.getQuantidade() + " unidades");

        System.out.println("--------------------------------------------------");

        Produto suporteCelular = new Produto("Suporte de celular slim", 25.89); // instanciação com 2 parametros
        suporteCelular.setQuantidade(10);

        System.out.println("Produto: " + suporteCelular.getNome());
        System.out.println("Preço: R$" + suporteCelular.getPreco());
        System.out.println("Quantidade em estoque: " + suporteCelular.getQuantidade() + " unidades");

        System.out.println("--------------------------------------------------");

        Produto kitFerramenta = new Produto("Kit de ferramentas(mini)", 15.8, 90); // instanciação com todos parametros

        System.out.println("Produto: " + kitFerramenta.getNome());
        System.out.println("Preço: R$" + kitFerramenta.getPreco());
        System.out.println("Quantidade em estoque: " + kitFerramenta.getQuantidade() + " unidades");
    }
}
