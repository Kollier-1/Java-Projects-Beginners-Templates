/**
 * TOPIC: Object-Oriented Programming (Interfaces & Polymorphism)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates the use of interfaces and polymorphism
 * through electronic devices. An interface defines the common behavior
 * (turn on and turn off), and concrete classes (Computer, Television)
 * implement this interface with their specific messages.
 
 * LEARNING OBJECTIVES:
 * - Define an interface with multiple abstract methods
 * - Implement an interface using the "implements" keyword
 * - Use the @Override annotation for interface methods
 * - Use polymorphism: interface references hold concrete objects
 * - Call polymorphic methods on different implementations

 * KEY CONCEPTS:
 * - Interface: A contract that defines methods to be implemented
 * - Implementation: Concrete classes provide the method bodies
 * - Polymorphism: Interface references can hold any implementing object
 * - Dynamic method dispatch: Correct method is called at runtime
 * - Real-world analogy: Different devices with same operations

 * EXAMPLE OUTPUT:
 * The computer is ready to use...
 * The computer has turned off...

 * The television is displaying a signal....
 * The television has turned off...
 */

interface Device {
    void turnon();
    void turnoff();
}

class Computer implements Device {
    @Override
    public void turnon() {
        System.out.println("The computer is ready to use...");
    }

    @Override
    public void turnoff() {
        System.out.println("The computer has turned off...");
    }
}

class Television implements Device {
    @Override
    public void turnon() {
        System.out.println("The television is displaying a signal....");
    }

    @Override
    public void turnoff() {
        System.out.println("The television has turned off...");
    }
}

public class ElectronicDevicesDomestic {
    public static void main(String[] args) {
        Device compu = new Computer();
        Device tv = new Television();

        compu.turnon();
        compu.turnoff();

        System.out.println();

        tv.turnon();
        tv.turnoff();
    }
}