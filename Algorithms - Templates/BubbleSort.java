/**
 * TOPIC: Sorting Algorithms
 * LEVEL: Beginner
 * DESCRIPTION: Implementation of the Bubble Sort algorithm in Java.
 * The program reads 5 integers from the user, sorts them in ascending
 * order using the Bubble Sort technique, and displays the sorted array.

 * LEARNING OBJECTIVES:
 * - Understand how Bubble Sort works (comparing adjacent elements)
 * - Implement nested loops for sorting
 * - Use a temporary variable for swapping elements
 * - Read user input with Scanner
 * - Use enhanced for loop for output

 * KEY CONCEPTS:
 * - Bubble Sort: Repeatedly steps through the list, compares adjacent
 *   elements and swaps them if they are in the wrong order
 * - Swap operation: Using a temporary variable (aux) to exchange values
 * - Time complexity: O(n²) in worst case
 * - Space complexity: O(1) (in-place sorting)

 * ALGORITHM COMPLEXITY:
 * - Best case: O(n) (already sorted array)
 * - Average case: O(n²)
 * - Worst case: O(n²) (reverse sorted array)

 * EXAMPLE INPUT:
 * Enter 5 whole numbers:
 * 5 2 8 1 9

 * EXAMPLE OUTPUT:
 * Neat arrangement (Bubble):
 * 1 2 5 8 9
 */

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 whole numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int aux = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = aux;
                }
            }
        }

        System.out.println("Neat arrangement (Bubble):");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }
}