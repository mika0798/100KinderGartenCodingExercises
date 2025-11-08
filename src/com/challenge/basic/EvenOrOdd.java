package com.challenge.basic;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int inputNumber = Integer.parseInt(input.nextLine());
        System.out.println("This number is " + ((inputNumber % 2 == 0) ? " even" :" odd"));
    }
}
