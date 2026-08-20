/**
 * TOPIC: Sorting Algorithms (Merge Sort)
 * LEVEL: Advanced
 * DESCRIPTION: Implementation of the Merge Sort algorithm using the
 * divide-and-conquer approach. The array is recursively divided into
 * two halves, sorted, and then merged back together using a helper
 * merge function.

 * LEARNING OBJECTIVES:
 * - Understand the Merge Sort algorithm (divide and conquer)
 * - Implement recursive division of the array
 * - Create temporary arrays for merging
 * - Implement the merge operation efficiently
 * - Analyze time complexity O(n log n)

 * KEY CONCEPTS:
 * - Merge Sort: An O(n log n) sorting algorithm
 * - Divide and conquer: Split the array into smaller subproblems
 * - Recursion: mergeSort calls itself on left and right halves
 * - Merge operation: Combines two sorted arrays into one
 * - Temporary arrays: L and R hold the divided elements
 * - Stable sort: Maintains relative order of equal elements

 * ALGORITHM COMPLEXITY:
 * - Time complexity: O(n log n) in all cases
 * - Space complexity: O(n) for temporary arrays
 * - Stable: Yes

 * EXAMPLE INPUT (hardcoded):
 * int[] arr = {40, 10, 30, 50, 20}

 * EXAMPLE OUTPUT:
 * Merge Sort Result: 10 20 30 40 50
 */

public class MergeSortMethod {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }

    public static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int i = 0; i < n2; i++) R[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] arr = {40, 10, 30, 50, 20};
        mergeSort(arr, 0, arr.length - 1);

        System.out.print("Merge Sort Result: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}