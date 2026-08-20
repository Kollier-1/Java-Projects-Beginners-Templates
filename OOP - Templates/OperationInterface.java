/**
 * TOPIC: Object-Oriented Programming (Interfaces & Strategy Pattern)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates the use of interfaces and polymorphism
 * to implement a simple calculator with basic arithmetic operations.
 * The user enters two numbers and selects an operation (sum, multiplication,
 * subtraction), and the program uses the Strategy pattern to execute
 * the selected operation.

 * LEARNING OBJECTIVES:
 * - Define an interface with a single abstract method
 * - Implement the interface for different operations
 * - Use polymorphism to select the appropriate implementation at runtime
 * - Use switch expression (Java 14+) for clean menu handling
 * - Read user input with Scanner
 * - Apply the Strategy design pattern (basic version)

 * KEY CONCEPTS:
 * - Interface: Defines the contract for all operations
 * - Strategy Pattern: Encapsulates interchangeable behaviors
 * - Polymorphism: Interface reference can hold any implementation
 * - Switch expression: Modern Java syntax for cleaner selection
 * - Dynamic binding: Correct calculate() method is called at runtime
 * - Separation of concerns: Each operation is in its own class

 * EXAMPLE INPUT:
 * Enter the first number: 10
 * Enter the second number: 5
 * Select the operation to perform:
 * 1. Sum
 * 2. Multiplication
 * 3. Substraction
 * 1

 * EXAMPLE OUTPUT:
 * The result is: 15

 * EXAMPLE INPUT (invalid option):
 * Select the operation to perform: 4

 * EXAMPLE OUTPUT:
 * Invalid option.
 */

import java.util.Scanner;

interface Operation {
    int calculate(int a, int b);
}

class Sum implements Operation {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

class Multiplication implements Operation {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}   

class Substraction implements Operation {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}   

public class OperationInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Select the operation to perform:");
        System.out.println("1. Sum");
        System.out.println("2. Multiplication");
        System.out.println("3. Substraction");
        int option = scanner.nextInt();

        Operation operation;

        switch (option) {
            case 1 -> operation = new Sum();
            case 2 -> operation = new Multiplication();
            case 3 -> operation = new Substraction();
            default -> {
                System.out.println("Invalid option.");
                return;
            }
        }
        System.out.println("The result is: " + operation.calculate(num1, num2));
    }
}