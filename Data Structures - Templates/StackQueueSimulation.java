/**
 * TOPIC: Data Structures (Stack & Queue)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates the use of Stack (LIFO) and Queue (FIFO)
 * data structures from the Java Collections Framework. The program
 * records sales in a stack and customers in a queue, performs some
 * removal operations, and displays the final state of each structure.

 * LEARNING OBJECTIVES:
 * - Use Stack for LIFO (Last In, First Out) operations
 * - Use Queue for FIFO (First In, First Out) operations
 * - Implement Queue using LinkedList
 * - Perform push/pop on Stack and add/poll on Queue
 * - Read user input with Scanner for both structures
 * - Understand the difference between Stack and Queue

 * KEY CONCEPTS:
 * - Stack: LIFO data structure (Last In, First Out)
 * - Queue: FIFO data structure (First In, First Out)
 * - Stack operations: push() adds, pop() removes from top
 * - Queue operations: add() enqueues, poll() dequeues from front
 * - LinkedList: Used as the concrete implementation of Queue
 * - Java Collections Framework: Provides ready-to-use data structures

 * EXAMPLE INPUT:
 * Enter the sales amount to be recorded:
 * 3
 * Sales 1: 150.50
 * Sales 2: 200.75
 * Sales 3: 99.99

 * Enter the number of customers in the queue:
 * 4
 * Client 1: Alice
 * Client 2: Bob
 * Client 3: Charlie
 * Client 4: David

 * EXAMPLE OUTPUT:
 * Final state of the stack (sales): [150.5, 200.75]
 * Final state of the queue (customers): [Charlie, David]

 * EXPLANATION:
 * - Stack: One sales (99.99) was removed (pop)
 * - Queue: Two customers (Alice, Bob) were removed (poll)
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class StackQueueSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Double> sales = new Stack<>();
        Queue<String> clients = new LinkedList<>();

        int amountSales;
        System.out.println("Enter the sales amount to be recorded:");
        amountSales = sc.nextInt();

        for (int i = 0; i < amountSales; i++) {
            System.out.print("Sales " + (i + 1) + ": ");
            sales.push(sc.nextDouble());
        }

        if (!sales.isEmpty()) {
            sales.pop();
        }

        sc.nextLine();

        int amountClients;
        System.out.println("Enter the number of customers in the queue:");
        amountClients = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < amountClients; i++) {
            System.out.print("Client " + (i + 1) + ": ");
            clients.add(sc.nextLine());
        }

        if (!clients.isEmpty()) clients.poll();
        if (!clients.isEmpty()) clients.poll();

        System.out.println("\nFinal state of the stack (sales): " + sales);
        System.out.println("Final state of the queue (customers): " + clients);
    }
}