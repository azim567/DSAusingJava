package com.thecodingshef.newtute.DSA;

public class LCMofNumber {

    public static void main(String[] args) {
        int a = 4, b = 6;
        System.out.println(calculateLCM(a, b));
    }

    private static int calculateLCM(int a, int b) {

        int result = Math.max(a, b);

        while (true) {
            if (result % a == 0 && result % b == 0)
                return result;
            result++;
        }
    }
}
