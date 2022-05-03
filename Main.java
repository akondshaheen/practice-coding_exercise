import Practices.Practice1_Anagram;
import Practices.Practice2_Find_Position;
import Practices.Practice3_KthLargestElement;
import Practices.Practice4_FindIfBinaryTreeSymmetric.Practice6_Recusrion;
import Practices.Practice4_FindIfBinaryTreeSymmetric.SymmetricMain;
import Practices.Practice5_Fibonacci;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<Integer> numbersToFindPosition = Arrays.asList(1, 2, 5, 5, 5, 5, 5, 5, 7, 9);
    private static List<Integer> kthLargestNumbers = Arrays.asList(1, 2, 5, 5, 22, 4, 0, 7, 9);


    private static Practice1_Anagram practice1_Anagram = new Practice1_Anagram();
    private static Practice2_Find_Position practice2_find_position = new Practice2_Find_Position();
    private static Practice3_KthLargestElement practice3_kthLargestElement = new Practice3_KthLargestElement();
    private static SymmetricMain symmetricMain = new SymmetricMain();
    private static Practice5_Fibonacci practice5_fibonacci = new Practice5_Fibonacci();
    private static Practice6_Recusrion practice6_recusrion = new Practice6_Recusrion();

    public static void main(String[] args) {
        System.out.println(practice6_recusrion.getRecursion("hello"));
        System.out.println(practice5_fibonacci.generateString("helio"));
        System.out.println(practice5_fibonacci.generateFib(4));
        System.out.println(practice5_fibonacci.findFibonacciWithMemoization(7));
        System.out.println(practice3_kthLargestElement.findKthLargest(kthLargestNumbers, 3));
        System.out.println(practice3_kthLargestElement.findKthLargestSecondSolution(kthLargestNumbers, 3));
        System.out.println(practice2_find_position.findPosition("dengeeer", "e"));
        System.out.println(practice2_find_position.findPositionSecondMethod("Teacher", "e"));
        System.out.println(practice2_find_position.findPositionFromASortedList(numbersToFindPosition, 5));
        System.out.println(practice1_Anagram.anagram("garden", "danger"));
    }
}

