package com.challenge.medium.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = input.nextLong();
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }

    public static long factorial(long n){
        if(n == 0) {
            return 1;
        }
        return n * factorial(n-1);
    }
}
