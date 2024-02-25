import Practices.*;
import Practices.Algorithms.Algorithm01_RecursiveMultiplication;
import Practices.Practice4_FindIfBinaryTreeSymmetric.Practice13_RomanToInteger;
import Practices.Practice4_FindIfBinaryTreeSymmetric.Practice6_Recusrion;
import Practices.Practice4_FindIfBinaryTreeSymmetric.SymmetricMain;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static List<Integer> numbersToFindPosition = Arrays.asList(1, 2, 5, 5, 5, 5, 5, 5, 7, 9);
    private static List<Integer> kthLargestNumbers = Arrays.asList(1, 2, 5, 5, 22, 4, 0, 7, 9);
    private static String practice8_NumberList = "1 2 5 3 7 8 6 4";

    private static final String x = "3141592653589793238462643383279502884197169399375105820974944592";
    private static final String y = "2718281828459045235360287471352662497757247093699959574966967627";

    private static Practice1_Anagram practice1_Anagram = new Practice1_Anagram();
    private static Practice2_Find_Position practice2_find_position = new Practice2_Find_Position();
    private static Practice3_KthLargestElement practice3_kthLargestElement = new Practice3_KthLargestElement();
    private static SymmetricMain symmetricMain = new SymmetricMain();
    private static Practice5_Fibonacci practice5_fibonacci = new Practice5_Fibonacci();
    private static Practice6_Recusrion practice6_recusrion = new Practice6_Recusrion();
    private static Practice7_Attendance practice7_attendance = new Practice7_Attendance();
    private static Practice8_NewYearChaos practice8_NewYearChaos = new Practice8_NewYearChaos();
    private static Practice9_PrintNumbers practice9PrintNumbers = new Practice9_PrintNumbers();
    public static Practice10_Permutation practice10Permutation = new Practice10_Permutation();
    public static Practice11_AddTwoNumbers practice11_addTwoNumbers = new Practice11_AddTwoNumbers();
    private static Practice12_IsPalindrome practice12IsPalindrome = new Practice12_IsPalindrome();
    private static Practice13_RomanToInteger practice13RomanToInteger = new Practice13_RomanToInteger();
    private static Algorithm01_RecursiveMultiplication algorithm01_recursiveMultiplication = new Algorithm01_RecursiveMultiplication();

    public static void main(String[] args) {



        int result = practice13RomanToInteger.convertInt("D");
        /*
        BigInteger results = algorithm01_recursiveMultiplication.calculateMultiplication(x, y);
        System.out.println(results + "--------------------------------");
        practice12IsPalindrome.isPalindrome(123123);
        System.out.println(practice10Permutation.findAnagrams("abbc", "abdbccbabadcbbabbcbabaabccbabc"));
        practice10Permutation.findAnagrams("abbc", "abbccbabadcbbabbcbabaabccbabc");
        practice10Permutation.getPermutationCounter("abbc", "abbccbabadcbbabbcbabaabccbabc");
        practice8_NewYearChaos.findMinimumBribes(practice8_NumberList);
        practice9PrintNumbers.getNumbers(1000, 3, 4);//Not solved
        System.out.println("Practice7 - First solution: " + practice7_attendance.checkRecord("PPALLP"));
        System.out.println(practice6_recusrion.getRecursion("hello"));
        System.out.println(practice5_fibonacci.generateString("helio"));
        System.out.println(practice5_fibonacci.generateFib(4));
        System.out.println(practice5_fibonacci.findFibonacciWithMemoization(7));
        System.out.println(practice3_kthLargestElement.findKthLargest(kthLargestNumbers, 3));
        System.out.println(practice3_kthLargestElement.findKthLargestSecondSolution(kthLargestNumbers, 3));
        System.out.println(practice2_find_position.findPosition("dengeeer", "e"));
        System.out.println(practice2_find_position.findPositionSecondMethod("Teacher", "e"));
        System.out.println(practice2_find_position.findPositionFromASortedList(numbersToFindPosition, 5));
        System.out.println(practice1_Anagram.anagram("garden", "danger"));*/
    }
}

