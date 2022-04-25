package Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice2_Find_Position {
    int firstPostion = -1;
    int lastPosition =-1;
    int currentPosition =-1;
    private int firstLocation;
    private int lastLocation;
    List <Integer> expected = new ArrayList<>();
    private List <Integer> expectedLocation;
    public List<Integer>findPosition(String word, String c){
        if(word.length()<1){
            expected = new ArrayList<Integer>(){{add(-1);add(-1);}};
            System.out.println("Practice2 - Find Position - First solution: " + expected);
            return expected;
        };

        List<String> listOfLetters = Arrays.asList( word.split(""));
        listOfLetters.stream().forEach(e->{
            currentPosition++;
            if(e.equals(c)){
                lastPosition =currentPosition;
            }
            if(lastPosition>-1 && expected.isEmpty()){
                expected.add(lastPosition);
            }else if(listOfLetters.size()==currentPosition+1&& expected.isEmpty()){
                expected.add(firstPostion);
            }
        });
        expected.add(lastPosition);
        System.out.println("Practice2 - Find Position - First solution: " + expected);
        return expected;
    }

    //T(n)=O(n)
    public List<Integer> findPositionSecondMethod(String word, String character){
        for(int i=0;i<word.length(); i++){
            if(String.valueOf(word.charAt(i)).equals(character)){
                firstLocation = i;
                lastLocation = i;
                while(i+1<word.length()){
                    i++;
                    if(String.valueOf(word.charAt(i)).equals(character)){
                        lastLocation =i;
                    }
                }
                expectedLocation = new ArrayList<Integer>(){{add(firstLocation);add(lastLocation);}};
                System.out.println("Practice2 - Find Position - Second solution: " + expectedLocation);
                return expectedLocation;
               }
        }
        expectedLocation =new ArrayList<Integer>(){{add(-1);add(-1);}};
        System.out.println("Practice2 - Find Position - Second solution: " + expectedLocation);
        return expectedLocation;
    }
}
