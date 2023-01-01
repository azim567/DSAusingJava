package com.thecodingshef;

public class ArrayInsertion {

    public static void main(String[] args) {
        int element = 2;
        int[] arr = {5, 4, 7, 8, 9,8};

        printArray(arr);
        int position = 2;
        int index = position - 1;
        for (int i = arr.length - 2; i >= index; i--) {

            arr[i+1] = arr[i];
        }
        arr[index] = element;
        System.out.println("\nAfter insertion");
        printArray(arr);
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
