/**
 * TOPIC: Sorting Algorithms (Selection Sort with Detailed Visualization)
 * LEVEL: Intermediate
 * DESCRIPTION: Implementation of Selection Sort with detailed step-by-step
 * visualization. The user enters the array size and values, and the program
 * shows the array state at every step of the inner loop, allowing a deep
 * understanding of how the algorithm works.
 
 * LEARNING OBJECTIVES:
 * - Implement Selection Sort with configurable array size
 * - Visualize the array state at each comparison step
 * - Understand how the minimum index is tracked
 * - Use Arrays.toString() for clean array display
 * - Read user input with Scanner

 * KEY CONCEPTS:
 * - Selection Sort: Finds the minimum element and swaps it into position
 * - Inner loop: Compares elements to find the minimum
 * - Visualization: Shows array after each comparison (j)
 * - Arrays.toString(): Converts array to readable string format
 * - In-place sorting: Uses only O(1) extra space

 * ALGORITHM COMPLEXITY:
 * - Best case: O(n²)
 * - Average case: O(n²)
 * - Worst case: O(n²)
 * - Space: O(1) (in-place)

 * EXAMPLE INPUT:
 * Enter the array size: 5
 * Enter the values:
 * 33 11 55 44 22

 * EXAMPLE OUTPUT (partial):
 * Iteration i=0, j=1: [33, 11, 55, 44, 22]
 * Iteration i=0, j=2: [33, 11, 55, 44, 22]
 * Iteration i=0, j=3: [33, 11, 55, 44, 22]
 * Iteration i=0, j=4: [33, 11, 55, 44, 22]
 * ... (continues for each i and j)
 */


 import java.util.Arrays;
import java.util.Scanner;

public class SelectionSortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the values:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

                System.out.println("Iteration i=" + i + ", j=" + j + ": " + Arrays.toString(arr));
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("Ordered array (Selection): " + Arrays.toString(arr));
    }
}