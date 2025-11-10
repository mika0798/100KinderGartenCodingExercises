package com.challenge.medium;

public class KthDigitOfPow {
    public static void main(String[] args) {
        long a = 5;
        long b = 7;
        int k = 4;
        System.out.println((long) Math.pow(a,b));
        System.out.print("Digit " + k + " from right to left: ");
        System.out.println(findKthNumber(a, b, k));
    }

    public static int findKthNumber(long a, long b, int k) {
        String result = String.valueOf((long) Math.pow(a,b));
        return Character.getNumericValue(result.charAt(result.length() - k));
    }
}
