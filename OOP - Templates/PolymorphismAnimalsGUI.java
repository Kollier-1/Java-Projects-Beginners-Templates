/**
* TOPIC: Object-Oriented Programming (Interfaces & Polymorphism)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates the use of interfaces and polymorphism
 * through animals. An interface defines common behaviors (make a noise
 * and move), and concrete classes (Dog, Cat, Bird) implement these
 * behaviors with their specific actions.
 
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
 * - Real-world analogy: Different animals have different sounds/movements

         * EXAMPLE OUTPUT:
        * The dog barks: ¡Guau Guau!
        * The dog runs happily.

        * The cat meows: ¡Miau Miau!
        * The cat moves stealthily.

        * The bird sings: ¡Pío Pío!
        * The bird flies through the sky.

        */

interface Animal {
    void makeAnoise();
    void move();
}

class Dog implements Animal {
    @Override
    public void makeAnoise() {
        System.out.println("The dog barks: ¡Guau Guau!");
    }

    @Override
    public void move() {
        System.out.println("The dog runs happily.");
    }
}

class Cat implements Animal {
    @Override
    public void makeAnoise() {
        System.out.println("The cat meows: ¡Miau Miau!");
    }

    @Override
    public void move() {
        System.out.println("The cat moves stealthily.");
    }
}

class Bird implements Animal {
    @Override
    public void makeAnoise() {
        System.out.println("The bird sings: ¡Pío Pío!");
    }

    @Override
    public void move() {
        System.out.println("The bird flies through the sky.");
    }
}

public class PolymorphismAnimalsGUI {
    public static void main(String[] args) {
        Animal[] animals = { new Dog(), new Cat(), new Bird() };

        for (Animal a : animals) {
            a.makeAnoise();
            a.move();
            System.out.println("---");
        }
    }
}