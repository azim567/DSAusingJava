package com.thecodingshef.newtute.DSA;

public class LCMEuclidAlgo {

    public static void main(String[] args) {

        int a=6,b=15;
        System.out.println(findLCM(a,b));
    }

    // TODO: 5/16/2021 formula used: (a*b)=GCD(a,b) * LCM(a,b) => LCM(a,b)= (a*b)/GCD(a,b)

    private static int findLCM(int a, int b) {

        return (a*b)/findGCD(a,b);
    }

    private static int findGCD(int a, int b) {

        if(b==0) return a;

        return findGCD(b,a%b);
    }
}
