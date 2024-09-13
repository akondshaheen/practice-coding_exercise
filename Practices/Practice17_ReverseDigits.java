package Practices;

public class Practice17_ReverseDigits {

    public int reverseDigit(int digit){

        int result =0;
        int temporaryDigit=digit;
        int remainder=0;
        while (temporaryDigit>0){
            remainder=temporaryDigit%10;
            //For each extracted digit, multiply the current reversed number by 10 and add the extracted digit.
            // for 123, the first result will be 0*10+3=3 the second result will be 3*10+2=32
            result = result*10+remainder;
            temporaryDigit=temporaryDigit/10;
        }
        System.out.printf("Reverse of the digit %d is %d",digit,result);
        return result;
    }

}
