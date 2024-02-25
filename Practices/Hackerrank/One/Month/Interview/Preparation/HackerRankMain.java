package Practices.Hackerrank.One.Month.Interview.Preparation;

import Practices.Hackerrank.One.Month.Interview.Preparation.Week1.MiniMaxSum;
import Practices.Hackerrank.One.Month.Interview.Preparation.Week1.TimeConversion;

import java.util.ArrayList;
import java.util.List;

public class HackerRankMain {
    private static   MiniMaxSum miniMaxSum = new MiniMaxSum();
    private static TimeConversion timeConversion = new TimeConversion();
    private static List<Integer> miniMaxSumList= new ArrayList<> (){{
        add(256741038);
        add(623958417);
        add(467905213);
        add(714532089);
        add(938071625);
    }};
    public static void main(String[] args) {
        timeConversion.getConvertedTime("12:40:03AM");
        //miniMaxSum.getMiniMaxSum(miniMaxSumList);
    }
}
