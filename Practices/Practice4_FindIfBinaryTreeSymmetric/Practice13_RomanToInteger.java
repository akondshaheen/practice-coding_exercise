package Practices.Practice4_FindIfBinaryTreeSymmetric;

public class Practice13_RomanToInteger {
    public int convertInt(String romanNumber) {
        int [] romanToNumber =new int[romanNumber.length()];
        int I =0;
        int V=0;
        int X=0;
        int L=0;
        int C=0;
        int D=0;
        int M=0;
        int total =0;

        for(int i=0; i<romanNumber.length();i++){
        /*     I = 1;
             V = 5;
             X = 10;
             L = 50;
             C = 100;
             D = 500;
             M = 1000;*/
            if(romanNumber.charAt(i)=='I'){
                I = 1;
                romanToNumber[i]=I;
            }
            if(romanNumber.charAt(i)=='V'){
                V = 5;
                romanToNumber[i]=V;

            }
            if(romanNumber.charAt(i)=='X'){
                X = 10;
                romanToNumber[i]=X;

            }
            if(romanNumber.charAt(i)=='L'){
                L = 50;
                romanToNumber[i]=L;

            }
            if(romanNumber.charAt(i)=='C'){
                C = 100;
                romanToNumber[i]=C;

            }
            if(romanNumber.charAt(i)=='D'){
                D = 500;
                romanToNumber[i]=D;

            }
            if(romanNumber.charAt(i)=='M'){
                M = 1000;
                romanToNumber[i]=M;

            }



        }
        if (romanToNumber.length==1){
            total=romanToNumber[0];
            return total;
        }
        for(int i=0; i<romanToNumber.length-1;i++){
            if(romanToNumber[i]<romanToNumber[i+1]){
                total=total-romanToNumber[i];
            }else {
                total=total+romanToNumber[i];
            }

            if(i==romanToNumber.length-2){
                total=total+romanToNumber[i+1];
            }

        }
        return total;
    }
}
