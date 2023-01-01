package com.thecodingshef.newtute.newDsa;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 8, 9, 5};
        int n = arr.length;
        reverseArray(arr, n);
    }

    private static void reverseArray(int[] arr, int n) {
        int start = 0;
        int end = n - 1;

        int temp = 0;

        while (start < end) {

            // swap
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

}
