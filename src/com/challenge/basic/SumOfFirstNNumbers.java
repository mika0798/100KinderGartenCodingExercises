package com.challenge.basic;

import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (n > 0): ");
        int number = Integer.parseInt(input.nextLine());
        if (number > 0) {
            System.out.println("Sum of the first " + number + " natural numbers is " + firstSumOfN(number));
        } else {
            System.out.println("Given number is not a natural number");
        }
    }

    public static int firstSumOfN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
