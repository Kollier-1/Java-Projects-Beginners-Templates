/**
 * TOPIC: Data Structures (Stack - LIFO Simulation with ArrayList)
 * LEVEL: Beginner
 * DESCRIPTION: Simulates a Stack (LIFO - Last In, First Out) data
 * structure using an ArrayList. The program reads 5 numbers, stores
 * them in the stack, and then extracts them in reverse order (LIFO).
 
 * LEARNING OBJECTIVES:
 * - Understand the LIFO (Last In, First Out) stack concept
 * - Use an ArrayList to implement a simple stack
 * - Push elements using add()
 * - Pop elements using remove(size() - 1)
 * - Simulate stack behavior with a real-world example

 * KEY CONCEPTS:
 * - Stack: A data structure that follows LIFO principle
 * - Push: Adding an element to the top of the stack (add())
 * - Pop: Removing the top element from the stack (remove(size()-1))
 * - LIFO: Last element added is the first element removed
 * - ArrayList: A resizable array used to store elements
 * - Real-world analogy: Stack of plates, undo/redo operations

 * EXAMPLE INPUT:
 * Enter 5 numbers:
 * Number 1: 10
 * Number 2: 20
 * Number 3: 30
 * Number 4: 40
 * Number 5: 50

 * EXAMPLE OUTPUT:
 * Extracting elements (LIFO):
 * 50
 * 40
 * 30
 * 20
 * 10
 */

 import java.util.ArrayList;
import java.util.Scanner;

public class StackSimulate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> stack = new ArrayList<>();

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            stack.add(sc.nextInt());
        }

        System.out.println("\nExtracting elements (LIFO):");
        while (!stack.isEmpty()) {
            int element = stack.remove(stack.size() - 1); // pop
            System.out.println(element);
        }

        sc.close();
    }
}