package com.challenge.medium;

import java.util.Scanner;

public class ThreeDivisorsMethod2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Start counting from 1 to " + number + "...");
        System.out.println("There are " + count3DivisorsNumbers(number) + " that have exactly 3 divisors in the range");
    }

    public static int count3DivisorsNumbers(int number) {
        int count = 0;
        for (int i = 1; i  <= number; i++) {
            if (has3Divisors(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean has3Divisors(int number) {
        int squareRoot = (int) Math.sqrt(number);
        if (squareRoot * squareRoot == number) {
            return isPrime(squareRoot);
        }
        return false;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {return false;}
        if (number <= 3 ) {return true;}
        if (number % 2 == 0) {return false;}
        int sqrt = (int) Math.sqrt(number);
        for (int i = 3; i <= sqrt; i += 2) {
            if (number % i == 0) {return false;}
        }
        return true;
    }
}
