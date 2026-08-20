/**
 * TOPIC: Recursion (Factorial with Class Delegation)
 * LEVEL: Intermediate
 * DESCRIPTION: Calculates the factorial of a number using recursion.
 * The program uses two classes: Math (which contains the recursive method)
 * and MathClassRecursiveMethod (which contains the main entry point).
 * This demonstrates how to organize code across multiple classes.

 * LEARNING OBJECTIVES:
 * - Implement a recursive method to calculate factorial
 * - Use the base case (n == 0 or n == 1)
 * - Organize code across multiple classes
 * - Use delegation: one class calls another's main method
 * - Read user input with Scanner

 * KEY CONCEPTS:
 * - Recursion: A function that calls itself
 * - Factorial: n! = n * (n-1) * ... * 1
 * - Base case: 0! = 1, 1! = 1
 * - Delegation: Math.main() calls MathClassRecursiveMethod.main()
 * - Multiple classes: Separating concerns into different classes

 * ALGORITHM COMPLEXITY:
 * - Time complexity: O(n) where n is the input number
 * - Space complexity: O(n) due to recursion stack

 * EXAMPLE INPUT:
 * Enter a number to calculate its factorial: 5

 * EXAMPLE OUTPUT:
 * The factorial of 5 is: 120
 */

import java.util.Scanner;

class Math {
    public int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) { MathClassRecursiveMethod.main(args);
    }
}

public class MathClassRecursiveMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();

        Math mat = new Math();
        int result = mat.factorial(number);

        System.out.println("The factorial of " + number + " is: " + result);
    }
}