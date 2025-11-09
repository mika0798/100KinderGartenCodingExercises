package com.challenge.medium.recursion;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        System.out.println("Fibonacci sequence up to number " + number + ": ");
        for (int i = 0; i <= number; i++) {
            System.out.print(fibo(i) + ", ");
        }
    }


    public static int fibo(int n){
        if (n ==0 || n==1) {
            return n;
        }

        return fibo(n-1) + fibo(n-2);
    }
}
