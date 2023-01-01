package com.thecodingshef.newtute.newDsa;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 8, 9, 5};
        int n = arr.length;
        largestWithNaiveApproach(arr, n);
       // System.out.println(largestWithNaiveApproach(arr, n));
        System.out.println(largestWithEfficientApproach(arr,n));
    }

    private static int largestWithEfficientApproach(int[] arr, int n) {
        int largest = arr[0];

        for (int i = 0; i < n; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    private static int largestWithNaiveApproach(int[] arr, int n) {

        boolean largest = false;
        for (int i = 0; i < n; i++) {

            largest = true;
            for (int j = 0; j < n; j++) {

                if(arr[j] > arr[i]) {
                    largest = false;
                    break;
                }
            }
            if(largest){
              return i;
            }
        }
        return -1;
    }
}
