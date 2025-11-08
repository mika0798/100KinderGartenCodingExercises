package com.challenge.easy;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        System.out.println("Is is number a prime number? " + isPrimeNumber3(number));
    }

    public static boolean isPrimeNumber1(int number) {
        if (number <= 1) {
            return false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    /*
    If N (a natural number) has a divisor A, then there must exist a divisor B such that:
        A x B = N (1)
    If both A and B are greater than √N, then we would have:
        A x B > √N x √N = N
        which is impossible because of (1)
    So in any pair of divisors (A,B) of N. There must be at least one
    divisor is less than or equals to square root of N. Therefore, we have:
        X <= √N (X is a divisor of N)
     */

    /*
    - A number is considered a prime number if it has only two divisors
    which are 1 and itself
    - 2 is the smallest prime number and also the only even prime number
    - Prime numbers larger than 2 are also odd numbers
    - Prime numbers larger than 3 (5 upwards) are in the form 6k ± 1
     */

    public static boolean isPrimeNumber2(int number) {
        if (number <= 1) {return false;}
        if (number <= 3 ) {return true;}
        if (number % 2 == 0) {return false;}
        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) {return false;}
        }
        return true;
    }
    /*
    In this method below, i has the form of 6k + 1, hence we have:
        6k - 1 = (6k + 1) - 2 = i + 2
    Notice that the difference between i(s) is 6:
        k = 1, 6*1 ± 1 = 7 or 5
        k = 2, 6*2 ± 1 = 13 or 11
        k = 3, 6*3 ± 1 = 19 or 17
        k = 4, 6*4 ± 1 = 25 or 23 (we take 23)
        ...And so on
     */


    public static boolean isPrimeNumber3(int number) {
        if (number <= 1) {return false;}
        if (number <= 3) {return true;}
        if (number % 2 == 0) {return false;}
        for (int i = 5; i * i <= number; i += 6) {
            if ((number % i == 0) || (number % (i + 2) == 0)) {return false;}
        }
        return true;
    }


}
