/**
 * TOPIC: Searching Algorithms (Linear vs Binary Search)
 * LEVEL: Intermediate
 * DESCRIPTION: Compares the efficiency of linear search and binary
 * search on a sorted array of numbers from 1 to 20. The program
 * counts the number of comparisons each algorithm makes to find
 * a target number and then compares their performance.

 * LEARNING OBJECTIVES:
 * - Implement linear search on an array
 * - Implement binary search on a sorted array
 * - Count the number of comparisons for each algorithm
 * - Compare the efficiency of both algorithms
 * - Understand when binary search is more efficient
 * - Analyze the impact of the target's position on performance

 * KEY CONCEPTS:
 * - Linear Search: Checks each element sequentially O(n)
 * - Binary Search: Divides the search space in half each time O(log n)
 * - Efficiency comparison: Binary search is usually faster for sorted data
 * - Edge cases: When target is at the beginning, linear search can be faster
 * - Comparisons count: Metric to measure algorithm efficiency

 * ALGORITHM COMPLEXITY:
 * - Linear Search: O(n) time, O(1) space
 * - Binary Search: O(log n) time, O(1) space (iterative)

 * EXAMPLE INPUT:
 * Enter a number to search for (1-20): 5

 * EXAMPLE OUTPUT:
 * Results:
 * Linear search -> Found at position 4 with 5 comparations.
 * Binary search -> Found at position 4 with 3 comparations.

 * Comparation:
 * Binary search was more efficient (rare case, number at the start).

 * EXAMPLE INPUT (number at start):
 * Enter a number to search for (1-20): 1

 * EXAMPLE OUTPUT:
 * Results:
 * Linear search -> Found at position 0 with 1 comparations.
 * Binary search -> Found at position 0 with 4 comparations.

 * Comparation:
 * The linear search was more efficient.
 */

 import java.util.Scanner;

public class ComparationLinealBinary {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search for (1-20): ");
        int numberSearch = scanner.nextInt();

        int LinealComparations = 0;
        boolean LinealSearching = false;
        int LinealPosition = -1;

        for (int i = 0; i < numbers.length; i++) {
            LinealComparations++;
            if (numbers[i] == numberSearch) {
                LinealSearching = true;
                LinealPosition = i;
                break;
            }
        }

        int BinaryComparations = 0;
        int start = 0, end = numbers.length - 1;
        boolean BinarySearching = false;
        int BinaryPosition = -1;

        while (start <= end) {
            BinaryComparations++;
            int middle = start + (end - start) / 2;

            if (numbers[middle] == numberSearch) {
                BinarySearching = true;
                BinaryPosition = middle;
                break;
            } else if (numbers[middle] < numberSearch) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        System.out.println("\nResults:");
        if (LinealSearching) {
            System.out.println("Linear search -> Found at position " + LinealPosition + " with " + LinealComparations + " comparations.");
        } else {
            System.out.println("Linear search -> Not found with " + LinealComparations + " comparations.");
        }

        if (BinarySearching) {
            System.out.println("Binary search -> Found at position " + BinaryPosition + " with " + BinaryComparations + " comparations.");
        } else {
            System.out.println("Binary search -> Not found with " + BinaryComparations + " comparations.");
        }

        System.out.println("\nComparation:");
        if (LinealComparations < BinaryComparations) {
            System.out.println("The linear search was more efficient.");
        } else if (BinaryComparations < LinealComparations) {
            System.out.println("Binary search was more efficient (rare case, number at the start).");
        } else {
            System.out.println("Both searches had the same efficiency.");
        }
        scanner.close();
    }
}