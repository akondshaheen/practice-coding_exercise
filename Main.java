import Practices.Practice1_Anagram;
import Practices.Practice2_Find_Position;

public class Main {
    private static Practice1_Anagram practice1_Anagram = new Practice1_Anagram();

    private static Practice2_Find_Position practice2_find_position = new Practice2_Find_Position();

       public static void main(String[] args) {
           practice1_Anagram.anagram("garden", "danger");
           practice2_find_position.findPosition("dengeeer", "e");
           practice2_find_position.findPositionSecondMethod("Teacher", "e");
    }
}

