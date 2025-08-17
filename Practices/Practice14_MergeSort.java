package Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice14_MergeSort {
    List<Integer> firstHalf;
    List<Integer> secondHalf;

        // The main mergeSort function that recursively divides the array
        public static void mergeSort(int[] arr, int low, int high) {
            if (low >= high) return; // Base case: array is already sorted when low >= high

            int mid = low + (high - low) / 2;  // Find the middle index
            mergeSort(arr, low, mid);  // Recursively sort the left half
            mergeSort(arr, mid + 1, high);  // Recursively sort the right half
            mergeInPlace(arr, low, mid, high);  // Merge the sorted halves back together
        }

        // The merging function that combines two sorted subarrays into a single sorted array
        private static void mergeInPlace(int[] arr, int low, int mid, int high) {
            int left = low, right = mid + 1;

            // Merge the two sorted halves
            while (left <= mid && right <= high) {
                if (arr[left] <= arr[right]) {
                    left++;  // Left side element is smaller, so move the left pointer
                } else {
                    int temp = arr[right];  // Store the element from the right array
                    int index = right;

                    // Shift all elements between left and right to the right
                    while (index > left) {
                        arr[index] = arr[index - 1];
                        index--;
                    }

                    arr[left] = temp;  // Place the element from the right subarray in its correct position
                    left++;  // Move the left pointer forward
                    mid++;  // Since we shifted elements, the mid pointer should be adjusted
                    right++;  // Move the right pointer forward
                }
            }

            // Handle remaining elements on the left side (if any)
            while (left <= mid) {
                left++;  // Simply increment the pointer as the left subarray is already in place
            }

            // Handle remaining elements on the right side (if any)
            while (right <= high) {
                right++;  // Simply increment the pointer as the right subarray is already in place
            }
        }

        public static void main(String[] args) {
            int[] arr = {5, 3, 8, 4, 2, 7, 1, 6};
            System.out.println("Before Sorting: " + Arrays.toString(arr));

            // Initial call to mergeSort on the full array
            mergeSort(arr, 0, arr.length - 1);

            System.out.println("After Sorting: " + Arrays.toString(arr));

    }

}
