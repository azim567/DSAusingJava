package com.thecodingshef.newtute.newDsa;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {4,2,7,40,7,6,2};
        int n = arr.length;
       // removeDuplicateNaiveApproach(arr,n);
        removeDuplicateEfficientApproach(arr,n);  // works for only sorted arrays like arr = {1,2,2,2,4,4,4}
    }

    private static void removeDuplicateNaiveApproach(int[] arr, int n) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            if(!map.containsValue(arr[i])) {
                map.put(i, arr[i]);
            }
        } //O(nlogN)

        System.out.print(map.size());
    }


    // works for only sorted arrays
    private static void removeDuplicateEfficientApproach(int[] arr, int n) {

        int i = 0;

        for (int j = 1; j < n; j++) {
            if(arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(i+1);
    }
}
