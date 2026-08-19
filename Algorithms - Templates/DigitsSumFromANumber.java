/**
 * TOPIC: Recursion (Sum of Digits)
 * LEVEL: Intermediate
 * DESCRIPTION: Calculates the sum of the digits of a number using
 * recursion. The function extracts the last digit using modulo (%),
 * adds it to the sum of the remaining digits using integer division (/),
 * and continues until the number is less than 10.
 
 * LEARNING OBJECTIVES:
 * - Understand how to extract digits from a number using % and /
 * - Implement a recursive function to sum digits
 * - Identify the base case (n < 10)
 * - Trace the recursive call stack for digit summation
 * - Apply modular arithmetic to solve problems

 * KEY CONCEPTS:
 * - Digit extraction: n % 10 gives the last digit
 * - Digit removal: n / 10 removes the last digit
 * - Recursive case: (n % 10) + sumDigits(n / 10)
 * - Base case: n < 10 returns n itself
 * - Time complexity: O(log n) - one digit per recursive call
 * - Space complexity: O(log n) - due to call stack

 * ALGORITHM COMPLEXITY:
 * - Time complexity: O(d) where d is the number of digits
 * - Space complexity: O(d) due to recursion stack

 * EXAMPLE INPUT (hardcoded):
 * number = 345

 * EXAMPLE OUTPUT:
 * The sum of the digits of 345 is: 12

 * VERIFICATION:
 * 3 + 4 + 5 = 12
 */

public class DigitsSumFromANumber {

    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        }
        else {
            return (n % 10) + sumDigits(n / 10);
        }
    }

    public static void main(String[] args) {
        int number = 345;
        int sum = sumDigits(number);
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }
}