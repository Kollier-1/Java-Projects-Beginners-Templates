/**
 * TOPIC: Recursion (Sum of Natural Numbers)
 * LEVEL: Beginner
 * DESCRIPTION: Demonstrates recursion by calculating the sum of the
 * first N natural numbers using a recursive function. The formula is:
 * Sum(1 to N) = N + Sum(1 to N-1) with base case Sum(1) = 1.
 
 * LEARNING OBJECTIVES:
 * - Understand recursion with a mathematical example
 * - Identify the base case that stops the recursion
 * - Implement a recursive function with a termination condition
 * - Trace the recursive call stack for a given input
 * - Compare recursive solution with iterative approach

 * KEY CONCEPTS:
 * - Recursion: A function that calls itself to solve smaller instances
 * - Base case: The condition that stops recursion (n == 1)
 * - Recursive case: n + NaturalsSum(n - 1)
 * - Mathematical induction: The recursive definition mirrors the formula
 * - Stack depth: Number of recursive calls equals N

 * ALGORITHM COMPLEXITY:
 * - Time complexity: O(n) (one recursive call per level)
 * - Space complexity: O(n) (due to call stack)

 * EXAMPLE INPUT:
 * N = 10

 * EXAMPLE OUTPUT:
 * The sum of the first 10 natural numbers is: 55

 * FORMULA VERIFICATION:
 * Sum(1 to 10) = 1+2+3+4+5+6+7+8+9+10 = 55
 */

 public class NaturalNumbersSum {
    public static int NaturalsSum(int n) {
        if (n == 1) {
            return 1;
        }
        else {
            return n + NaturalsSum(n - 1);
        }
    }

    public static void main(String[] args) {
        int N = 10;
        int result = NaturalsSum(N);
        System.out.println("The sum of the first " + N + " natural numbers is: " + result);
    }
}