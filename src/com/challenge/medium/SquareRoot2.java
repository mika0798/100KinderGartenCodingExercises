package com.challenge.medium;

import java.util.Scanner;

public class SquareRoot2 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        System.out.println("Square root or its floor: " + floorSquareRoot(number));
    }

    public static int floorSquareRoot(int number) {
        int i = 1;
        while (i * i <= number) {
            i++;
        }
        return i - 1;
    }
}
