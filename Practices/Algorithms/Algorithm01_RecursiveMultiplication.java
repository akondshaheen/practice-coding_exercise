package Practices.Algorithms;

import java.math.BigInteger;

public class Algorithm01_RecursiveMultiplication {
    BigInteger calculatedResult;
    public BigInteger calculateMultiplication(String x, String y){

        if (x.length()==1||y.length()==1){
            calculatedResult = new BigInteger(x).multiply(new BigInteger(y));
            return calculatedResult;
        }
        BigInteger a = new BigInteger(x.substring(0,(x.length())/2));
        BigInteger  b = new BigInteger(x.substring((x.length())/2));
        BigInteger  c = new BigInteger(y.substring(0,(x.length())/2));
        BigInteger  d = new BigInteger(y.substring((x.length())/2, x.length()));
        System.out.println("a==============="+a);
        System.out.println("b==============="+b);
        System.out.println("c==============="+c);
        System.out.println("d==============="+d);

        calculatedResult= BigInteger.TEN.pow(x.length()).multiply(a.multiply(c))
                .add(BigInteger.TEN.pow(x.length()/2).multiply(a.multiply(d)
                        .add(b.multiply(c))))
                .add(b.multiply(d));
        return calculatedResult;

    }
}
