package Practices.DataStructure.Cracking.Coding.Interview;

import java.util.Hashtable;

public class DS01_Find_Unique_String {

    //Implement an algorithm to find if the String has all unique characters.
    Hashtable<Character, Integer> tempTable = new Hashtable<>();
    Hashtable<String, Integer> tempTableSecond = new Hashtable<>();

    public boolean isUnique(String word) {
        if (word.isEmpty()) {
            return false;
        }
        char[] tempWord = word.toCharArray();

        for (char character : tempWord) {

            if (tempTable.get(character) == null) {
                tempTable.put(character, 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isUniqueSecond(String word) {
        if (word.isEmpty()) {
            return false;
        }

        String[] tempWord = word.split("");

        for (String character : tempWord) {

            if (tempTableSecond.get(character) == null) {
                tempTableSecond.put(character, 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isUniqueThird(String word) {
        if (word.length() > 128) return false;
        boolean[] findUnique = new boolean[128];
int[] letters = new int[128];
        for (int i = 0; i < word.length(); i++) {
            int value = word.charAt(i);
            System.out.println("................."+value);
            int ask = 5;
            ask++;
            System.out.println(ask);
            if (findUnique[value]) {
                return false;
            }
            findUnique[value] = true;
        }
        return false;
    }
}
