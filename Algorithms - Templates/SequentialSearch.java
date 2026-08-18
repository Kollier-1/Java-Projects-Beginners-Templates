/**
 * TOPIC: Searching Algorithms (Sequential Search)
 * LEVEL: Beginner
 * DESCRIPTION: Implements a sequential (linear) search algorithm to
 * find a specific name within an array of 5 names. The user enters
 * 5 names, then enters a name to search. The program traverses the
 * array and determines if the name exists.
 *
 * LEARNING OBJECTIVES:
 * - Store multiple String values in an array
 * - Read user input using Scanner for both array filling and search
 * - Implement linear search by iterating through the array
 * - Use equalsIgnoreCase() for case-insensitive comparison
 * - Use a boolean flag to track search result
 * - Display the result to the user
 *
 * KEY CONCEPTS:
 * - Sequential/Linear Search: Checking each element one by one
 * - Time complexity: O(n) where n is the array size
 * - equalsIgnoreCase(): Compares strings ignoring case differences
 * - Boolean flag: A variable that tracks whether an element was found
 * - Early termination: Using break to stop when the element is found
 *
 * ALGORITHM COMPLEXITY:
 * - Best case: O(1) (element found at first position)
 * - Worst case: O(n) (element found at last or not found)
 * - Average case: O(n)
 *
 * EXAMPLE INPUT:
 * Enter 5 different names: Alice Bob Charlie David Eve
 * Enter a name to search: charlie
 *
 * EXAMPLE OUTPUT:
 * The name |charlie| are in the list.
 *
 * EXAMPLE INPUT (not found):
 * Enter a name to search: Frank
 *
 * EXAMPLE OUTPUT:
 * The name |Frank| are not in the list.
 */

 import java.util.Scanner;

public class SequentialSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];

        // Ask the user for 5 names.-
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter 5 different names: ");
            names[i] = scanner.nextLine();
        }

        // Ask for the name to search.-
        System.out.print("Enter a name to search: ");
        String searchName = scanner.nextLine();
        boolean found = false;

        // Lineal Search.-
        for (String name : names) {
            if (name.equalsIgnoreCase(searchName)) {
                found = true;
                break;
            }
        }
        // Show the result.-
        if (found) {
            System.out.println("The name |" + searchName + "| are in the list.");
        } else {
            System.out.println("The name |" + searchName + "| are not in the list.");
        }
    }
}