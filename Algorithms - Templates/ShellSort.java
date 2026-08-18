/**
 * TOPIC: Sorting Algorithms (Shell Sort)
 * LEVEL: Intermediate
 * DESCRIPTION: Implementation of Shell Sort, an efficient sorting
 * algorithm that improves upon Insertion Sort by comparing elements
 * that are separated by a gap. The gap decreases over time until
 * it becomes 1, at which point the array is fully sorted.

 * LEARNING OBJECTIVES:
 * - Understand how Shell Sort works (gap-based insertion)
 * - Implement the gap sequence (n/2, n/4, ...)
 * - Use insertion sort logic with a variable gap
 * - Optimize the algorithm by moving elements in larger steps
 * - Compare Shell Sort with other sorting algorithms

 * KEY CONCEPTS:
 * - Shell Sort: Insertion sort with decreasing gaps
 * - Gap sequence: Starts at n/2 and halves each iteration
 * - In-place sorting: Does not require extra memory
 * - Time complexity: Depends on gap sequence (typically O(n log n) to O(n²))
 * - Space complexity: O(1) (in-place)

 * ALGORITHM COMPLEXITY:
 * - Best case: O(n log n)
 * - Average case: Depends on gap sequence (typically O(n^(4/3)))
 * - Worst case: O(n²) for some gap sequences
 * - Space: O(1)

 * EXAMPLE INPUT:
 * int[] arr = {27, 13, 45, 22, 10, 35};

 * EXAMPLE OUTPUT:
 * Shell Sort Result: 10 13 22 27 35 45
 */

 public class ShellSort {

    public static void shellSort(int[] arr) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {27, 13, 45, 22, 10, 35};
        shellSort(arr);

        System.out.print("Shell Sort Result: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}