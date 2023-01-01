package com.thecodingshef.newtute.newDsa;

import java.util.HashMap;

public class FrequencyOfEle {

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 4, 4, 6, 6, 6, 6};
        int n = arr.length;
        elementFrequency(arr, n);
    }
    private static void elementFrequency(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int count = 1;
        for (int i = 0; i < n; i++) {

            if (map.containsKey(arr[i])) {
                count++;
                map.put(arr[i], count);
            } else {
                count = 1;
                map.put(arr[i], count);
            }
        }
        System.out.println(map);
    }
}
