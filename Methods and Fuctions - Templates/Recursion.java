/**
 * TOPIC: Recursion (Digit Counting)
 * LEVEL: Beginner
 * DESCRIPTION: A recursive program that counts the number of digits
 * in a positive integer. The user enters a number, and the program
 * uses a recursive function to determine how many digits it has.

 * LEARNING OBJECTIVES:
 * - Understand recursion with a practical example (digit counting)
 * - Implement a recursive function with a base case
 * - Use integer division (/ 10) to remove the last digit
 * - Trace the recursive call stack for a given number
 * - Read user input with Scanner and handle positive numbers

 * KEY CONCEPTS:
 * - Recursion: A function that calls itself with a smaller input
 * - Base case: The condition that stops recursion (number < 10)
 * - Recursive case: number / 10 reduces the number by one digit
 * - The recursive call returns 1 (for the removed digit) plus the count
 * - Mathematical principle: Each division by 10 removes the last digit

 * ALGORITHM COMPLEXITY:
 * - Time complexity: O(log₁₀ n) where n is the number
 * - Space complexity: O(log₁₀ n) due to call stack
 * - Number of recursive calls = number of digits

 * EXAMPLE INPUT:
 * Enter a positive whole number:
 * 12345

 * EXAMPLE OUTPUT:
 * The number 12345 have 5 digit(s).

 * EXAMPLE INPUT (single digit):
 * Enter a positive whole number:
 * 7

 * EXAMPLE OUTPUT:
 * The number 7 have 1 digit(s).
 */

import java.util.Scanner;

public class Recursion {

    // Recursive function to count the digits.-
    public static int countDigits(int number) {
        if (number < 10) {
            return 1; // Base case: only one digit.-
        } else {
            return 1 + countDigits(number / 10); // Recursive Call.-
        }
    }

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive whole number: ");
        int number = scanner.nextInt();

        int amount = countDigits(number);
        System.out.println("The number " + number + " have " + amount + "dígit(s).");

        scanner.close();
    }
}