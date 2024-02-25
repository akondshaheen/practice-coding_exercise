package Practices.DataStructure;

import Practices.DataStructure.Cracking.Coding.Interview.DS01_Find_Unique_String;
import Practices.DataStructure.Cracking.Coding.Interview.DS02_URLify;

public class Main_DS {
    private static DS01_Find_Unique_String ds01FindUniqueString = new DS01_Find_Unique_String();
    private static DS02_URLify ds02UrLify = new DS02_URLify();

    public static void main(String[] args) {
        System.out.println(ds02UrLify.createURLifySecond("Mr John Smith    ".toCharArray(),13));
        System.out.println(ds01FindUniqueString.isUniqueThird("abcda"));
        ds01FindUniqueString.isUnique("abcadss");
        System.out.println(ds01FindUniqueString.isUniqueSecond("abcd"));
    }
    }
