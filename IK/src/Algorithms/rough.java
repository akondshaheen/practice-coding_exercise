package Algorithms;

import java.util.ArrayList;

public class rough {

    static ArrayList<Integer> merge_sort(ArrayList<Integer> arr) {
        // Write your code here.``
        int start = 0;
        int end = arr.size()-1;
        divide(arr, start, end);


        return arr;
    }
    static void divide(ArrayList<Integer> arr, int start, int end){
        if(start>=end)return;

        int mid = end-start/2;

        divide(arr, start, mid);
        divide(arr, mid+1, end);

        java.util.List<Integer> auxList = new ArrayList<>(end-start+1);
        int i=0; int j=mid+1;
        while(i<=mid && j<=end){
            if(arr.get(i)<=arr.get(j)){
                auxList.add(arr.get(i));
                i++;
            }else{
                auxList.add(arr.get(j));
                j++;
            }
        }
        while(i<=mid){

            auxList.add(arr.get(i));
            i++;
        }
        while(j<=end){
            auxList.add(arr.get(j));
            j++;
        }
        Collections.copy(arr, auxList);
    }
}
