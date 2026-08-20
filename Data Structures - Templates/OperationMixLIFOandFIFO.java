/**
 * TOPIC: Data Structures (LIFO & FIFO Mixed Operations)
 * LEVEL: Intermediate
 * DESCRIPTION: Demonstrates a mixed LIFO (Stack) and FIFO (Queue)
 * operation using a single ArrayList. The user enters items and then
 * chooses whether to process the stack (LIFO) first or the queue (FIFO)
 * first. This shows how to simulate both structures in one container.

 * LEARNING OBJECTIVES:
 * - Simulate Stack (LIFO) and Queue (FIFO) using a single ArrayList
 * - Implement push/pop operations on an ArrayList
 * - Implement enqueue/dequeue operations on an ArrayList
 * - Allow user to choose the processing order
 * - Handle user input with Scanner and conditional logic

 * KEY CONCEPTS:
 * - Stack (LIFO): Last In, First Out - remove from end (size()-1)
 * - Queue (FIFO): First In, First Out - remove from beginning (0)
 * - Dual structure: Single ArrayList used for both operations
 * - User choice: Conditional processing based on user input
 * - Operation order: Stack first or Queue first

 * EXAMPLE INPUT:
 * Enter 3 items for the STACK (LIFO):
 * Stack element 1: A
 * Stack element 2: B
 * Stack element 3: C

 * Enter 2 items for the QUEUE (FIFO):
 * Tail element 1: D
 * Tail element 2: E

 * What do you want to process first? (stack/queue): stack

 * EXAMPLE OUTPUT (if stack first):
 * Processing STACK (LIFO):
 * C
 * B
 * A

 * Processing QUEUE (FIFO):
 * D
 * E

 * EXAMPLE OUTPUT (if queue first):
 * Processing QUEUE (FIFO):
 * D
 * E

 * Processing STACK (LIFO):
 * C
 * B
 * A
 */

import java.util.ArrayList;
import java.util.Scanner;

public class OperationMixLIFOandFIFO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> structure = new ArrayList<>();

        System.out.println("Enter 3 items for the STACK (LIFO):");
        for (int i = 0; i < 3; i++) {
            System.out.print("Stack element " + (i + 1) + ": ");
            structure.add(sc.nextLine());
        }

        System.out.println("\nEnter 2 items for the QUEUE (FIFO):");
        for (int i = 0; i < 2; i++) {
            System.out.print("Tail element " + (i + 1) + ": ");
            structure.add(sc.nextLine());
        }

        System.out.print("\nWhat do you want to process first? (stack/queue): ");
        String option = sc.nextLine().toLowerCase();

        System.out.println();

        if (option.equals("pila")) {
            System.out.println("Processing STACK (LIFO):");
            for (int i = 0; i < 3; i++) {
                System.out.println(structure.remove(structure.size() - 1)); // pop
            }

            System.out.println("\nProcessing QUEUE (FIFO):");
            for (int i = 0; i < 2; i++) {
                System.out.println(structure.remove(0)); // dequeue
            }

        } else if (option.equals("cola")) {
            System.out.println("Processing QUEUE (FIFO):");
            for (int i = 0; i < 2; i++) {
                System.out.println(structure.remove(0));
            }

            System.out.println("\nProcessing STACK (LIFO):");
            for (int i = 0; i < 3; i++) {
                System.out.println(structure.remove(structure.size() - 1));
            }

        } else {
            System.out.println("Invalid option.");
        }

        sc.close();
    }
}