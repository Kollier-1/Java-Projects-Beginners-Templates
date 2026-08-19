/**
 * TOPIC: Recursion (Exponentiation / Power Calculation)
 * LEVEL: Intermediate
 * DESCRIPTION: Calculates the power of a number using recursion.
 * The function computes a^n (a raised to the power n) using the
 * recursive definition: a^n = a * a^(n-1) with base case a^0 = 1.
 
 * LEARNING OBJECTIVES:
 * - Understand the mathematical definition of exponentiation
 * - Implement a recursive function for power calculation
 * - Identify the base case (n == 0)
 * - Trace the recursive call stack for exponentiation
 * - Analyze the time complexity of the recursive implementation

 * KEY CONCEPTS:
 * - Exponentiation: a^n = a * a * ... * a (n times)
 * - Recursive definition: a^n = a * a^(n-1) for n > 0
 * - Base case: a^0 = 1
 * - Recursive case: a * exponent(a, n-1)
 * - Time complexity: O(n) - one multiplication per level
 * - Space complexity: O(n) - due to call stack

 * ALGORITHM COMPLEXITY:
 * - Time complexity: O(n) where n is the exponent
 * - Space complexity: O(n) due to recursion stack

 * EXAMPLE INPUT (hardcoded):
 * base = 2, exponent = 5

 * EXAMPLE OUTPUT:
 * 2^5 = 32

 * VERIFICATION:
 * 2^5 = 2 * 2 * 2 * 2 * 2 = 32
 */

public class ExponentOfANumber {

    public static int Exponent(int a, int n) {
        if (n == 0) {
            return 1;
        }
        else {
            return a * Exponent(a, n - 1);
        }
    }

    public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int result = Exponent(base, exponent);
        System.out.println(base + "^" + exponent + " = " + result);
    }
}