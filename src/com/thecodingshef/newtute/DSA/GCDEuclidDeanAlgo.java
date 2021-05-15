package com.thecodingshef.newtute.DSA;

public class GCDEuclidDeanAlgo {
    public static void main(String[] args) {
        int a = 12, b = 15;
       // System.out.println(findGCDbyBasicEuclid(a, b));
        System.out.println(findGCDbyOptimiseEuclid(a, b));
    }

    private static int findGCDbyBasicEuclid(int a, int b) {
        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }

    private static int findGCDbyOptimiseEuclid(int a, int b) {
       if(b==0) return a;
       return findGCDbyOptimiseEuclid(b,a%b);

       //logic: gcd(12,15) -> gcd(15,12) ->gcd(12,3) -> gcd(3,0)

    }
}
