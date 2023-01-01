package com.thecodingshef.newtute.newDsa;

/*
 * Stock Buy and sell with only 1 transaction
 * */
public class BuyAndSellStock1 {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        System.out.println(bestTime(arr, arr.length));
    }

    private static int bestTime(int[] arr, int n) {

        int maxProfit = 0;
        int minPrice = arr[0];

        for (int i = 0; i < n; i++) {

            if (arr[i] < minPrice) {
                minPrice = arr[i];
            } else if (arr[i] - minPrice > maxProfit) {
                maxProfit = arr[i] - minPrice;
            }
        }
        System.out.println("buy price "+minPrice+" and sell price is"+(maxProfit+minPrice));
        return maxProfit;
    }
}
