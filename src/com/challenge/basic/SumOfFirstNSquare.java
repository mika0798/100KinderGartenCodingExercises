package com.challenge.basic;

import java.util.Scanner;

public class SumOfFirstNSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to sum: ");
        long number = input.nextLong();
        System.out.print("Sum of first " + number + " squares: " + sum1(number) );
    }

    public static long sum(long a) {
        long sum = 0;
        for (long i = 1; i <= a; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static long sum1(long a) {
        return (a * (a + 1) / 2) * (2 * a + 1) / 3;
    }
}
