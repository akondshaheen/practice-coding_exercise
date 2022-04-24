import Practices.Practice2_Find_first_and_last_position;
import Practices.Practice1_Anagram;

public class Main{
    private static Practice1_Anagram practice1_Anagram = new Practice1_Anagram();
    private static Practice2_Find_first_and_last_position find_first_and_last_position = new Practice2_Find_first_and_last_position();

       public static void main(String[] args) {
           practice1_Anagram.anagram("firstWord", "secondWord");
           find_first_and_last_position.findPosition("", "x");
    }
}

