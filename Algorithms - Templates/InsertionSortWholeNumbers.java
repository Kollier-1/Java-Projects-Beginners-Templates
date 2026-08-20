/**
 * TOPIC: Sorting Algorithms (Insertion Sort with Sentinel Input)
 * LEVEL: Intermediate
 * DESCRIPTION: Implementation of Insertion Sort with dynamic input
 * using a sentinel value (-999). The user enters numbers until they
 * enter -999, and the program sorts them using Insertion Sort.
 * The array has a maximum capacity of 10 elements.

 * LEARNING OBJECTIVES:
 * - Implement Insertion Sort with dynamic input
 * - Use a sentinel value (-999) to terminate input
 * - Handle array capacity limits (max 10 elements)
 * - Sort the entered numbers using Insertion Sort
 * - Display the sorted array

 * KEY CONCEPTS:
 * - Sentinel value: A special value that signals the end of input
 * - Dynamic input: User can enter any number of elements (up to 10)
 * - Array with count: Track the number of actual elements entered
 * - Insertion Sort: Builds the sorted array one element at a time
 * - Key element: The element being inserted into the sorted portion

 * ALGORITHM COMPLEXITY:
 * - Best case: O(n) (already sorted)
 * - Average case: O(n²)
 * - Worst case: O(n²)
 * - Space: O(1) (in-place)

 * EXAMPLE INPUT:
 * Enter between 5 and 10 whole numbers (Enter -999 to finish):
 * 5
 * 2
 * 8
 * 1
 * 9
 * -999

 * EXAMPLE OUTPUT:
 * Ordered Array (Insertion):
 * 1 2 5 8 9

 * EXAMPLE INPUT (with 10 numbers):
 * 10 9 8 7 6 5 4 3 2 1 -999

 * EXAMPLE OUTPUT:
 * Ordered Array (Insertion):
 * 1 2 3 4 5 6 7 8 9 10
 */

import java.util.Scanner;

public class InsertionSortWholeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;

        System.out.println("Enter between 5 and 10 whole numbers (Enter -999 to finish):");
        
        int num = scanner.nextInt();
        while (num != -999 && count < 10) {
            arr[count++] = num;
            if (count<10) {
                num = scanner.nextInt();
            }
        }

        for (int i = 1; i < count; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        System.out.println("Ordered Array (Insertion):");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}