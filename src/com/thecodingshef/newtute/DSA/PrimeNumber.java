package com.thecodingshef.newtute.DSA;

import javax.print.attribute.standard.MediaSize;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 61;
        System.out.println(checkPrime(num));
    }

    // TODO: 5/16/2021 Naive Approach
    private static boolean checkPrime(int num) {

        if (num == 1) return false;

        for (int i = 2; i <num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // TODO: 5/16/2021  Optimize Approach
    private static boolean checkPrimeOptimize(int num) {

        if (num == 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i * i <= num; i=i+6) {
            if (num % i == 0 || num%(i+2)==0) return false;
        }
        return true;
    }
}
