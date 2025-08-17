package Algorithms;

import java.util.Arrays;

public class MergeSort_IK {

           public static void main(String[] args) {
            int[] arr = {5, 3, 8, 4, 2, 7, 1, 6};
            System.out.println("Original: " + Arrays.toString(arr));
            mergeSort(arr, 0, arr.length - 1);
            System.out.println("Sorted:  " + Arrays.toString(arr));
        }

        private static void mergeSort(int[] arr, int start, int end) {
            // ==========================================
            // PHASE 1: DIVIDE (Split the array into halves)
            // ==========================================
            // Recursively splits the array into smaller subarrays until single elements
            // are reached. This "unwinding" process breaks down the original array into
            // individual elements:Example:[5,3,8,4,2,7,1,6]→[5][3],[8],[4],[2],[7],[1],[6]
            // The recursion stack preserves the start/mid/end indices for later merging
            // merge method combines them back together winding them up into a sorted array
            if (start >= end) return; // Base case: single element

            int mid = start + (end - start) / 2;
            mergeSort(arr, start, mid);      // Split left half
            mergeSort(arr, mid + 1, end);    // Split right half
            merge(arr, start, mid, end);     // Merge sorted halves
        }

        private static void merge(int[] arr, int start, int mid, int end) {
            // ==========================================
            // PHASE 2: CONQUER (Merge sorted subarrays)
            // ==========================================
            // Merges sorted subarrays while maintaining order. As the recursion "winds
            // back up":
            // 1. Combines single elements → sorted pairs (e.g., [3,5] ← [5]+[3])
            // 2. Merges larger subarrays (e.g., [3,4,5,8] ← [3,5]+[4,8])
            // 3. Repeats until full array is sorted:
            // Final merge: [3,4,5,8] + [1,2,6,7] → [1,2,3,4,5,6,7,8]
            // Use preserved start/mid/end indices from the divide phase to merge correctly
            int[] temp = new int[end - start + 1];
            int i = start, j = mid + 1, k = 0; //K is to control the index of temp array


            // Merge left/right subarrays into temp
            while (i <= mid && j <= end) {
                if (arr[i] <= arr[j]){
                    temp[k] = arr[i];
                    k++;
                    i++;
                }
                else{
                    temp[k] = arr[j];
                    k++;
                    j++;
                }
            }

            // Copy remaining elements
            while (i <= mid){
                temp[k] = arr[i];
                k++;
                i++;
            }
            while (j <= end){
                temp[k] = arr[j];
                k++;
                j++;
            };

            // Copy merged result back to original array
            System.arraycopy(temp, 0, arr, start, temp.length);
        }
    }

