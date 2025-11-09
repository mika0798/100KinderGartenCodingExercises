package com.challenge.medium.recursion;

import java.util.Scanner;

public class NToOne {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("List of " + n + " to 1:");
        printDescending(n);

    }

    public static void printDescending(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printDescending(n-1);
    }
}
