/**
 * TOPIC: Sorting Algorithms (Insertion Sort with Steps)
 * LEVEL: Intermediate
 * DESCRIPTION: Implementation of Insertion Sort with step-by-step
 * visualization. The user enters any number of elements, and the
 * program displays the array state after each insertion step.
 
 * LEARNING OBJECTIVES:
 * - Implement Insertion Sort with variable array size
 * - Visualize the array state at each insertion step
 * - Use a helper method to display arrays
 * - Read user input with Scanner
 * - Track the progress of the algorithm visually

 * KEY CONCEPTS:
 * - Insertion Sort: Builds the sorted array one element at a time
 * - Key element: The element being inserted into the sorted portion
 * - Shift operation: Moving elements to the right to make room
 * - Step visualization: Shows array after each outer loop iteration
 * - Variable array size: User can enter any number of elements

 * ALGORITHM COMPLEXITY:
 * - Best case: O(n) (already sorted)
 * - Average case: O(n²)
 * - Worst case: O(n²)
 * - Space: O(1) (in-place)

 * EXAMPLE INPUT:
 * How many numbers do you want to enter? 5
 * Number 1: 5
 * Number 2: 2
 * Number 3: 8
 * Number 4: 1
 * Number 5: 9

 * EXAMPLE OUTPUT:
 * Original Array: 5 2 8 1 9
 * Step 1: 2 5 8 1 9
 * Step 2: 2 5 8 1 9
 * Step 3: 1 2 5 8 9
 * Step 4: 1 2 5 8 9

 * Final ordered arrangement: 1 2 5 8 9
 */

import java.util.Scanner;

public class InsertionSortBiggerToSmaller {
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

        for (int i = 1; i < numbers.length; i++) {
            int current = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > current) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = current;

            System.out.print("Step " + i + ": ");
            showArray(numbers);
        }

        System.out.println("\nFinal ordered arrangement:");
        showArray(numbers);
    }

    public static void showArray(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}