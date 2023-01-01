package com.thecodingshef.newtute.newDsa;

/*
* Time: O(n)
* Space: O(1) constant space
* */

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int size = arr.length;

        arrayOfRunningSum(arr, size);
    }

    private static void arrayOfRunningSum(int[] arr, int size) {

        for (int i = 1; i < size; i++) {
            arr[i] += arr[i - 1];
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+"");
        }
    }
}
