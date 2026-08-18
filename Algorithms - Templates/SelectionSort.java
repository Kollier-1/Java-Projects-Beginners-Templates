/**
 * TOPIC: Sorting Algorithms (Selection Sort)
 * LEVEL: Beginner
 * DESCRIPTION: Implementation of the Selection Sort algorithm in Java.
 * The program reads 5 grades (integers) from the user, sorts them in
 * ascending order using the Selection Sort technique, and displays
 * both the original and sorted arrays.
 *
 * LEARNING OBJECTIVES:
 * - Understand how Selection Sort works (finding the minimum element)
 * - Implement nested loops for selection sorting
 * - Use a temporary variable for swapping elements
 * - Create a helper method to display array contents
 * - Read user input with Scanner
 *
 * KEY CONCEPTS:
 * - Selection Sort: Divides the array into sorted and unsorted parts.
 *   In each pass, it finds the minimum element from the unsorted part
 *   and swaps it with the first element of the unsorted part.
 * - Swap operation: Using a temporary variable (aux) to exchange values
 * - Helper method: showArray() for reusable array display logic
 * - Time complexity: O(n²) in all cases
 * - Space complexity: O(1) (in-place sorting)
 *
 * ALGORITHM COMPLEXITY:
 * - Best case: O(n²) (always performs n² comparisons)
 * - Average case: O(n²)
 * - Worst case: O(n²)
 * - Number of comparisons: n(n-1)/2 always
 * - Number of swaps: O(n) (at most n-1 swaps)
 *
 * EXAMPLE INPUT:
 * Enter 5 grades:
 * 85 92 78 90 88
 *
 * EXAMPLE OUTPUT:
 * Original Array:
 * 85 92 78 90 88
 * Ordered Array:
 * 78 85 88 90 92
 */

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] grades = new int[5];

        System.out.println("Enter 5 grades: ");
        for (int i = 0; i < grades.length; i++) {
            grades[i] = scanner.nextInt();
        }

        System.out.println("Original Array: ");
        showArray(grades);

        // Selection Sort
        for (int i = 0; i < grades.length - 1; i++) {
            int lowerIndex = i;
            for (int k = i + 1; k < grades.length; k++) {
                if (grades[k] < grades[lowerIndex]) {
                    lowerIndex = k;
                }
            }
            int aux = grades[i];
            grades[i] = grades[lowerIndex];
            grades[lowerIndex] = aux;
        }

        System.out.println("Ordered Array: ");
        showArray(grades);
    }

    public static void showArray(int[] array) {
        for (int n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}