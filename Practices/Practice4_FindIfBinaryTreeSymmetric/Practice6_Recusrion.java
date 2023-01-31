package Practices.Practice4_FindIfBinaryTreeSymmetric;

public class Practice6_Recusrion {

    public String getRecursion(String word){
        if(word.equals("")){
            return "";
        }
        return getRecursion(word.substring(1))+word.charAt(0);
    }
}
