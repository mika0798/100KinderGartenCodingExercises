package com.challenge.hard;

import java.util.Scanner;

public class TowerOfHanoiRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of disks: ");
        towerOfHanoi(input.nextInt(),'A','C','B');
    }

    public static void towerOfHanoi(int disks, char source, char dest, char aux) {
        if (disks == 0) {return;}
        towerOfHanoi(disks - 1, source, aux, dest);
        System.out.println("Move disk " + disks + " from " + source + " to " + dest);
        towerOfHanoi(disks - 1, aux, dest, source);
    }
}
