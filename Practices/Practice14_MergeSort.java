package Practices;

import java.util.ArrayList;
import java.util.List;

public class Practice14_MergeSort {
    List<Integer> firstHalf;
    List<Integer> secondHalf;

    public List<Integer> sortNumbers(List<Integer> arrayToSort){
        List<Integer> sortedArray = new ArrayList<>(arrayToSort.size());
        firstHalf = new ArrayList<>(arrayToSort.size()/2);
        secondHalf = new ArrayList<>(arrayToSort.size()/2);
        int i = 0;
        int j = 0;

        for(int k=0; k<=arrayToSort.size(); k++){
            if (firstHalf.get(i)<secondHalf.get(j)){
                sortedArray.add(k,firstHalf.get(i));
            }
        }


        return sortedArray;
    }
}
