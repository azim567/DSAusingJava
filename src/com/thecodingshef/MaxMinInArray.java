package com.thecodingshef;

public class MaxMinInArray {

    public static void main(String[] args) {

        int[] arr = {23, 54, 26, 43, 58, 33};
        sort(arr);
        System.out.println("max is: " + arr[arr.length - 1] + " and min is: " + arr[0]);
    }


    private static void sort(int[] arr) {
        int temp;
        int n = arr.length;
        boolean sorted = true;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    sorted = false;

                }
            }

            if (sorted) break;
        }
        printArray(arr);

    }

    private static void printArray(int[] arr) {

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}
