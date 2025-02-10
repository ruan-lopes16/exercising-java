package arrays.averageElements;

import java.util.Arrays;
import java.util.Scanner;

// Given an array of numbers, calculate and display the arithmetic mean of the values.
public class AverageElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the array size: ");
        int size = scanner.nextInt();

        double[] numbers = new double[size];
        double sum = 0;

        for (int i = 0; i < size ; i++) {
            System.out.print("Type element " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        System.out.println("Array: " + Arrays.toString(numbers));

        scanner.close();

        double mean = sum / size;

        System.out.printf("The arithmetic mean of the values is: %.2f", mean);
    }
}
