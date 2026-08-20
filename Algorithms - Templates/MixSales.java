/**
 * TOPIC: Algorithms (Merge Two Sorted Arrays)
 * LEVEL: Intermediate
 * DESCRIPTION: Merges two sorted integer arrays into a single sorted
 * array using the two-pointer technique. This is a fundamental part
 * of the Merge Sort algorithm and demonstrates efficient merging of
 * sorted data.

 * LEARNING OBJECTIVES:
 * - Understand the merge operation for sorted arrays
 * - Implement the two-pointer technique for merging
 * - Handle different array lengths gracefully
 * - Create a helper method for array display
 * - Analyze time complexity of the merge operation

 * KEY CONCEPTS:
 * - Merge operation: Combines two sorted arrays into one sorted array
 * - Two-pointer technique: Uses i and j to track positions in each array
 * - Efficient merging: O(n+m) time complexity where n and m are array lengths
 * - Space complexity: O(n+m) for the new combined array
 * - Post-merge handling: Copy remaining elements from the longer array

 * ALGORITHM COMPLEXITY:
 * - Time complexity: O(n + m) where n and m are the lengths of the arrays
 * - Space complexity: O(n + m) for the combined array

 * EXAMPLE INPUT (hardcoded):
 * Branch A: 10, 20, 35, 50
 * Branch B: 5, 15, 40, 60, 80

 * EXAMPLE OUTPUT:
 * Branch A: 10 20 35 50
 * Branch B: 5 15 40 60 80
 * Combined and sorted list: 5 10 15 20 35 40 50 60 80
 */

public class MixSales {
    public static void main(String[] args) {

        int[] branchA = {10, 20, 35, 50};
        int[] branchB = {5, 15, 40, 60, 80};

        System.out.print("Branch A: ");
        show(branchA);

        System.out.print("Branch B: ");
        show(branchB);

        int[] combined = new int[branchA.length + branchB.length];
        int i = 0, j = 0, k = 0;

        while (i < branchA.length && j < branchB.length) {
            if (branchA[i] < branchB[j]) {
                combined[k++] = branchA[i++];
            } else {
                combined[k++] = branchB[j++];
            }
        }

        while (i < branchA.length) {
            combined[k++] = branchA[i++];
        }

        while (j < branchB.length) {
            combined[k++] = branchB[j++];
        }

        System.out.print("Combined and sorted list: ");
        show(combined);
    }

    private static void show(int[] arr) {
        for (int n : arr) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}