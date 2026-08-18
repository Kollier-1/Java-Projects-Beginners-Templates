/**
 * TOPIC: Sorting Algorithms (Bubble Sort with Display)
 * LEVEL: Beginner
 * DESCRIPTION: Implementation of the Bubble Sort algorithm in Java.
 * The program reads 5 integers from the user, displays the original
 * array, sorts it using Bubble Sort, and displays the sorted array
 * using a helper method for array display.

 * LEARNING OBJECTIVES:
 * - Read an array from user input
 * - Implement Bubble Sort algorithm
 * - Use a helper method to display arrays
 * - Compare original and sorted arrays

 * KEY CONCEPTS:
 * - Bubble Sort: Repeatedly compares adjacent elements and swaps
 * - Helper method: showArray() for reusable display logic
 * - Swap operation: Using a temporary variable
 * - Time complexity: O(n²) in worst case

 * ALGORITHM COMPLEXITY:
 * - Best case: O(n) (already sorted)
 * - Average case: O(n²)
 * - Worst case: O(n²)

 * EXAMPLE INPUT:
 * Enter 5 whole numbers:
 * Number 1: 5
 * Number 2: 2
 * Number 3: 8
 * Number 4: 1
 * Number 5: 9

 * EXAMPLE OUTPUT:
 * Original array: 5 2 8 1 9
 * Ordered array: 1 2 5 8 9
 */

import java.util.Scanner;

public class BubbleSortWithDisplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 whole numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("\nOriginal array: ");
        showArray(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.print("Ordered array: ");
        showArray(numbers);
    }

    public static void showArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}