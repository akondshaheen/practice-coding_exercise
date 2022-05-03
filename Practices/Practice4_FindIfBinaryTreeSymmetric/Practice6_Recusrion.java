package Practices.Practice4_FindIfBinaryTreeSymmetric;

public class Practice6_Recusrion {

    public String getRecursion(String word){
        if(word.equals("")){
            return "";
        }
        System.out.println(word.substring(1));
        System.out.println(word.charAt(0));

        return getRecursion(word.substring(1))+word.charAt(0);
    }
}
