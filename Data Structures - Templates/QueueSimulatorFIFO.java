/**
 * TOPIC: Data Structures (Queues - FIFO)
 * LEVEL: Beginner
 * DESCRIPTION: Simulates a FIFO (First In, First Out) queue using
 * an ArrayList. The program reads 5 customer names, stores them in
 * the queue, and processes them in the order they were added.

 * LEARNING OBJECTIVES:
 * - Understand the FIFO (First In, First Out) queue concept
 * - Use an ArrayList to implement a simple queue
 * - Add elements to the queue using add()
 * - Remove elements from the front using remove(0)
 * - Simulate a real-world queue (customer service)
 * - Use while loop to process all elements until empty

 * KEY CONCEPTS:
 * - Queue: A data structure that follows FIFO principle
 * - Enqueue: Adding elements to the back of the queue (add())
 * - Dequeue: Removing elements from the front (remove(0))
 * - ArrayList: A resizable array implementation
 * - FIFO: First element added is the first element removed
 * - Real-world analogy: Customer service line, printer queue

 * EXAMPLE INPUT:
 * Enter 5 customer names:
 * Client 1: Alice
 * Client 2: Bob
 * Client 3: Charlie
 * Client 4: David
 * Client 5: Eve

 * EXAMPLE OUTPUT:
 * Attending to customers (FIFO):
 * Alice
 * Bob
 * Charlie
 * David
 * Eve
 */

import java.util.ArrayList;
import java.util.Scanner;

public class QueueSimulatorFIFO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> queue = new ArrayList<>();

        System.out.println("Enter 5 customer names:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Client " + (i + 1) + ": ");
            queue.add(sc.nextLine());
        }

        System.out.println("\nAttending to customers (FIFO):");
        while (!queue.isEmpty()) {
            String client = queue.remove(0); // dequeue
            System.out.println(client);
        }

        sc.close();
    }
}