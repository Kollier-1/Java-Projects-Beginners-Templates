/**
 * TOPIC: Sorting Algorithms (Insertion Sort)
 * LEVEL: Intermediate
 * DESCRIPTION: Implementation of the Insertion Sort algorithm in Java.
 * The program reads 6 ages from the user, displays the original array,
 * sorts it using Insertion Sort, and displays the sorted array.
 
 * LEARNING OBJECTIVES:
 * - Understand how Insertion Sort works (building a sorted portion)
 * - Implement the insertion sort algorithm with a key and while loop
 * - Use a helper method to display arrays
 * - Read user input with Scanner
 * - Analyze the efficiency of Insertion Sort

 * KEY CONCEPTS:
 * - Insertion Sort: Builds the final sorted array one element at a time
 * - Key: The element being inserted into the sorted portion
 * - Shift operation: Moving elements to the right to make room
 * - In-place sorting: Uses only O(1) extra space
 * - Time complexity: O(n²) worst case, O(n) best case (already sorted)

 * ALGORITHM COMPLEXITY:
 * - Best case: O(n) (array already sorted)
 * - Average case: O(n²)
 * - Worst case: O(n²) (reverse sorted)
 * - Space: O(1) (in-place)

 * EXAMPLE INPUT:
 * Enter 6 ages:
 * 25 18 32 21 29 27

 * EXAMPLE OUTPUT:
 * Original Array: 25 18 32 21 29 27
 * Ordered Array: 18 21 25 27 29 32
 */

import java.util.Scanner;

public class InsertionOfAges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ages = new int[6];

        System.out.println("Enter 6 ages:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }

        System.out.print("Original Array: ");
        showArray(ages);

        for (int i = 1; i < ages.length; i++) {
            int key = ages[i];
            int j = i - 1;

            while (j >= 0 && ages[j] > key) {
                ages[j + 1] = ages[j];
                j--;
            }

            ages[j + 1] = key;
        }

        System.out.print("Ordered Array: ");
        showArray(ages);
    }

    private static void showArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}