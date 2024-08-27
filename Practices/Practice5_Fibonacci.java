package Practices;
import java.util.HashMap;

public class Practice5_Fibonacci {
    /**
     * The Fibonacci sequence is a series of numbers where each number is the sum of the previous two numbers.
     * It starts with 0 and 1, and then continues like this:
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, and so on.
     * Question: Find first nth fibonacci number
     */

    public int[] findFibonacci(int number){
        int [] result = new int[number];
        int first=0,second=1,fibonacciNumber;
        result[first]=first;
        result[second]=second;

        for (int i = 2; i < number; i++) {
            //fibonacci sequence is 0,1,1,2,3,5
            //fibonacci number will be sum of previous two number, to get the fibonacci, we calculate the sum of 0(firstNumber) and 1(secondNumber), so third fibonacci number is 1(thirdFibonacci).
            // so the number sequence will be 0,1(new first),1(new second). For the 4th number, the new previous two number will be 1 and 1, previous second number will be new first number and the calculated fibonacci Number will be new second number
            fibonacciNumber=first+second;
            result[i]=fibonacciNumber;
            first=second;
            second=fibonacciNumber;
        }
        for (int i = 0; i <result.length ; i++) {
            System.out.print(result[i]+" ");
        }
        return result;
    }
    HashMap<Integer, Integer> memo = new HashMap<>();
    int sum=5;
    public int generateFib(int n){
        if(n<=1)return n;
        sum =generateFib(n-1)+generateFib(n-2);
        return sum;
    }

    public String generateString(String s){
        if(s.length()<2)return s;
        String a = generateString(s.substring(1))+s.charAt(0);
        return a;
    }

    public int findFibonacciWithMemoization(int n){
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        if(n<=2){return 1;}
        memo.put(n, findFibonacciWithMemoization(n-1));
        return memo.get(n);
    }
}
