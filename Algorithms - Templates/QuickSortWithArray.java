/**
 * TOPIC: Sorting Algorithms (QuickSort)
 * LEVEL: Intermediate
 * DESCRIPTION: Implementation of the QuickSort algorithm using the
 * divide-and-conquer approach. The algorithm selects a pivot element,
 * partitions the array around the pivot, and recursively sorts the
 * sub-arrays.
 
 * LEARNING OBJECTIVES:
 * - Understand the QuickSort algorithm (divide and conquer)
 * - Implement the partition function to place pivot correctly
 * - Use recursion to sort sub-arrays
 * - Analyze the efficiency of QuickSort
 * - Understand the importance of pivot selection

 * KEY CONCEPTS:
 * - QuickSort: A divide-and-conquer sorting algorithm
 * - Partition: Rearranges the array so that elements < pivot come before it
 * - Pivot: The element chosen to divide the array
 * - Recursion: QuickSort calls itself on left and right sub-arrays
 * - In-place sorting: Uses only O(log n) extra space (for recursion stack)

 * ALGORITHM COMPLEXITY:
 * - Best case: O(n log n) (balanced partitions)
 * - Average case: O(n log n)
 * - Worst case: O(n²) (unbalanced partitions, e.g., already sorted array)
 * - Space: O(log n) (recursion stack)

 * EXAMPLE INPUT:
 * int[] arr = {33, 11, 55, 44, 22, 66};

 * EXAMPLE OUTPUT:
 * QuickSort Result: 11 22 33 44 55 66
 */

 public class Ejercicio2 {

    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    public static int partition(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left + 1;

        for (int j = i; j <= right; j++) {
            if (arr[j] < pivot) {
                int aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
                i++;
            }
        }

        int aux = arr[left];
        arr[left] = arr[i - 1];
        arr[i - 1] = aux;

        return i - 1;
    }

    public static void main(String[] args) {
        int[] arr = {33, 11, 55, 44, 22, 66};
        quickSort(arr, 0, arr.length - 1);

        System.out.print("QuickSort Result: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}