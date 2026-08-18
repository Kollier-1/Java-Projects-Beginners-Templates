/**
 * TOPIC: Object-Oriented Programming (Inheritance & Polymorphism)
 * LEVEL: Beginner
 * DESCRIPTION: Demonstrates inheritance and polymorphism using a
 * Vehicle class hierarchy. A base Vehicle class defines a generic
 * move() method, and subclasses (Car, Plane, Ship) override it
 * to provide specific implementations.
 *
 * LEARNING OBJECTIVES:
 * - Create a base class with a method that can be overridden
 * - Extend a class using the "extends" keyword
 * - Override methods using the @Override annotation
 * - Use polymorphism to treat objects of different subclasses uniformly
 * - Store polymorphic objects in an array and iterate through them
 *
 * KEY CONCEPTS:
 * - Inheritance: Subclasses inherit fields and methods from parent
 * - Method Overriding: Redefining a method in a subclass
 * - Polymorphism: Parent reference can hold child object, and the
 *   correct overridden method is called at runtime
 * - @Override annotation: Helps catch errors at compile time
 * - Static nested classes: Used here for simplicity within one file
 *
 * EXAMPLE OUTPUT:
 * === Vehicles in motion ===
 * The car drives on the road.
 * The plane flies through the air.
 * The ship sails in the sea
 */

public class VehiclesInMotion {

    // Class vehicle with the method move()
    static class Vehicle {
        public void move() {
            System.out.println("The vehicle is moving...");
        }
    }

    // Subclass car, plane and ship
    static class Car extends Vehicle {
        @Override
        public void move() {
            System.out.println("The car drives on the road.");
        }
    }

    static class Plane extends Vehicle {
        @Override
        public void move() {
            System.out.println("The plane flies through the air.");
        }
    }

    static class Ship extends Vehicle {
        @Override
        public void move() {
            System.out.println("The ship sails in the sea.");
        }
    }

    // Principal method
    static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Plane(), new Ship() };

        System.out.println("=== Vehicles in motion ===");
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}