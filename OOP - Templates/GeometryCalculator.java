/**
 * TOPIC: Object-Oriented Programming (Interfaces & Polymorphism)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates the use of interfaces with multiple methods
 * (area and perimeter calculation) and parameterized constructors.
 * The program defines an interface for geometric figures, then implements
 * Square and Circle classes with specific formulas.
 
 * LEARNING OBJECTIVES:
 * - Define an interface with multiple abstract methods
 * - Implement interface methods with specific formulas
 * - Use constructors to initialize object properties
 * - Apply polymorphism with interface references
 * - Calculate both area and perimeter for different shapes

 * KEY CONCEPTS:
 * - Interface: Contract with multiple methods (area + perimeter)
 * - Encapsulation: Private fields with constructors for initialization
 * - Polymorphism: Interface references can hold different implementations
 * - Math.PI: Built-in constant for circle calculations
 * - Formulas: Square (side², 4×side), Circle (πr², 2πr)

 * EXAMPLE OUTPUT:
 * Square
 * Area: 25.0
 * Perimeter: 20.0

 * Circle
 * Area: 28.274333882308138
 * Perimeter: 18.84955592153876
 */

 interface figure {
    double calculateArea();
    double calculatePerimeter();
}

class square implements figure {
    private double SIDE;

    public square(double SIde) {
        this.SIDE = SIde;
    }

    @Override
    public double calculateArea() {
        return SIDE * SIDE;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * SIDE;
    }
}

class circle implements figure {
    private double radio;

    public circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radio;
    }
}

public class GeometryCalculator {
    public static void main(String[] args) {
        figure square = new square(5);
        figure Circle = new circle(3);

        System.out.println("Square");
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());

        System.out.println("\nCircle");
        System.out.println("Area: " + Circle.calculateArea());
        System.out.println("Perimeter: " + Circle.calculatePerimeter());
    }
}