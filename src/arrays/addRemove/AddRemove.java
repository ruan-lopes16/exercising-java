package arrays.addRemove;

import java.util.ArrayList;
import java.util.Scanner;

// Create an ArrayList of strings that simulates a to-do list. Add some tasks, remove one of them, and display the final list.
public class AddRemove {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Adicionar tarefas
        System.out.println("Type the tasks (or 'end' to exit): ");
        String task;
        do {
            System.out.printf((tasks.size() + 1) + ". ");
            task = scanner.nextLine();
            if (!task.equalsIgnoreCase("end")) { // Ignora maiúsculas/minúsculas
                tasks.add(task);
            }
        } while (!task.equalsIgnoreCase("end"));

        // Loop para mostrar tarefas pendentes e removê-las
        while (!tasks.isEmpty()) {
            System.out.println("---------- PENDING TASKS ----------");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
            System.out.println("----------------------------------");

            System.out.print("Enter the number of the task to conclude (or 0 to skip/exit): ");

            if (scanner.hasNextInt()) {
                int removeIndex = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                if (removeIndex > 0 && removeIndex <= tasks.size()) {
                    tasks.remove(removeIndex - 1);
                    System.out.println("Task concluded.");
                } else if (removeIndex == 0) {
                    break; // Sai do loop se o usuário digitar 0
                } else {
                    System.out.println("Invalid task number.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Limpar entrada inválida
            }
        }

        System.out.println("---------- FINAL TASKS ----------"); // Mensagem final
        if (tasks.isEmpty()) {
            System.out.println("No tasks left.");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
        System.out.println("----------------------------------");


        scanner.close();
    }
}
