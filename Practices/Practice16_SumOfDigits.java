package Practices;

public class Practice16_SumOfDigits {

    public int calculateSum(int digit){
        int temporaryDigit=digit;
        int sum=0;
        int iterate=0;

        while (temporaryDigit>0){
            // Extract the last digit: You can extract the last digit of a number by taking the modulus of the number with 10 (number % 10).
            // For example, 123 % 10 gives 3, which is the last digit.
            sum+=temporaryDigit%10;

            //Remove the last digit: After extracting the last digit, you can remove it by dividing the number by 10 (number / 10).
            // For example, 123 / 10 gives 12, effectively removing the last digit.
            //NOTE: 1/10=0 because 1 or any number less than 10 can not be evenly divided by 10
            temporaryDigit=temporaryDigit/10;
            iterate++;
        }
        System.out.printf("Calculated sum of the digit %d is %d",digit,sum);
        return sum;
    }
}
