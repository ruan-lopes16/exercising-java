package arrays.reverseArray;

import java.util.Arrays;
import java.util.Scanner;

// Create a program that receives an array of integers and reverses it.
public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type the array size: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Type element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(numbers));

        reverseArray(numbers);
        System.out.println("Reverse Array: " + Arrays.toString(numbers));

        scanner.close();
    }


    public static void reverseArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
    }
}
