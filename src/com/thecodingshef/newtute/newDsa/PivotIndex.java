package com.thecodingshef.newtute.newDsa;

/*
 * A pivot index is that index for which the sum left element is equal to the sum of right element.
 *
 * ex: arr = {1,7,3,6,5,6}
 * pivot index is: 3 which is the index of 6 in array
 *
 * */

public class PivotIndex {
    public static void main(String[] args) {

        int[] arr = {1, 7, 3, 6, 5, 6};
        //int[] arr = {2,1,3,4}; no pivot index found
        int n = arr.length;

        int value = pivotIndex(arr,n);
        if(value == -1) {
            System.out.println("no pivot index found");
        }
        else {
            System.out.println(value);
        }
    }

    private static int pivotIndex(int[] arr, int n) {

        // calculate sum of whole array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int leftSum = 0;
        int rightSum = sum;

        for (int i = 0; i < n; i++) {
            rightSum -= arr[i];

            if(leftSum == rightSum) {
                return i;
            }

            leftSum+=arr[i];
        }

        return -1;
    }
}
