package com.thecodingshef.newtute.DSA;

public class PrimeFactors {

    public static void main(String[] args) {
        int num = 12;
        primeFactors(num);
    }

    private static void primeFactors(int num) {


        for (int i = 2; i < num; i++) {

            if (isPrime(i)) {

                int x = i;
                while (num % x == 0) {
                    System.out.println(i);
                    x = x * i;
                }
            }
        }

    }

    private static boolean isPrime(int n) {

        if (n == 1) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
        }
        return true;
    }


}
