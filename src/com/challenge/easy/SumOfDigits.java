package com.challenge.easy;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.println("Sum of all digits in " + sumOfDigits(number));

    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        String digits = Integer.toString(number);
        for (int i = 0; i < digits.length(); i++) {
            sum += Character.getNumericValue(digits.charAt(i));
        }
        return sum;
    }

    public static int sumOfDigits2(int number) {
        int sum = 0;
        while (number != 0 ) {
            sum += number % 10; // get the last digit and sum it up
            number /= 10; // remove the last digit
        }
        return sum;
    }

    public static int sumOfDigits3(int number) {
        if (number == 0) {
            return 0;
        }

        return (number % 10) + sumOfDigits3(number / 10);
    }
}
