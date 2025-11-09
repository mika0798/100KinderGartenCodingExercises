package com.challenge.medium.recursion;

import java.util.Scanner;

public class OneToN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("List of 1 to " + n + ":");
        printAscending(n);

    }

    public static void printAscending(int n) {
        if (n == 0) {
            return;
        }
        printAscending(n-1);
        System.out.print(n + " ");
    }
}
