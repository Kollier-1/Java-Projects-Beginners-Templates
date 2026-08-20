/**
 * TOPIC: Object-Oriented Programming (Inheritance & Polymorphism)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates inheritance and polymorphism through
 * musical instruments. A base Instrument class defines a play() method,
 * and subclasses (Guitar, Piano, Drums) override it with their own
 * sounds. A polymorphic array demonstrates treating different instruments
 * uniformly.

 * LEARNING OBJECTIVES:
 * - Create a base class with a method that can be overridden
 * - Extend a class using the "extends" keyword
 * - Override methods using the @Override annotation
 * - Use polymorphism with an array of base class references
 * - Use static nested classes for organizational clarity
 * - Understand dynamic method dispatch

 * KEY CONCEPTS:
 * - Inheritance: Subclasses inherit methods from parent
 * - Method Overriding: Redefining a method in a subclass
 * - Polymorphism: Base class references can hold subclass objects
 * - Static nested classes: Classes defined inside another class with static
 * - Dynamic method dispatch: Correct play() method is called at runtime
 * - Real-world analogy: Different instruments produce different sounds

 * EXAMPLE OUTPUT:
 * === Instrumental Concert ===
 * The guitar sounds: Tirin tirin!
 * The piano plays: Plin plin!
 * The drums are playing: Pam pam crash!
 */

public class MusicalInstruments {

    static class Instrument {
        public void play() {
            System.out.println("The instrument is producing sound....");
        }
    }

    static class Guitar extends Instrument {
        @Override
        public void play() {
            System.out.println("The guitar sounds: Tirin tirin!");
        }
    }

    static class Piano extends Instrument {
        @Override
        public void play() {
            System.out.println("The piano plays: Plin plin!");
        }
    }

    static class Drums extends Instrument {
        @Override
        public void play() {
            System.out.println("The drums are playing: Pam pam crash!");
        }
    }

    public static void main(String[] args) {
        Instrument[] instruments = { new Guitar(), new Piano(), new Drums() };

        System.out.println("\n=== Instrumental Concert ===");
        for (Instrument inst : instruments) {
            inst.play();
        }
    }
}