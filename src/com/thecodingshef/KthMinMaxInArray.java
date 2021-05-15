package com.thecodingshef;

import java.util.ArrayList;
import java.util.Arrays;

public class KthMinMaxInArray {

    public static void main(String[] args) {

        int[] arr={23,78,47,65,83,53,99};
        Arrays.sort(arr);
        System.out.println("sorted array is: ");
        for (int ele:arr) {
            System.out.print(ele+" ");
        }
        int k=3;
        int n=arr.length;
        System.out.println("");
        System.out.println("kth smallest element is: "+arr[k-1]);
        System.out.println("kth largest element is: "+arr[n-k]);
    }
}
