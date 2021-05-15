package com.thecodingshef;

import java.util.Arrays;

public class ReverseAnArray {

    public static void main(String[] args){

        int[] arr={2,4,5,6,73,87,45};
        int size=arr.length;
        int[] reverseArr=reverse(arr,size);
        printArray(reverseArr);
    }

    private static void printArray(int[] reverseArr) {

        for (int ele:reverseArr) {
            System.out.println(ele);
        }
    }

    private static int[] reverse(int[] arr, int size) {

        int start=0;
        int end=size-1;
        int temp;

        while (start<end){

            temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;

        }

        return arr;

    }

}
