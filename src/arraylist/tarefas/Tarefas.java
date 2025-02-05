package arraylist.tarefas;

import java.util.ArrayList;
import java.util.Scanner;

public class Tarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tarefas = new ArrayList<>();

        while (true) {
            System.out.print("Adicione uma tarefa ao seu dia(digite 'sair' para encerrar): ");
            String tarefa = scanner.nextLine();

            if (tarefa.equalsIgnoreCase("sair")){
                break;
            }

            tarefas.add(tarefa);
        }

        System.out.println("---------------------------------------");

        System.out.println("Tarefas cadastradas: ");
        for (String tarefa : tarefas){
            System.out.println(tarefa);
        }

        System.out.println("---------------------------------------");

        while (true) {
            System.out.println("Tarefas pendentes: " + tarefas);
            System.out.print("Digite o nome da tarefa para concluir(digite 'sair' para encerrar): ");
            String removerTarefa = scanner.nextLine();

            if (removerTarefa.equalsIgnoreCase("sair")){
                break;
            }

            boolean tarefaRemovida = false;

            for (int i = 0; i < tarefas.size() ; i++) {
                if (tarefas.get(i).equalsIgnoreCase(removerTarefa)) {
                    tarefas.remove(i);
                    tarefaRemovida = true;
                }
            }

            if (tarefaRemovida) {
                System.out.println("Tarefa concluída!");
            } else {
                System.out.println("Se atente ao nome da tarefa!");
            }

        }
        if (tarefas.size() == 0){
            System.out.println("TODAS TAREFAS CONCLUÍDAS");
        } else {
            System.out.println("Você não conseguiu concluir todas tarefas.");
        }

        scanner.close();

    }
}
