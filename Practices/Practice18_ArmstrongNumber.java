package Practices;

public class Practice18_ArmstrongNumber {

    public boolean isArmstrongNumber(int number){
        //a number that is equal to the sum of cubes of its digits
        int remainder;
        int temporaryNumber=number;
        int sumOfDigitCubes=0;

        while (temporaryNumber>0){
            // Extract the last digit: You can extract the last digit of a number by taking the modulus of the number with 10 (number % 10).
            // For example, 123 % 10 gives 3, which is the last digit.
            remainder=temporaryNumber%10;
            sumOfDigitCubes=sumOfDigitCubes+remainder*remainder*remainder;
            //Remove the last digit: After extracting the last digit, you can remove it by dividing the number by 10 (number / 10).
            // For example, 123 / 10 gives 12, effectively removing the last digit.
            //NOTE: 1/10=0 because 1 or any number less than 10 can not be evenly divided by 10
            temporaryNumber=temporaryNumber/10;
        }
        if (sumOfDigitCubes==number){
            System.out.printf("The given number %d is an Armstrong Number", number);
            return true;
        }
        System.out.printf("The given number %d is not an Armstrong Number", number);
        return false;
    }
}
