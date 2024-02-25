package Practices;

import java.util.*;

public class Practice9_PrintNumbers {

    // Print all positive number where a^3+b^3=c^3+d^3

    public void getNumbers(int n, int c, int d){
        Map<Integer,List<Integer>> result =new HashMap<>();
        int addition;
        for (int a=c;a<n; a++){
            for (int b=d;b<n; b++){
                addition=c*c*c+d*d*d;
                result.put(addition,new ArrayList<>(Arrays.asList(a,b)));
            }
        }
        for (int i=0;i<result.size(); i++){
            for (int j=0;j<result.size(); j++){
                System.out.println("a = " + i);
                System.out.println("b = " + j);
            }
        }
    }
}
