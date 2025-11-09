package com.challenge.medium;

import java.util.Scanner;

public class ThreeDivisorsMethod1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Start counting from 1 to " + number + "...");
        System.out.println("There are " + count3DivisorsNumbers(number) + " that have exactly 3 divisors in the range");
    }

    public static boolean has3Divisors(int number) {
        if (number < 2) {return false;}
        int count = 0;
        for (int i = 1; i * i <= number; i++) {
            if (number % i == 0) {
                if (i * i == number) {
                    count++; // duplicates of i
                } else {
                    count += 2; // i and number / i
                }
            }
            if (count > 3) {
                return false;
            }
        }
        return count == 3;
    }

    public static int count3DivisorsNumbers(int number) {
        int count = 0;
        for (int i = 1; i  <= number; i++) {
            if (has3Divisors(i)) {
                count++;
            }
        }
        return count;
    }
}
