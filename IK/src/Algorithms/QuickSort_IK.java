package Algorithms;

import java.util.Arrays;

public class QuickSort_IK {

    // Main QuickSort function
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            // Partition the array and get the pivot's correct position
            int pivotIndex = partition(arr, start, end);

            // Recursively sort elements before and after the pivot
            quickSort(arr, start, pivotIndex - 1); // Left side of pivot
            quickSort(arr, pivotIndex + 1, end);    // Right side of pivot
        }
    }

    // Partitioning function
    private static int partition(int[] arr, int start, int end) {
        // 1. Pick a random pivot index between start and end
        int randomPivotIndex = start + (int)(Math.random() * (end - start + 1));

        // 2. Swap the random pivot with the last element to keep pivot element safe
        int temp = arr[randomPivotIndex];
        arr[randomPivotIndex] = arr[end];
        arr[end] = temp;

        int pivot = arr[end]; // Pivot is now at the end
        int smallerElementPointer = start - 1; // Tracks position for smaller elements

        // 3. Move elements smaller than pivot to the left
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                smallerElementPointer++;
                // Swap current element with smallerElementPointer's position
                temp = arr[smallerElementPointer];
                arr[smallerElementPointer] = arr[i];
                arr[i] = temp;
            }
        }

        // 4. Place the pivot in its correct position
        temp = arr[smallerElementPointer + 1];
        arr[smallerElementPointer + 1] = arr[end];
        arr[end] = temp;
        // Return pivot's final index
        return smallerElementPointer + 1;
    }
    // Driver code
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 8, 4};
        System.out.println("Original array: "
                + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:   "
                + Arrays.toString(arr));
        // Output: [2, 3, 4, 5, 8]
        }}

