package arrays.cadastroNomes;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroNome {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Digite um nome (ou 'sair' para encerrar) : ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair")){
                break;
            }

            nomes.add(nome);
        }

        System.out.println("Nomes cadastradados: ");
        for (String nome: nomes){
            System.out.println(nome);
        }


        System.out.print("Digite o nome que deseja remover: ");
        String nomeRemover = scanner.nextLine();

        if (nomes.remove(nomeRemover)) {
            System.out.println("Nome removido com sucesso!");
        } else {
            System.out.println("Nome não encontrado");
        }

        System.out.println("Lista final de nomes: ");
        for (String nome: nomes){
            System.out.println(nome);
        }

        scanner.close();

    }
}
