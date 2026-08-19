/**
 * TOPIC: Object-Oriented Programming (Interfaces & Polymorphism)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates the use of interfaces and polymorphism
 * through vehicles. An interface defines the common behavior
 * (startup and brake), and concrete classes (Car, Bike) implement
 * this interface with their specific messages.

 * LEARNING OBJECTIVES:
 * - Define an interface with multiple abstract methods
 * - Implement an interface using the "implements" keyword
 * - Use the @Override annotation for interface methods
 * - Use polymorphism with an array of interface references
 * - Call polymorphic methods on different implementations

 * KEY CONCEPTS:
 * - Interface: A contract that defines methods to be implemented
 * - Implementation: Concrete classes provide the method bodies
 * - Polymorphism: Interface references can hold any implementing object
 * - Polymorphic array: Array that holds different object types uniformly
 * - Dynamic method dispatch: Correct method is called at runtime

 * EXAMPLE OUTPUT:
 * The car is running...
 * The car stopped...
 * The motorcycle is running...
 * The motorcycle stopped...
 */

interface Vehicle {
    void startup();
    void brake();
}

class Car implements Vehicle {
    @Override
    public void startup() {
        System.out.println("The car is running...");
    }

    @Override
    public void brake() {
        System.out.println("The car stopped...");
    }
}

class Bike implements Vehicle {
    @Override
    public void startup() {
        System.out.println("The motorcycle is running...");
    }

    @Override
    public void brake() {
        System.out.println("The motorcycle stopped...");
    }
}

public class CarAndBikeClass {
    public static void main(String[] args) {
        Vehicle[] vehicles = { new Car(), new Bike() };

        for (Vehicle v : vehicles) {
            v.startup();
            v.brake();
    }
  }
}