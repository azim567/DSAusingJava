package com.thecodingshef.newtute.newDsa;

/*
* time complexity = O(n)
* space = O(1) constant space
* */

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 3};
        int n = arr.length;

        leftRotateByOne(arr,n);
    }

    private static void leftRotateByOne(int[] arr, int n) {

        int temp = arr[0];

        for (int i = 1; i < n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+", ");
        }
    }
}
