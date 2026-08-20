/**
 * TOPIC: Object-Oriented Programming (Abstract Classes & Polymorphism)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates the use of abstract classes and polymorphism
 * through an employee payroll system. An abstract base class defines the
 * contract for calculating payment, and concrete subclasses (EmployeePerHour,
 * FullTimeEmployee) implement this method with their specific formulas.

 * LEARNING OBJECTIVES:
 * - Define an abstract class with an abstract method
 * - Extend the abstract class and implement the abstract method
 * - Use constructors to initialize employee attributes
 * - Apply polymorphism with an array of Employee references
 * - Calculate payments for different employee types uniformly
 * - Understand the benefits of using abstract classes in real-world systems

 * KEY CONCEPTS:
 * - Abstract class: A class that cannot be instantiated directly
 * - Abstract method: A method without a body that must be implemented
 * - Polymorphism: Base class references can hold subclass objects
 * - Constructor chaining: Subclass constructors call superclass constructor
 * - Dynamic method dispatch: Correct calculatePayment() is called at runtime
 * - Payroll logic: Hourly (workedHours × hourlyRate) vs Monthly (fixed salary)

 * EXAMPLE OUTPUT:
 * Payment: $2400.0
 * Payment: $3000.0
 */

abstract class Employee {
    abstract double calculatePayment();
}

class EmployeePerHour extends Employee {
    double workedHours;
    double hourlyRate;

    EmployeePerHour(double workedHours, double hourlyRate) {
        this.workedHours = workedHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculatePayment() {
        return workedHours * hourlyRate;
    }
}

class fulltimeEmployee extends Employee {
    double monthlySalary;

    fulltimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculatePayment() {
        return monthlySalary;
    }
}

public class HoursWorked {
    public static void main(String[] args) {
        Employee[] employees = {
            new EmployeePerHour(160, 15),
            new fulltimeEmployee(3000)
        };

        for (Employee employee : employees) {
            System.out.println("Payment: $" + employee.calculatePayment());
        }
    }
}