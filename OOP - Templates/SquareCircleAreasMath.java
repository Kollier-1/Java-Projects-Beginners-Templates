/**
 * TOPIC: Object-Oriented Programming (Abstract Classes & Polymorphism)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates the use of abstract classes and polymorphism
 * with geometric figures. An abstract base class defines an abstract method
 * for area calculation, and concrete subclasses (Circle, Square, Triangle)
 * implement this method with their own formulas.

 * LEARNING OBJECTIVES:
 * - Define an abstract class with an abstract method
 * - Extend the abstract class and implement the abstract method
 * - Use constructors to initialize figure dimensions
 * - Apply polymorphism with an array of Figure references
 * - Override methods using @Override annotation

 * KEY CONCEPTS:
 * - Abstract class: A class that cannot be instantiated directly
 * - Abstract method: A method without a body that must be implemented
 * - Polymorphism: Base class references can hold subclass objects
 * - Constructor chaining: Subclass constructors call superclass constructor
 * - Dynamic method dispatch: Correct method is called at runtime
 * - Area formulas: Circle (πr²), Square (side²), Triangle (base×height/2)

 * EXAMPLE OUTPUT:
 * Circle's Area: 78.53981633974483
 * Square's Area: 16.0
 * Triangle's Area: 9.0
 */


abstract class Figure {
    abstract void calculateArea();
}

class Circle extends Figure {
    double radio;

    // Constructor
    Circle(double radio) {
        this.radio = radio;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radio * radio;
        System.out.println("Circle's Area: " + area);
    }
}

class Square extends Figure {
    double side;

    // Constructor
    Square(double side) {
        this.side = side;
    }

    @Override
    void calculateArea() {
        double area = side * side;
        System.out.println("Square's Area: " + area);
    }
}

class Triangle extends Figure {
    double base, height;

    // Constructor
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void calculateArea() {
        double area = (base * height) / 2;
        System.out.println("Triangle's Area: " + area);
    }
}

public class SquareCircleAreasMath {
    public static void main(String[] args) {
        Figure[] figures = {
            new Circle(5),
            new Square(4),
            new Triangle(3, 6)
        };

        for (Figure figura : figures) {
            figura.calculateArea();
        }
    }
}