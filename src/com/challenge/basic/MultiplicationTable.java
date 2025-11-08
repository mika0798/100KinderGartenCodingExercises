package com.challenge.basic;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Integer.parseInt(input.nextLine());
        multiplicationTable(number);
    }

    public static void multiplicationTable(int n){
        for (int i = 1;i <= 10;i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
