package com.thecodingshef.newtute.newDsa;

public class MaximumConsecutive1s {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1};
        int size = arr.length;
        maximum1sEfficientApproach(arr, size);
    }

    private static void maximum1sEfficientApproach(int[] arr, int size) {

        int count = 0;
        int countResult = 0;
        for (int i = 0; i < size; i++) {

            if (arr[i] != 0) {
                count++;
                countResult = Math.max(countResult, count);
            } else {
                count = 0;
            }
        }
        System.out.println("count: " + countResult);
    }

}
