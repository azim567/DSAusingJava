package com.thecodingshef.newtute.DSA;

public class GCDNumber {
    public static void main(String[] args) {
        int a = 4, b = 6;
        int gcd = calculateGCD(a, b);
        System.out.println(gcd);
    }

    private static int calculateGCD(int a, int b) {

        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) break;
            result--;
        }

        return result;
    }
}
