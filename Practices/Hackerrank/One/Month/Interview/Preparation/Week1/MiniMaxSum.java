package Practices.Hackerrank.One.Month.Interview.Preparation.Week1;

import java.util.List;

public class MiniMaxSum {

    public static void getMiniMaxSum(List<Integer> arr) {
        //input value 1 <= arr [i] <= 1000000000
        long getMinimum = 1000000000;
        long getMaximum = 1;
        long total = 0;

        for (int i = 0; i < arr.size(); i++) {

            total += arr.get(i);

            if (getMinimum >= arr.get(i)) {
                getMinimum = arr.get(i);
            }
            if (getMaximum <= arr.get(i)) {
                getMaximum = arr.get(i);
            }

        }

        System.out.println((total-getMaximum) +" " + (total-getMinimum));
    }
}
