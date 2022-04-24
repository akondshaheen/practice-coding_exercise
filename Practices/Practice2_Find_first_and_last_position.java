package Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice2_Find_first_and_last_position {
    int firstPostion = -1;
    int lastPosition =-1;
    int currentPosition =-1;
    List <Integer> expected = new ArrayList<>();

    public List<Integer>findPosition(String word, String c){
        if(word.length()<1){
            expected = new ArrayList<>(){{add(-1);add(-1);}};
            System.out.println(expected);
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
        System.out.println(expected);
        return expected;
    }
}
