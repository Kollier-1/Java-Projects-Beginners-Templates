/**
 * TOPIC: Sorting Algorithms (Selection Sort with Step-by-Step Visualization)
 * LEVEL: Intermediate
 * DESCRIPTION: Implementation of the Selection Sort algorithm with
 * step-by-step visualization. The user can enter any number of elements,
 * and the program shows the array state after each iteration.

 * LEARNING OBJECTIVES:
 * - Implement Selection Sort with variable array size
 * - Understand how Selection Sort works step by step
 * - Use a helper method to display arrays
 * - Track the progress of the algorithm visually
 * - Read user input with Scanner

 * KEY CONCEPTS:
 * - Selection Sort: Finds the minimum element and swaps it with the first
 *   element of the unsorted portion in each iteration
 * - Step-by-step visualization: Shows the array after each outer loop iteration
 * - Variable array size: User can enter any number of elements
 * - In-place sorting: Uses only O(1) extra space
 * - Time complexity: O(n²) in all cases

 * ALGORITHM COMPLEXITY:
 * - Best case: O(n²)
 * - Average case: O(n²)
 * - Worst case: O(n²)
 * - Space: O(1) (in-place)

 * EXAMPLE INPUT:
 * How many numbers do you want to enter? 6
 * Number 1: 25
 * Number 2: 18
 * Number 3: 32
 * Number 4: 21
 * Number 5: 29
 * Number 6: 27

 * EXAMPLE OUTPUT:
 * Original Array:
 * 25 18 32 21 29 27
 * Iteration 1: 18 25 32 21 29 27
 * Iteration 2: 18 21 32 25 29 27
 * Iteration 3: 18 21 25 32 29 27
 * Iteration 4: 18 21 25 27 29 32
 * Iteration 5: 18 21 25 27 29 32

 * Final sorted array:
 * 18 21 25 27 29 32
 */

import java.util.Scanner;

public class SelectionSortWithSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nOriginal Array:");
        showArray(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            int SmallerIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[SmallerIndex]) {
                    SmallerIndex = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[SmallerIndex];
            numbers[SmallerIndex] = temp;

            System.out.print("Iteration " + (i + 1) + ": ");
            showArray(numbers);
        }

        System.out.println("\nFinal sorted array:");
        showArray(numbers);
    }

    public static void showArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}