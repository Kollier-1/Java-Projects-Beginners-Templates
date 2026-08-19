/**
 * TOPIC: Searching Algorithms (Linear Search)
 * LEVEL: Beginner
 * DESCRIPTION: Implements the linear search algorithm on an array of
 * integers. The user enters a number, and the program traverses the
 * array sequentially to find it. This is the simplest search algorithm.

 * LEARNING OBJECTIVES:
 * - Understand the linear search algorithm (sequential traversal)
 * - Implement a basic linear search using a for loop
 * - Use a boolean flag to track if the element was found
 * - Store the position of the found element
 * - Use early termination (break) when the element is found
 * - Read user input with Scanner

 * KEY CONCEPTS:
 * - Linear Search: Checks each element in order from start to end
 * - Sequential traversal: Iterating through the array one by one
 * - Boolean flag: A variable that indicates whether the element was found
 * - Position tracking: Storing the index where the element was found
 * - Early termination: Using break to stop searching once found
 * - Time complexity: O(n) in worst case
 * - Space complexity: O(1) (only a few variables)

 * ALGORITHM COMPLEXITY:
 * - Best case: O(1) (element at first position)
 * - Worst case: O(n) (element at last position or not found)
 * - Average case: O(n)

 * EXAMPLE INPUT:
 * Enter a number to search for: 9

 * EXAMPLE OUTPUT:
 * Number found in position: 3

 * EXAMPLE INPUT (not found):
 * Enter a number to search for: 10

 * EXAMPLE OUTPUT:
 * Number not found in the array.
 */


import java.util.Scanner;

public class BasicLinealSearch {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 9, 1, 7, 4};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to search for: ");
        int searchedNumber = scanner.nextInt();

        boolean found = false;
        int position = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchedNumber) {
                found = true;
                position = i;
                break;
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