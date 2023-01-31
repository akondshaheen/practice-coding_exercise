package Practices;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;


public class Practice8_NewYearChaos {

    public void findMinimumBribes(String numbers) {
        List<Integer> numberList = Arrays.stream(numbers.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        int swap = 0;
        for (int i = numberList.size() - 1; i >= 0; i--) {
            System.out.println(numberList + " - when i: " + i);
            System.out.println(".........." + numberList.get(i - 2));
            if (numberList.get(i) != i + 1) {
                if ((i - 1) >= 0 && numberList.get(i - 1) == i + 1) {
                    int temp = numberList.get(i - 1);

                    numberList.set(i - 1, numberList.get(i));
                    numberList.set(i, temp);
                    swap++;
                } else if ((i - 2) >= 0 && numberList.get(i - 2) == (i + 1)) {
                    System.out.println(numberList + "    111111");
                    int next = numberList.get(i-1);
                    int secondNext = numberList.get(i);
                    int current = numberList.get(i-2);
                    numberList.set((i - 2), next);
                    System.out.println(numberList + "    2222222");

                    numberList.set((i - 1), secondNext);
                    System.out.println(numberList + "    33333");

                    numberList.set(i, current);
                    System.out.println(numberList + "    444444");

                    swap += 2;
                } else {
                    System.out.println("Too Chaotic");
                    return;
                }
            }
        }
        System.out.printf(swap + "0..........");
    }
}
