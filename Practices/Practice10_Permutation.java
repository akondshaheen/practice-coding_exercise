package Practices;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice10_Permutation {

    public int getPermutationCounter(String wordToSearchFor, String wordToSearch){
        int keyWordToSearchForLength = wordToSearchFor.length();
        int wordToSearchLength = wordToSearch.length();
        int permutationCount = 0;
        StringBuilder dynamicWordToSearchFor = new StringBuilder(wordToSearchFor);

        for (int i = 0; i < wordToSearchLength-1; i++) {
            if (keyWordToSearchForLength>wordToSearchLength){
                return permutationCount;
            }

            int j = 0;
            while (j < dynamicWordToSearchFor.length()) {
                if (wordToSearch.charAt(i)==dynamicWordToSearchFor.charAt(j)) {
                    dynamicWordToSearchFor.deleteCharAt(j);
                    break;
                }

                j++;
                if (j==dynamicWordToSearchFor.length())
                dynamicWordToSearchFor = new StringBuilder(wordToSearchFor);
            }
            if(dynamicWordToSearchFor.length()==0){
                permutationCount++;
                dynamicWordToSearchFor = new StringBuilder(wordToSearchFor);
            }
        }
        System.out.println("Total number of permutationCount is: "+permutationCount);
        return permutationCount;
    }

    public List<Integer> findAnagrams(String s, String b) {
        List<Integer> result = new ArrayList<>();

        if (s.length() > b.length()) {
            return result; // No permutations possible
        }

        // Create frequency maps for characters in 's' and the current window of 'b'
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> bMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            sMap.put(c, sMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = b.charAt(i);
            bMap.put(c, bMap.getOrDefault(c, 0) + 1);
        }

        // Sliding window approach
        for (int i = 0; i <= b.length() - s.length(); i++) {
            // Check if the frequency maps match
            if (sMap.equals(bMap)) {
                result.add(i); // Found a permutation at index 'i'
            }

            // Update the window's character frequency map
            char leftChar = b.charAt(i);
            if (bMap.containsKey(leftChar)) {
                bMap.put(leftChar, bMap.get(leftChar) - 1);
                if (bMap.get(leftChar) == 0) {
                    bMap.remove(leftChar);
                }
            }

            if (i + s.length() < b.length()) {
                char rightChar = b.charAt(i + s.length());
                bMap.put(rightChar, bMap.getOrDefault(rightChar, 0) + 1);
            }
        }

        return result;
    }
}

