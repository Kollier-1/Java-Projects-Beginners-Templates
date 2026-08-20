/**
 * TOPIC: Object-Oriented Programming (Interfaces & Polymorphism)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates the use of interfaces and polymorphism
 * through animals. An interface defines common behaviors (make noise
 * and move), and concrete classes (Dog, Cat) implement these behaviors
 * with their specific actions.
 
 * LEARNING OBJECTIVES:
 * - Define an interface with multiple abstract methods
 * - Implement an interface using the "implements" keyword
 * - Use the @Override annotation for interface methods
 * - Use polymorphism with an array of interface references
 * - Call polymorphic methods on different implementations
 * - Understand dynamic method dispatch

 * KEY CONCEPTS:
 * - Interface: A contract that defines methods to be implemented
 * - Implementation: Concrete classes provide the method bodies
 * - Polymorphism: Interface references can hold any implementing object
 * - Polymorphic array: Array that holds different object types uniformly
 * - Dynamic method dispatch: Correct method is called at runtime

 * EXAMPLE OUTPUT:
 * The dog barks: ¡Guau Guau!
 * The dog runs.

 * The cat meows: ¡Miau Miau!
 * The cat jumps.
 */

interface Animal {
    void makeNoise();
    void move();
}

class Dog implements Animal {
    public void makeNoise() {
        System.out.println("The dog barks: ¡Guau Guau!");
    }

    @Override
    public void move() {
        System.out.println("The dog runs.");
    }
}

class Cat implements Animal {
    public void makeNoise() {
        System.out.println("The cat meows: ¡Miau Miau!");
    }

    @Override
    public void move() {
        System.out.println("The cat jumps.");
    }
}

public class AnotherAnimalsClass {
    public static void main(String[] args) {
        Animal [] animals = {new Dog(), new Cat()};
        for (Animal animal : animals) {
            animal.makeNoise();
            animal.move();
            System.out.println();
     }
   }
}