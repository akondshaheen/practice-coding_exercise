package Practices;
import java.util.HashMap;

public class Practice5_Fibonacci {
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


        System.out.println("hash0  "+memo);
        memo.put(n, findFibonacciWithMemoization(n-1));
        System.out.println("hash  "+memo);
        return memo.get(n);
    }
}
