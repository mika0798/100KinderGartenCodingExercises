package com.challenge.medium;

import java.util.Scanner;

public class SquareRoot3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        System.out.println("Square root or its floor: " + (int) Math.sqrt(number));

    }
}
