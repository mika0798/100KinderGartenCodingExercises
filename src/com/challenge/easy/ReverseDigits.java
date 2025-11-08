package com.challenge.easy;

import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Reversed number: " + reverse3(number));
    }

    public static int reverse(int number) {
        String digits = String.valueOf(number);
        StringBuilder reversed = new StringBuilder();
        for (int i = digits.length() - 1; i >= 0; i--) {
            reversed.append(digits.charAt(i));
        }
        return Integer.parseInt(reversed.toString());
    }

    public static int reverse2(int number) {
        int reversedNum = 0;
        while (number != 0) {
            reversedNum = reversedNum * 10 + number % 10;
            number /= 10;
        }
        return reversedNum;
    }

    static int reverseNumber = 0;
    public static int reverse3(int number) {
       if (number == 0) {
           return reverseNumber;
       } else {
           int lastDigit = number % 10;
           reverseNumber = reverseNumber * 10 + lastDigit;
           reverse3(number/10);
       }
        return reverseNumber;
    }
}
