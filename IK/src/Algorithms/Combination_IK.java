package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_IK {
    static List<List<Integer>> resultCombination;
    static List<List<Integer>> combination(int n, int k) {
        List<Integer> subCombination = new ArrayList<>();

        if (subCombination.size() == k){
            resultCombination.add(subCombination) ;
        }
       // Given two integers n and k, find all the possible unique combinations of k numbers in range 1 to n.
        for (int i = 1; i <= n ; i++) {

        }
    }

    static List<List<Integer>> backTracking(int n, int k) {
        List<Integer> subCombination = new ArrayList<>();


        // Given two integers n and k, find all the possible unique combinations of k numbers in range 1 to n.
        for (int i = 1; i <= n ; i++) {
            if (subCombination.size() == k){
                resultCombination.add(subCombination) ;
                break;
            }
        }
        }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 8, 4};
        System.out.println("Original array: "
                + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:   "
                + Arrays.toString(arr));
        // Output: [2, 3, 4, 5, 8]
    }
}
