package com.thecodingshef.newtute.newDsa;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {7, 1, 0, 5, 0, 0, 3, 6, 4};
        int n = arr.length;
        moveZeros(arr, n);
    }
    private static void moveZeros(int[] arr, int n) {
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        while (count < n) {
            arr[count] = 0;
            count++;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
