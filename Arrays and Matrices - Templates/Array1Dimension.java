/**
 * TOPIC: Arrays (1D Array Reversal)
 * LEVEL: Beginner
 * DESCRIPTION: Reads 10 integers from the user, stores them in an array,
 * creates a new array with the elements in reverse order, and displays
 * both the original and the reversed (invested) arrays.
 
 * LEARNING OBJECTIVES:
 * - Declare and initialize a 1D array with a fixed size
 * - Read user input into an array using Scanner
 * - Create a new array and fill it with reversed elements
 * - Use array indexing to access elements from the end
 * - Display array contents using enhanced for loop

 * KEY CONCEPTS:
 * - 1D Array: A linear collection of elements
 * - Array reversal: Copying elements from end to start
 * - Index calculation: original[length - 1 - i] gives reverse order
 * - Enhanced for loop: for (int num : array) for iteration
 * - Input/Output: Scanner for input, System.out for output

 * EXAMPLE INPUT:
 * Enter 10 numbers:
 * Number 1: 1
 * Number 2: 2
 * Number 3: 3
 * Number 4: 4
 * Number 5: 5
 * Number 6: 6
 * Number 7: 7
 * Number 8: 8
 * Number 9: 9
 * Number 10: 10

 * EXAMPLE OUTPUT:
 * Original Array:
 * 1 2 3 4 5 6 7 8 9 10
 * Invested Array:
 * 10 9 8 7 6 5 4 3 2 1
 */

 import java.util.Scanner;

public class Array1Dimension {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] original = new int[10];
        int[] invested = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < original.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            original[i] = sc.nextInt();
        }

        for (int i = 0; i < original.length; i++) {
            invested[i] = original[original.length - 1 - i];
        }

        System.out.println("Original Array:");
        for (int num : original) System.out.print(num + " ");

        System.out.println("\nInvested Array:");
        for (int num : invested) System.out.print(num + " ");
    }
}