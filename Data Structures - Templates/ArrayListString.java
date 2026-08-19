/**
 * TOPIC: Data Structures (ArrayList & Exception Handling)
 * LEVEL: Beginner
 * DESCRIPTION: Demonstrates the use of ArrayList to store strings,
 * and demonstrates exception handling when accessing an invalid index.
 * The program adds three names to the list and attempts to access
 * index 10, which does not exist, triggering an IndexOutOfBoundsException.

 * LEARNING OBJECTIVES:
 * - Create and initialize an ArrayList of Strings
 * - Add elements to an ArrayList using add()
 * - Display the contents of an ArrayList
 * - Attempt to access an element using get()
 * - Handle IndexOutOfBoundsException using try-catch
 * - Understand the importance of exception handling

 * KEY CONCEPTS:
 * - ArrayList: A resizable array implementation of the List interface
 * - IndexOutOfBoundsException: Exception thrown when accessing invalid index
 * - try-catch: Mechanism to handle exceptions gracefully
 * - add(): Method to append elements to the ArrayList
 * - get(): Method to retrieve elements by index
 * - Range checking: Accessing indices beyond size-1 causes exception

 * EXAMPLE OUTPUT:
 * Names on the list: [Ana, Carlos, María]
 * Error: you tried to access a position outside the range of the ArrayList.
 */

import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Carlos");
        names.add("María");

        System.out.println("Names on the list: " + names);

        try {
            String InvalidName = names.get(10);
            System.out.println("Name in position 10: " + InvalidName);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: you tried to access a position outside the range of the ArrayList.");
        }
    }
}