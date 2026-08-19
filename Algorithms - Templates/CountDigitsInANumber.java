/**
 * TOPIC: Recursion (Counting Digits)
 * LEVEL: Intermediate
 * DESCRIPTION: Counts the number of digits in a number using recursion.
 * The function divides the number by 10 repeatedly until it becomes
 * a single digit, counting each step. This is a classic recursion example.

 * LEARNING OBJECTIVES:
 * - Understand how to count digits using integer division
 * - Implement a recursive function to count digits
 * - Identify the base case (n < 10)
 * - Trace the recursive call stack for digit counting
 * - Compare this implementation with other digit operations

 * KEY CONCEPTS:
 * - Digit counting: Each division by 10 removes one digit
 * - Recursive case: 1 + countDigits(n / 10)
 * - Base case: n < 10 returns 1 (only one digit)
 * - Time complexity: O(log n) - one digit per recursive call
 * - Space complexity: O(log n) - due to call stack

 * ALGORITHM COMPLEXITY:
 * - Time complexity: O(d) where d is the number of digits
 * - Space complexity: O(d) due to recursion stack

 * EXAMPLE INPUT (hardcoded):
 * number = 123456
 
 * EXAMPLE OUTPUT:
 * The number 123456 have 6 digits.
 *
 * VERIFICATION:
 * 123456 has 6 digits: 1, 2, 3, 4, 5, 6
 */

public class CountDigitsInANumber {

    public static int countDigits(int n) {
        if (n < 10) {
            return 1;
        }
        else {
            return 1 + countDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        int number = 123456;
        int amount = countDigits(number);
        System.out.println("The number " + number + " have " + amount + " dígits.");
    }
}