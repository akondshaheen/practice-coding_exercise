package Practices;


import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class Practice1_Anagram {
//Time complexity T(n)=O(n)+O(n)+O(n)=O(n);
//Space complexity S(n)= O(n)+O(n)=O(n) 
 
    public boolean anagram(String firstWord, String secondWord){
        if(firstWord.length()!=secondWord.length()){
            System.out.println("Practice1 - Anagram: False");
            return false;
        }
        Hashtable<String, Integer> firstTable = new Hashtable<>();
        Hashtable<String, Integer> secondTable = new Hashtable<>();

        List<String> firstArray = Arrays.asList(firstWord.split(""));
        List<String> secondArray = Arrays.asList(secondWord.split(""));
        firstArray.stream().forEach(e->{
            if(firstTable.containsKey(e)){
                firstTable.put(e, firstTable.get(e) + 1);
            }else{
                firstTable.put(e, 1);
            }
        });

        secondArray.stream().forEach(e->{
            if(secondTable.containsKey(e)){
                secondTable.put(e, firstTable.get(e) + 1);
            }else{
                secondTable.put(e, 1);
            }
        });
        

        Set<String> elementKey = firstTable.keySet();
        for(String el: elementKey){
        if(firstTable.get(el)!=secondTable.get(el)){
            System.out.println("Practice1 - Anagram: False");
            return false;
            }
        }
        System.out.println("Practice1 - Anagram: True");
        return true;
    }
}
