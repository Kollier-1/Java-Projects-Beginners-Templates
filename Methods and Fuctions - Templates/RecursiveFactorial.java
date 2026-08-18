/**
 * TOPIC: Recursion
 * LEVEL: Beginner
 * DESCRIPTION: Demonstrates the concept of recursion by calculating
 * the factorial of a number using a recursive function.
 * The factorial of n (n!) is defined as n * (n-1) * ... * 1.

 * LEARNING OBJECTIVES:
 * - Understand the concept of recursion (a function calling itself)
 * - Identify the base case that stops the recursion
 * - Implement a recursive function with a termination condition
 * - Trace the execution of a recursive call stack

 * KEY CONCEPTS:
 * - Recursion: A method that calls itself to solve smaller instances
 * - Base case: The condition that stops the recursion (n == 0)
 * - Recursive case: The step where the function calls itself (n * factorial(n-1))
 * - Stack overflow: Risk with large numbers (recursion depth)

 * EXAMPLE OUTPUT:
 * The factorial of 16 is: 20922789888000

 * ALGORITHM COMPLEXITY:
 * - Time complexity: O(n) (one recursive call per level)
 * - Space complexity: O(n) (due to call stack)
 */

public class RecursiveFactorial {
    public static int factorial (int n) {
        if (n == 0) {
            return 1;
           } else {
                return n * factorial(n-1);
            }
        }

        public static void main(String[] args) {
            int numero = 16;
            System.out.println("El factorial de " + numero + " es: " + factorial(numero));
        }
    }