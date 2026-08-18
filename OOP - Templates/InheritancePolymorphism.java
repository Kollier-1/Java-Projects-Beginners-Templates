/**
 * TOPIC: Object-Oriented Programming (Inheritance & Polymorphism)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates inheritance and polymorphism using an
 * animal hierarchy. An abstract base class defines a method that is
 * overridden by each subclass (Dog, Cat, Cow) to produce different
 * sounds. This example shows how polymorphism works with instance methods.

 * LEARNING OBJECTIVES:
 * - Create a base class with a method that can be overridden
 * - Extend a class using the "extends" keyword
 * - Override methods using the @Override annotation
 * - Understand the difference between static and instance methods
 * - Use polymorphism: treat different subclasses uniformly
 * - Store polymorphic objects in an array and iterate through them

 * KEY CONCEPTS:
 * - Inheritance: Subclasses inherit methods from parent
 * - Method Overriding: Redefining a method in a subclass
 * - Polymorphism: Parent reference can hold child object, and the
 *   correct overridden method is called at runtime
 * - Instance methods vs Static methods: Only instance methods are polymorphic
 * - @Override annotation: Helps catch errors at compile time

 * ALGORITHM COMPLEXITY:
 * - Time complexity: O(1) per method call
 * - Space complexity: O(1)

 * EXAMPLE OUTPUT (CORRECT):
 * The dog barks
 * The cat meows
 * The cow moos

 * EXAMPLE OUTPUT (INCORRECT with static):
 * The animal make a sound
 * The animal make a sound
 * The animal make a sound
 */

 abstract class CommonAnimal {
    static void MAKEASound() {
        System.out.println("The animal make a sound");
    }
}

class Dog extends CommonAnimal {
    static void MAKEASound() {
        System.out.println("The dog barks");
    }
}

class Cat extends CommonAnimal {
    static void MAKEASound() {
        System.out.println("The cat meows");
    }
}

class Cow extends CommonAnimal {
    static void MAKEASound() {
        System.out.println("The cow moos");
    }
}

public class InheritancePolymorphism {
    public static void main(String[] args) {
        CommonAnimal [] commonanimals = { new Dog(), new Cat(), new Cow() };

        for (CommonAnimal commonanimal : commonanimals) {
            CommonAnimal.MAKEASound();
        }
    }
}