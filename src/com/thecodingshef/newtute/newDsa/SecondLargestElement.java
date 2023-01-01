package com.thecodingshef.newtute.newDsa;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 8, 9, 9, 5};
        int n = arr.length;
        secondLargest(arr, n);
    }

    private static void secondLargest(int[] arr, int n) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }

        }
        System.out.println("second largest "+secondLargest);
    }
}
