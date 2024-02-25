package Practices;

public class Practice12_IsPalindrome {
    public boolean isPalindrome(int x) {
        //  An integer is a palindrome when it reads the same forward and backward.

        //My Solution
        boolean result = false;
        char[] number = ("" + x).toCharArray();
        if (x < 0) {
            return false;
        }
        if (number.length == 1) {
            return true;
        }

        int j = number.length - 1;

        for (int i = 0; i < number.length / 2; i++) {

            if (number[i] == number[j]) {
                result = true;
                j--;
            } else {
                return false;
            }
        }
        return result;
    }

    //Another SOlution
/*    long reversed = 0;
    long temp = x;

        while (temp != 0) {
        int digit = (int) (temp % 10);
        reversed = reversed * 10 + digit;
        temp /= 10;
    }*/
}
