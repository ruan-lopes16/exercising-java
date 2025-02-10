package challenges.CLICalcutator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entry;

        while (true) {
            // menu
            System.out.println("------ CALCULATOR ------");
            System.out.println("- Sum");
            System.out.println("- Subtract");
            System.out.println("- Multiply");
            System.out.println("- Divide");
            System.out.println("- Exit");
            System.out.print("Type an operation: ");

            entry = scanner.next();
            if (entry.equalsIgnoreCase("exit")) {
                System.out.println("Closed calculator.");
                scanner.close();
                break;
            }


            try {
                // variables
                System.out.print("Type number 1: ");
                double num1 = scanner.nextDouble();
                System.out.print("Type number 2: ");
                double num2 = scanner.nextDouble();
                double result = 0;

                switch (entry.toLowerCase()) {
                    case "sum":
                        result = num1 + num2;
                        break;

                    case "subtract":
                        result = num1 - num2;
                        break;

                    case "multiply":
                        result = num1 * num2;
                        break;

                    case "divide":
                        if (num2 == 0) {
                            throw new ArithmeticException("Division by zero!");
                        }
                        result = num1 / num2;
                        break;

                    default:
                        throw new IllegalArgumentException("Invalid option!");
                }

                if (result % 1 == 0) {
                    System.out.printf("RESULT: %.0f + %.0f = %.0f\n", num1, num2, result);
                } else {
                    System.out.printf("RESULT: %.2f + %.2f = %.2f\n", num1, num2, result);
                }

            } catch (ArithmeticException | IllegalArgumentException exception) {
                System.err.println("[ERROR]: " + exception.getMessage() + "' '" + entry);
            }
        }
    }
}
