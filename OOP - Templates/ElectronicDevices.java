/**
 * TOPIC: Object-Oriented Programming (Nested Interfaces & Polymorphism)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates the use of nested interfaces and static
 * nested classes. An interface is defined inside the main class, and
 * two static classes implement it. An array of interface references
 * demonstrates polymorphism with state tracking.

 * LEARNING OBJECTIVES:
 * - Define a nested interface inside a class
 * - Create static nested classes that implement the interface
 * - Use a polymorphic array to hold different implementations
 * - Track state (on/off) within each class
 * - Understand the difference between nested and standalone interfaces

 * KEY CONCEPTS:
 * - Nested interface: An interface defined inside another class
 * - Static nested class: A class defined inside another class with static keyword
 * - State tracking: Using boolean fields to track device status
 * - Polymorphic array: Array of interface references holding concrete objects
 * - Encapsulation: Private fields with public methods to interact

 * EXAMPLE OUTPUT:
 * === Simulation of electronic devices ===
 * The computer has been turned on.
 * The computer has been turned off.

 * The phone has been turned on.
 * The phone has been turned off.
 */

public class ElectronicDevices {

    interface switchingon {
        void turnon();
        void turnoff();
    }


    static class Computer implements switchingon {
        private boolean turnedon = false;

        @Override
        public void turnon() {
            turnedon = true;
            System.out.println("The computer has been turned on.");
        }

        @Override
        public void turnoff() {
            turnedon = false;
            System.out.println("The computer has been turned off.");
        }
    }

    static class Phone implements switchingon {
        private boolean on = false;

        @Override
        public void turnon() {
            on = true;
            System.out.println("The phone has been turned on.");
        }

        @Override
        public void turnoff() {
            on = false;
            System.out.println("The phone has been turned off.");
        }
    }

    public static void main(String[] args) {
        switchingon[] devices = { new Computer(), new Phone() };

        System.out.println("\n=== Simulation of electronic devices ===");
        for (switchingon d : devices) {
            d.turnon();
            d.turnoff();
            System.out.println();
        }
    }
}