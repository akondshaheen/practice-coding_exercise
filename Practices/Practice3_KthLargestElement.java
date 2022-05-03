package Practices;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Practice3_KthLargestElement {
    private int kthLargest;
    private List<Integer> sortedList;
    public int findKthLargest(List<Integer> inputList, int k){
       sortedList = inputList.stream().sorted().collect(Collectors.toList());
        kthLargest = sortedList.get(inputList.size()-k-1);
        System.out.println("Practice3 - " + k + "kth Largest - First solution: " + kthLargest);
        return kthLargest;
    }

    /**
     * T(n,k)=O(nlogn)+O((k-1)*logn)+O(logn)=O(nlogn)+O(klogn)-O(logn)+O(logn)=O(nlogn+klogn)
     * @param inputList
     * @param k
     * @return
     */
    public int findKthLargestSecondSolution(List<Integer> inputList, int k){
        PriorityQueue<Integer> priorityList = new PriorityQueue<>(Comparator.reverseOrder());
        priorityList.addAll(inputList);//O(nlogn)
        Iterator iterateInput = priorityList.iterator();
        int listSize = priorityList.size();
        while (iterateInput.hasNext() && priorityList.size()>listSize-(k-1)){
            priorityList.poll();
        }
         int kthLargestNumber = priorityList.peek();
        System.out.println("Practice3 - " + k + "kth Largest - Second solution: " + kthLargestNumber);
        return kthLargestNumber;
    }
}
