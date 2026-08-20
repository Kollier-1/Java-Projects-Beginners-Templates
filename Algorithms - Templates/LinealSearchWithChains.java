/**
 * TOPIC: Searching Algorithms (Linear Search with Strings)
 * LEVEL: Beginner
 * DESCRIPTION: Implements linear search on an array of strings
 * (product names). The user enters a product name, and the program
 * searches for it sequentially, returning its position if found.

 * LEARNING OBJECTIVES:
 * - Implement linear search on an array of Strings
 * - Use .equals() for string comparison (exact match)
 * - Track position and use a boolean flag
 * - Handle user input with Scanner
 * - Understand the difference between searching ints and Strings

 * KEY CONCEPTS:
 * - Linear Search: Checks each element sequentially
 * - String comparison: Use .equals() instead of ==
 * - Position tracking: Store index when found
 * - Boolean flag: Indicates if the element was found
 * - Early termination: Break the loop when found
 * - Time complexity: O(n) in worst case

 * ALGORITHM COMPLEXITY:
 * - Best case: O(1) (element at first position)
 * - Worst case: O(n) (element at last or not found)
 * - Average case: O(n)

 * EXAMPLE INPUT:
 * Enter a product to search for: orange

 * EXAMPLE OUTPUT:
 * Word found in position: 2

 * EXAMPLE INPUT (not found):
 * Enter a product to search for: mango

 * EXAMPLE OUTPUT:
 * Word not found in array.
 */

import java.util.Scanner;

public class LinealSearchWithChains {
    public static void main(String[] args) {
        String[] productStrings = {"apple", "banana", "orange", "grape", "pear", "kiwi"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a product to search for: ");
        String searchWord = scanner.nextLine();

        boolean found = false;
        int position = -1;

        for (int i = 0; i < productStrings.length; i++) {
            if (productStrings[i].equals(searchWord)) {
                found = true;
                position = i;
                break;
            }
        }

        if (found) {
            System.out.println("Word found in position: " + position);
        } else {
            System.out.println("Word not found in array.");
        }
        scanner.close();
    }
}