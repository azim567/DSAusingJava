package com.thecodingshef.newtute.newDsa;

public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 8, 9, 5}; //{3, 4, 6, 8, 9}
        int n = arr.length;
        isArraySorted(arr, n);
    }

    private static void isArraySorted(int[] arr, int n) {

        boolean isSorted = true;

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
            }
        }

        System.out.println(isSorted);
    }
}
