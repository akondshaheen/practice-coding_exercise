package Practices.Hackerrank.One.Month.Interview.Preparation;

import Practices.Hackerrank.One.Month.Interview.Preparation.Week1.DiagonalDifference;
import Practices.Hackerrank.One.Month.Interview.Preparation.Week1.MiniMaxSum;
import Practices.Hackerrank.One.Month.Interview.Preparation.Week1.TimeConversion;

import java.util.ArrayList;
import java.util.List;

public class HackerRankMain {
    private static   MiniMaxSum miniMaxSum = new MiniMaxSum();
    private static TimeConversion timeConversion = new TimeConversion();
    private static DiagonalDifference diagonalDifference= new DiagonalDifference();
    private static List<Integer> miniMaxSumList= new ArrayList<> (){{
        add(256741038);
        add(623958417);
        add(467905213);
        add(714532089);
        add(938071625);
    }};
    private static List<Integer> diagonalArray01 = new ArrayList<>(){{
        add(2);
        add(5);
        add(7);
    }};
    private static List<Integer> diagonalArray02 = new ArrayList<>(){{
        add(3);
        add(6);
        add(8);
    }};
    private static List<Integer> diagonalArray03 = new ArrayList<>(){{
        add(4);
        add(7);
        add(9);
    }};
    private static List<List<Integer>> diagonal = new ArrayList<>(){{
        add(diagonalArray01);
        add(diagonalArray02);
        add(diagonalArray03);

    }};
    public static void main(String[] args) {
        diagonalDifference.calculateDiagonalDifference(diagonal);
        //timeConversion.getConvertedTime("12:40:03AM");
        //miniMaxSum.getMiniMaxSum(miniMaxSumList);
    }
}
