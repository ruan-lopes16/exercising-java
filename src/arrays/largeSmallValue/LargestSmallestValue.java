package arrays.largeSmallValue;
// Write code that finds the largest and smallest number in an array of integers.

import java.util.Arrays;

public class LargestSmallestValue {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = i + 1;
        }
        System.out.println("Array: " + Arrays.toString(numbers));

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length ; i++) {
            if ( numbers[i] > largest ) {
                largest = numbers[i];
            }
            if ( numbers[i] < smallest ) {
                smallest = numbers[i];
            }
        }
        System.out.println("Largest value: " + largest);
        System.out.println("Smallest value: " + smallest);

    }
}