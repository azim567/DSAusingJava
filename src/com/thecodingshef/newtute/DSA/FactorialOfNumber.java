package com.thecodingshef.newtute.DSA;

public class FactorialOfNumber {

    public static void main(String[] args) {

        int num = 5;
        int factorial = factorial(num);
        System.out.println(factorial);
    }

    private static int factorial(int num) {

        if (num == 0) return 1;

        return num * factorial(num - 1);
    }
}
