/**
 * TOPIC: Arrays and Matrices (2D Arrays)
 * LEVEL: Beginner
 * DESCRIPTION: Generates a 4x4 matrix with random numbers from 1 to 10,
 * displays the matrix, and then asks the user for a number to count
 * how many times it appears in the matrix.

 * LEARNING OBJECTIVES:
 * - Declare and initialize a 2D array (matrix)
 * - Use nested loops to fill a matrix with random values
 * - Use enhanced for-each loops to traverse a 2D array
 * - Count occurrences of a specific value in a matrix
 * - Use Random class to generate random integers
 * - Use Scanner class for user input

 * KEY CONCEPTS:
 * - 2D Array: An array of arrays (rows and columns)
 * - Random class: nextInt(10) generates 0-9, +1 makes it 1-10
 * - Nested loops: Outer loop for rows, inner loop for columns
 * - Enhanced for-each: Iterates through each row and each element
 * - Counting algorithm: Traverse and increment counter when match found

 * EXAMPLE OUTPUT:
 * Matrix generated:
 * 3	7	2	9
 * 5	1	8	3
 * 4	6	2	7
 * 9	3	1	5

 * Enter a number from 1 to 10 to search: 3
 * The number 3 appears 3 times in the matrix.
 */

import java.util.Scanner;
import java.util.Random;

public class Array2Dimention {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = rand.nextInt(10) + 1;
            }
        }

        System.out.println("Matrix generated:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }

        System.out.print("Enter a number from 1 to 10 to search: ");
        int search = sc.nextInt();

        int counter = 0;
        for (int[] row : matrix) {
            for (int num : row) {
                if (num == search) counter++;
            }
        }

        System.out.println("The number " + search + " appears " + counter + " times in the matrix.");
    }
}