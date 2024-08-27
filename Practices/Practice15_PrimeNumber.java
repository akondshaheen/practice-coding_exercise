package Practices;

public class Practice15_PrimeNumber {

    /**
     * A prime number is a whole number greater than 1 that can only be divided evenly by itself and 1.
     * Example 7. 7 can only be divided with 1 and 7.
     *
     * @param number
     */
    public boolean isPrime(int number) {
        int count = 0;
        boolean prime = false;
        if (number < 1 || number < 1) {
            System.out.println("Number is not prime");
            return prime;
        }
        //a number can only be divided half or less than the number. Example 12 can be divided by 6 or less number.
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                System.out.println(number + ": Is not a prime number!");
                return prime;
            }
        }
        System.out.println(number + ": Is a prime number!");
        return true;
    }
}
