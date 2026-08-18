/**
 * TOPIC: Arrays and Matrices (2D Array Operations)
 * LEVEL: Beginner
 * DESCRIPTION: Reads a 3x3 matrix from the user, calculates the sum
 * of each row and each column, and displays the matrix along with
 * the computed sums. This demonstrates common matrix operations.

 * LEARNING OBJECTIVES:
 * - Declare and initialize a 2D array (matrix) of size 3x3
 * - Use nested loops to read values from user input
 * - Calculate row sums using an array to store results
 * - Calculate column sums using an array to store results
 * - Display the matrix with row sums
 * - Display column sums

 * KEY CONCEPTS:
 * - 2D Array: An array of arrays with rows and columns
 * - Row sum: Accumulating values across each row
 * - Column sum: Accumulating values down each column
 * - Parallel arrays: Two arrays (sumRows and sumColumns) to store results
 * - Nested loops: Outer loop for rows, inner for columns
 * - Display formatting: Using tabs (\t) for alignment

 * EXAMPLE INPUT:
 * Enter the values for a 3x3 matrix:
 * Element [0][0]: 1
 * Element [0][1]: 2
 * Element [0][2]: 3
 * Element [1][0]: 4
 * Element [1][1]: 5
 * Element [1][2]: 6
 * Element [2][0]: 7
 * Element [2][1]: 8
 * Element [2][2]: 9

 * EXAMPLE OUTPUT:
 * Matrix entered:
 * 1	2	3	| Sum Row: 6
 * 4	5	6	| Sum Row: 15
 * 7	8	9	| Sum Row: 24
 * Sum columns: 12	15	18
 */

import java.util.Scanner;

public class SumMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        int[] sumRows = new int[3];
        int[] sumColumns = new int[3];

        System.out.println("Enter the values for a 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
                sumRows[i] += matrix[i][j];
                sumColumns[j] += matrix[i][j];
            }
        }

        System.out.println("Matrix entered:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("| Sum Row: " + sumRows[i]);
        }

        System.out.print("Sum columns: ");
        for (int sum : sumColumns) {
            System.out.print(sum + "\t");
        }
    }
}