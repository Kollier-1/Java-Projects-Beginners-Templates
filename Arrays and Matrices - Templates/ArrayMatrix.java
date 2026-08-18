/** LEARNING OBJECTIVES:
 * - Declare and initialize an integer array
 * - Iterate through an array using a standard for loop
 * - Declare and initialize a 2D matrix
 * - Traverse a matrix using nested for loops

 * KEY CONCEPTS:
 * - Array declaration and initialization
 * - Array length property
 * - Nested loops for multidimensional arrays
 * - Print formatting with System.out

 * EXAMPLE OUTPUT:
 * Arrangement Elements:
 * Position 0: 3
 * Position 1: 8
 * Position 2: 1
 * Position 3: 4
 * Position 4: 7

 * Matrix Elements:
 * 10 20 30
 * 40 50 60
 */

public class ArrayMatrix {
    public static void main(String[] args) {
        // a) Arrangement with 5 whole numbers
        int[] numbers = {3, 8, 1, 4, 7};

        // b) Show the elements with a for
        System.out.println("Arrangement Elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Position " + i + ": " + numbers[i]);
        }

        // c) Matrix with 2 rows and 3 columns
        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
        };

        // d) Show the elements with two nested for
        System.out.println("\nMatrix Elements:");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println(); // line break after each row
        }
    }
}