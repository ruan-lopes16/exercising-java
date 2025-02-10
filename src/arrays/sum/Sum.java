/*
Create a program that receives an array of integers and returns the sum of all elements.
 */
package arrays.sum;

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int sum = 0;

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = i;
            sum += numbers[i];
        }
        System.out.println("Array contents: " + Arrays.toString(numbers)); // Print array contents
        System.out.println("Sum of array elements: " + sum); // Print the sum

    }
}
