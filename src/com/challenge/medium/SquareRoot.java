package com.challenge.medium;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = input.nextInt();
        squareRootCheck(number);

    }

    public static void squareRootCheck(int number) {
        int floor = 0;
        int perfectSquareRoot = 0;
        if (number <= 0) {
            System.out.println("Invalid number");
        }

        for (int i = 1; i * i <= number; i++) {
            if (number / i == i ) {
                perfectSquareRoot = i;
                break;
            }
            floor = i;
        }
        if (perfectSquareRoot != 0) {
            System.out.println("The square root of " + number + " is " + perfectSquareRoot);
        } else {
            System.out.println("Number " + number + " does not have a perfect square root, " +
                    "the floor of its square root is " + floor);
        }

    }

}
