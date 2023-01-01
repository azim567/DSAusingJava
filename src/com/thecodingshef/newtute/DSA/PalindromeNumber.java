package com.thecodingshef.newtute.DSA;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 13211231;
        boolean isPalindrome = checkPalindrome(num);
        if (isPalindrome)
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static boolean checkPalindrome(int num) {

        int rev = 0, temp, rem;
        temp = num;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return temp == rev;
    }
}
