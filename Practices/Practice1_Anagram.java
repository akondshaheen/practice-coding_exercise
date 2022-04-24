package Practices;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

public class Practice1_Anagram {

    public static void main(String[] args) {
      anagram("garden","danger");
    }

    public static boolean anagram(String firstWord, String secondWord){
        if(firstWord.length()!=secondWord.length()){
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
                return false;
            }
        }
        return true;
    }
}
