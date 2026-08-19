/**
 * TOPIC: Searching Algorithms (Binary Search - Manual Implementation)
 * LEVEL: Intermediate
 * DESCRIPTION: Implements the binary search algorithm manually on a
 * sorted array. The user enters a number, and the program efficiently
 * finds its position using the divide-and-conquer approach.

 * LEARNING OBJECTIVES:
 * - Understand the binary search algorithm (divide and conquer)
 * - Implement binary search using start, end, and middle pointers
 * - Work with sorted arrays (precondition for binary search)
 * - Handle both found and not-found scenarios
 * - Read user input with Scanner

 * KEY CONCEPTS:
 * - Binary Search: Efficient O(log n) search algorithm
 * - Precondition: Array must be sorted
 * - Divide and conquer: Splits the search space in half each step
 * - Middle calculation: start + (end - start) / 2 (avoids overflow)
 * - Pointers: 'start' and 'end' define the current search range
 * - Efficiency: O(log n) time, O(1) space

 * ALGORITHM COMPLEXITY:
 * - Time complexity: O(log n) where n is array size
 * - Space complexity: O(1) (iterative implementation)

 * EXAMPLE INPUT:
 * Enter a number to search for: 15

 * EXAMPLE OUTPUT:
 * Number found in position: 4

 * EXAMPLE INPUT (not found):
 * Enter a number to search for: 20

 * EXAMPLE OUTPUT:
 * Number not found in the array.
 */

import java.util.Scanner;

public class BinarySearchInSortArray {
    public static void main(String[] args) {
        int[] numbers = {3, 6, 9, 12, 15, 18, 21};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to search for: ");
        int searchedNumber = scanner.nextInt();

        int start = 0, fin = numbers.length - 1;
        boolean found = false;
        int position = -1;

        while (start <= fin) {
            int middle = start + (fin - start) / 2;

            if (numbers[middle] == searchedNumber) {
                found = true;
                position = middle;
                break;
            } else if (numbers[middle] < searchedNumber) {
                start = middle + 1;
            } else {
                fin = middle - 1;
            }
        }

        if (found) {
            System.out.println("Number found in position: " + position);
        } else {
            System.out.println("Number not found in the array.");
        }
        scanner.close();
    }
}