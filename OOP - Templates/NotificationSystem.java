/**
 * TOPIC: Object-Oriented Programming (Interfaces & Polymorphism)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates the use of interfaces and polymorphism
 * through a notification system. An interface defines the common behavior
 * for sending messages, and concrete classes (Email, SMS, Push) implement
 * this interface with their specific delivery methods.

 * LEARNING OBJECTIVES:
 * - Define an interface with a single abstract method
 * - Implement the interface for different notification types
 * - Use polymorphism with an array of interface references
 * - Send the same message through different notification channels
 * - Understand how polymorphism enables uniform handling of diverse objects

 * KEY CONCEPTS:
 * - Interface: A contract that defines the sendMessage behavior
 * - Polymorphism: Interface references can hold different implementations
 * - Polymorphic array: Array that holds different notification types
 * - Dynamic method dispatch: Correct sendMessage() is called at runtime
 * - Real-world analogy: Different notification channels (email, SMS, push)
 * - Extensibility: Easy to add new notification types (e.g., WhatsApp)

 * EXAMPLE OUTPUT:
 * Sending email: Hi, this is an important notification!

 * Sending SMS: Hi, this is an important notification!

 * Sending push notification: Hi, this is an important notification!

 */

interface Notification {
    void sendMessage(String message);
}

class EmailNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}

class SMSNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}

class PushNotification implements Notification {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending push notification: " + message);
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        Notification[] notifications = {
            new EmailNotification(),
            new SMSNotification(),
            new PushNotification()
        };

        for (Notification notification : notifications) {
            notification.sendMessage("Hi, this is an important notification!");
            System.out.println("---");
        }
    }
}