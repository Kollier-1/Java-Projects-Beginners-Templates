/**
 * TOPIC: Searching Algorithms (Binary Search with Arrays class)
 * LEVEL: Beginner
 * DESCRIPTION: Demonstrates the use of Java's built-in Arrays.binarySearch()
 * method to efficiently search for a number in a sorted array. This method
 * uses the binary search algorithm and returns the index if found.

 * LEARNING OBJECTIVES:
 * - Understand how to use Arrays.binarySearch() method
 * - Recognize that binary search requires a sorted array
 * - Use Arrays.toString() to display array contents
 * - Interpret the return value of binarySearch (index or negative insertion point)
 * - Integrate Scanner for user input

 * KEY CONCEPTS:
 * - Arrays.binarySearch(): Built-in method for binary search
 * - Precondition: Array must be sorted before calling binarySearch
 * - Return value: Index if found, negative value if not found
 * - Negative return: (-insertion_point - 1) indicates where to insert
 * - Arrays.toString(): Convenient way to display array contents
 * - Efficiency: O(log n) time complexity

 * ALGORITHM COMPLEXITY:
 * - Time: O(log n) where n is array size
 * - Space: O(1) (iterative implementation)

 * EXAMPLE INPUT:
 * Ordered Array: [26, 37, 48, 59, 62, 73, 84, 95]
 * Enter a number to search for: 59

 * EXAMPLE OUTPUT:
 * The number 59 it's in the array at position 3.

 * EXAMPLE INPUT (not found):
 * Enter a number to search for: 50

 * EXAMPLE OUTPUT:
 * The number 50 it's not in the array.
 */

import java.util.Arrays;
import java.util.Scanner;

public class OrderedArraysBinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {26, 37, 48, 59, 62, 73, 84, 95};

        System.out.println("Ordered Array: " + Arrays.toString(numbers));
        System.out.print("Enter a number to search for: ");
        int numberSearch = scanner.nextInt();

        int index = Arrays.binarySearch(numbers, numberSearch);

        if (index >= 0) {
            System.out.println("The number " + numberSearch + " it's in the array at position " + index + ".");
        } else {
            System.out.println("The number " + numberSearch + " it's not in the array.");
        }
    }
}