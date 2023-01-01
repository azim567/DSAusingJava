package com.thecodingshef.newtute.newDsa;

/*
 * Stock Buy and sell with as many as transaction
 * */

public class BuyAndSellStock2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 12};
        System.out.println(maximumProfit(arr, arr.length));
    }

    private static int maximumProfit(int[] arr, int n) {

        int maxProfit = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                maxProfit += (arr[i] - arr[i-1]);
            }
        }

        return maxProfit;
    }
}
