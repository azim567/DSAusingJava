package com.thecodingshef.newtute.DSA;

public class OptimizeTrainlingZerosInFactorial {
    public static void main(String[] args) {

        int num=5;
        int count=countTrailingZeros(num);
        System.out.println(count);
    }

    private static int countTrailingZeros(int num) {

        int result=0;
        for(int i=5;i<=num;i=i*5){
            result=result+num/i;
        }
        return result;
    }
}
