package com.challenge.medium.recursion;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        System.out.println("Total sum: " + sum(input.nextInt()));
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n-1);
    }

}
