package com.thecodingshef.newtute.DSA;

import java.util.Scanner;

public class CountDigit {

    public static void main(String[] args) {

        int num = 9235;
        int count = countDigit(num);
        System.out.println(count);
    }

    private static int countDigit(int num) {

        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
