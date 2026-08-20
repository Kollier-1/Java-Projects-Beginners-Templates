/**
 * TOPIC: Object-Oriented Programming (Inner Classes & Encapsulation)
 * LEVEL: Advanced
 * DESCRIPTION: Demonstrates the use of inner classes and encapsulation
 * through a shopping cart system. The Cart class contains an inner Item
 * class that represents individual products, with methods to calculate
 * subtotals and display the cart contents.

 * LEARNING OBJECTIVES:
 * - Create and use inner classes in Java
 * - Encapsulate data with private fields and public methods
 * - Use ArrayList to store multiple items
 * - Override toString() for custom string representation
 * - Calculate subtotals and total amounts
 * - Structure a real-world application using OOP principles

 * KEY CONCEPTS:
 * - Inner class: A class defined inside another class
 * - Encapsulation: Private fields with public access methods
 * - ArrayList: Resizable array for storing items
 * - toString(): Overridden to provide readable item representation
 * - Subtotal calculation: price × amount
 * - Total calculation: Sum of all subtotals
 * - Real-world analogy: E-commerce shopping cart

 * EXAMPLE OUTPUT:
 * Laptop x1 = $800.0
 * Mouse x2 = $40.0
 * Keyboard x1 = $50.0
 * TOTAL = $890.0
 */

import java.util.ArrayList;

class Cart {
    private ArrayList<Item> items = new ArrayList<>();

    class Item {
        private String name;
        private double price;
        private int amount;

        Item(String name, double price, int amount) {
            this.name = name;
            this.price = price;
            this.amount = amount;
        }

        double getSubtotal() {
            return price * amount;
        }

        @Override
        public String toString() {
            return name + " x" + amount + " = $" + getSubtotal();
        }
    }

    public void addItem(String name, double price, int amount) {
        items.add(new Item(name, price, amount));
    }

    public void showCart() {
        double total = 0;
        for (Item i : items) {
            System.out.println(i);
            total += i.getSubtotal();
        }
        System.out.println("TOTAL = $" + total);
    }
}

public class InnerClassShopping {
    public static void main(String[] args) {
        Cart cart = new Cart();
        cart.addItem("Laptop", 800, 1);
        cart.addItem("Mouse", 20, 2);
        cart.addItem("Keyboard", 50, 1);

        cart.showCart();
    }
}