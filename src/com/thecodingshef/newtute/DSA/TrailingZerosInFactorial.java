package com.thecodingshef.newtute.DSA;

import java.util.Scanner;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any number.. ");
        int num=sc.nextInt();

        int factorial=factorial(num);
        System.out.println("factorial is: "+factorial);

        int zeros=checkZeros(factorial);
        if(zeros==0) System.out.println("No zero present");
        else System.out.println("number of zeros: "+zeros);
    }

    private static int checkZeros(int factorial) {
        int count=0;
        while (factorial>0){
            if(factorial%10==0){
                count++;
            }
            factorial=factorial/10;
        }
        return count;
    }

    private static int factorial(int num) {

        if(num==0) return 1;

        return num*factorial(num-1);
    }
}
