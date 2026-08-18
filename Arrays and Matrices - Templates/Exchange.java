/**
 * TOPIC: Arrays (Element Exchange/Swap)
 * LEVEL: Beginner
 * DESCRIPTION: Reads 6 names from the user into an array, then swaps
 * the first and last elements of the array. This demonstrates the
 * fundamental swap operation used in many algorithms.

 * LEARNING OBJECTIVES:
 * - Declare and initialize a String array with a fixed size
 * - Read String input from user using Scanner.nextLine()
 * - Perform a swap operation between two array elements
 * - Use a temporary variable to hold one value during swap
 * - Display the array after the swap operation

 * KEY CONCEPTS:
 * - Swap operation: Exchanging values between two positions
 * - Temporary variable: 'temp' stores one value during the exchange
 * - Array indexing: Accessing first (index 0) and last (length-1) elements
 * - String arrays: Storing text data in arrays
 * - Scanner.nextLine(): Reading entire lines of text input

 * EXAMPLE INPUT:
 * Enter 6 names:
 * Name 1: Alice
 * Name 2: Bob
 * Name 3: Charlie
 * Name 4: David
 * Name 5: Eve
 * Name 6: Frank

 * EXAMPLE OUTPUT:
 * Names after the exchange:
 * Frank
 * Bob
 * Charlie
 * David
 * Eve
 * Alice
 */

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[6];

        System.out.println("Enter 6 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        String temp = names[0];
        names[0] = names[names.length - 1];
        names[names.length - 1] = temp;

        System.out.println("Names after the exchange:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}