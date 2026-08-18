/**
 * TOPIC: Object-Oriented Programming (Abstract Classes & Polymorphism)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates the use of abstract classes and polymorphism
 * through an electric vehicle example. An abstract base class defines
 * abstract methods for driving and charging, and concrete subclasses
 * (ElectricCar, ElectricBicycle, ElectricScooter) provide specific
 * implementations of these behaviors.
 *
 * LEARNING OBJECTIVES:
 * - Define an abstract class with abstract methods
 * - Extend an abstract class and implement its abstract methods
 * - Use the @Override annotation to ensure proper method overriding
 * - Use polymorphism: treating different subclasses uniformly
 * - Store polymorphic objects in an array and iterate through them
 *
 * KEY CONCEPTS:
 * - Abstract class: Cannot be instantiated directly, serves as a template
 * - Abstract methods: Have no body, must be implemented by subclasses
 * - Polymorphism: A parent reference can hold child objects, and the
 *   correct overridden method is called at runtime
 * - Dynamic method dispatch: Java determines which method to call at runtime
 * - Inheritance hierarchy: ElectricVehicle → ElectricCar, ElectricBicycle, ElectricScooter
 *
 * EXAMPLE OUTPUT:
 * The electric car is running.
 * Charging the electric car's battery.
 * ---
 * The electric bike is on the move.
 * Connecting the electric bike to the portable charger.
 * ---
 * The electric scooter is on.
 * The scooter is charging at home.
 * ---
 */

 // Base class
abstract class ElectricVehicle {
    abstract void drive();
    abstract void chargeBattery();
}

// Subclass: Electric Car
class ElectricCar extends ElectricVehicle {
    @Override
    void drive() {
        System.out.println("The electric car is running.");
    }

    @Override
    void chargeBattery() {
        System.out.println("Charging the electric car's battery.");
    }
}

// Subclass: Electric Bicycle
class ElectricBicycle extends ElectricVehicle {
    @Override
    void drive() {
        System.out.println("The electric bike is on the move.");
    }

    @Override
    void chargeBattery() {
        System.out.println("Connecting the electric bike to the portable charger.");
    }
}

// Subclass: Electric Scooter
class ElectricScooter extends ElectricVehicle {
    @Override
    void drive() {
        System.out.println("The electric scooter is on.");
    }

    @Override
    void chargeBattery() {
        System.out.println("The scooter is charging at home.");
    }
}

// Main Method
public class polymorphism {
    public static void main(String[] args) {
        ElectricVehicle[] vehicles = {
            new ElectricCar(),
            new ElectricBicycle(),
            new ElectricScooter()
        };

        for (ElectricVehicle vehicle : vehicles) {
            vehicle.drive();
            vehicle.chargeBattery();
            System.out.println("---");
        }
    }
}