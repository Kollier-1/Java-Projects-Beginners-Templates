/**
 * TOPIC: Arrays (Basic Statistics)
 * LEVEL: Beginner
 * DESCRIPTION: Reads 8 integers from the user, calculates the maximum
 * value, minimum value, and average of the numbers. This demonstrates
 * common statistical calculations on array data.

 * LEARNING OBJECTIVES:
 * - Declare and initialize a 1D array
 * - Read user input into an array using Scanner
 * - Find the maximum value in an array
 * - Find the minimum value in an array
 * - Calculate the average of array elements
 * - Use enhanced for loop for array traversal

 * KEY CONCEPTS:
 * - Maximum: Track the largest value seen so far
 * - Minimum: Track the smallest value seen so far
 * - Average: Sum of all elements divided by count
 * - Initialization: Set max/min to first element for proper comparison
 * - Type casting: (double) sum / length for accurate average
 * - Enhanced for loop: for (int number : numbers) for iteration

 * ALGORITHM COMPLEXITY:
 * - Time: O(n) where n is array size
 * - Space: O(1) (only a few variables)

 * EXAMPLE INPUT:
 * Enter 8 whole numbers:
 * Number 1: 15
 * Number 2: 23
 * Number 3: 8
 * Number 4: 42
 * Number 5: 17
 * Number 6: 31
 * Number 7: 5
 * Number 8: 19

 * EXAMPLE OUTPUT:
 * Bigger: 42
 * Smaller: 5
 * Average: 20.0
 */

import java.util.Scanner;

public class BasicStadistict {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[8];
        int bigger, smaller, sum = 0;

        System.out.println("Enter 8 whole numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        bigger = smaller = sum = numbers[0];

        for (int number : numbers){
            if (number > bigger) bigger = number;
            if (number < smaller) smaller = number;
            sum += number;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Bigger: " + bigger);
        System.out.println("Smaller: " + smaller);
        System.out.println("Average: " + sum);
    }
}