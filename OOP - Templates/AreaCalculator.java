/**
 * TOPIC: Object-Oriented Programming (Interfaces & Polymorphism)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates the use of interfaces and polymorphism
 * through a geometric figure example. An interface defines a method
 * for calculating area, and concrete classes (Square, Rectangle)
 * implement this interface with their own area formulas.
 
 * LEARNING OBJECTIVES:
 * - Define an interface with an abstract method
 * - Implement an interface using the "implements" keyword
 * - Use the @Override annotation for interface methods
 * - Use polymorphism: interface reference holds concrete objects
 * - Calculate area of different shapes using the same method

 * KEY CONCEPTS:
 * - Interface: A contract that defines methods to be implemented
 * - Implementation: Concrete classes provide the method body
 * - Polymorphism: Interface references can hold any implementing object
 * - Area formulas: Square = side², Rectangle = base × height
 * - Loose coupling: Code depends on interface, not concrete classes

 * EXAMPLE OUTPUT:
 * Square Area: 25.0
 * Rectangle Area: 24.0
 */

 interface Figure {
    double calculateArea();
}

class Square implements Figure {
    @Override
    public double calculateArea() {
        double side = 5.0;
        return side * side;
    }
}

class Rectangle implements Figure {
    @Override
    public double calculateArea() {
        double base = 4.0;
        double height = 6.0;
        return base * height;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Figure square = new Square();
        Figure rectangle = new Rectangle();

        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}