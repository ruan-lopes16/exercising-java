package challenges.stockManagement.service;

import challenges.stockManagement.models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class StockService {
    private Product[] fewProducts = new Product[5];                     // array fixo para POUCOS produtos
    private ArrayList<Product> dinamicProducts = new ArrayList<>();     // arraylist dinamico
    private Scanner scanner = new Scanner(System.in);

    // adicionanando produtos
    public void addProducts() {
        // array fixo
        for (int i = 0; i < fewProducts.length; i++) {
            if (fewProducts[i] == null) { // Se o produto no índice for null (não existir), podemos adicionar
                System.out.println("Type product's name: ");
                String name = scanner.nextLine();

                System.out.println("Type product's price: R$");
                double price = scanner.nextDouble();
                scanner.nextLine();  // Limpa o buffer do scanner

                // Aqui estamos criando um Product genérico, mas você pode alterar isso mais abaixo
                Product newProduct = new Product(name, price, 0);  // Preço e nome, mas código 0 por padrão
                fewProducts[i] = newProduct;  // Adiciona no array fixo
                System.out.println("Product added to fixed array!");

                break;  // Após adicionar, sai do loop
            }
        }

        // arraylist
        System.out.println("Type product type (1 for Perishable, 2 for Non-Perishable): ");
        int productType = scanner.nextInt();  // O usuário escolhe o tipo de produto
        scanner.nextLine();  // Limpa o buffer do scanner

        System.out.println("Type product's name: ");
        String name = scanner.nextLine();  // Nome do produto

        System.out.println("Type product's price: R$: R$");
        double price = scanner.nextDouble();  // Preço do produto

        System.out.println("Type product's code: ");
        int code = scanner.nextInt();  // Código do produto
        scanner.nextLine();  // Limpa o buffer

        // Variável para armazenar o produto (pode ser qualquer tipo de Produto)
        Product product;

        // Verifica o tipo de produto escolhido pelo usuário
        if (productType == 1) {
            // Produto Perecível: Pedir a data de validade
            System.out.println("Type expiry date (dd/mm/yyyy): ");
            String expiryDate = scanner.nextLine();
            // Cria um produto perecível e armazena na variável 'product'
            product = new PerishableProduct(name, price, code, expiryDate);
        } else {
            // Produto Não Perecível: Pedir a categoria
            System.out.println("Type product's category: ");
            String category = scanner.nextLine();
            // Cria um produto não perecível e armazena na variável 'product'
            product = new NonPerishableProduct(name, price, code, category);
        }

        // Adiciona o produto na lista dinâmico (que pode ter qualquer tipo de Produto)
        dinamicProducts.add(product);
        System.out.println("Product added to dynamic ArrayList");
    }

    public void removeProducts() {

    }

    // exibindo
    public void showProducts() {
        System.out.println(" === Produtos no Array Fixo === ");
        for (Product product: fewProducts) {
            System.out.println(product);
        }

        System.out.println("\n === Produtos no ArrayList Dinâmico === ");
        for (Product product: dinamicProducts) {
            System.out.println(product);
        }
    }


}
