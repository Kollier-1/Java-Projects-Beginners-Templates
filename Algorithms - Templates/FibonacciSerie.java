/**
 * TOPIC: Recursion (Fibonacci Series)
 * LEVEL: Intermediate
 * DESCRIPTION: Generates the Fibonacci series using recursion.
 * The user enters the number of terms, and the program prints
 * the Fibonacci sequence up to that term. The Fibonacci sequence
 * is defined as: F(0) = 0, F(1) = 1, F(n) = F(n-1) + F(n-2).

 * LEARNING OBJECTIVES:
 * - Understand the Fibonacci sequence mathematical definition
 * - Implement a recursive function to compute Fibonacci numbers
 * - Identify the base cases (n <= 1)
 * - Trace the recursive call stack for Fibonacci
 * - Generate a series by iterating over the recursive function

 * KEY CONCEPTS:
 * - Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 * - Recursion: Function calls itself to compute smaller subproblems
 * - Base cases: F(0) = 0, F(1) = 1
 * - Recursive case: F(n) = F(n-1) + F(n-2)
 * - Exponential time complexity: O(2^n) for naive recursion
 * - Memoization: Can be used to optimize the algorithm

 * ALGORITHM COMPLEXITY:
 * - Time complexity: O(2^n) for naive recursive implementation
 * - Space complexity: O(n) due to call stack depth

 * EXAMPLE INPUT:
 * Enter a number of terms from the Fibonacci series: 10

 * EXAMPLE OUTPUT:
 * Fibonacci Serie: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 */

import java.util.Scanner;

public class FibonacciSerie {

    public static int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number of terms from the Fibonacci series: ");
        int n = scanner.nextInt();

        System.out.print("Fibonacci Serie: ");
        for (int i = 0; i < n; i++) {
            System.out.print(Fibonacci(i));
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        scanner.close();
        System.out.println();
    }
}