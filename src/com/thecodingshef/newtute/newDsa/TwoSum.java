package com.thecodingshef.newtute.newDsa;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 8, 11};
        int n = arr.length;
        int targetSum = 14;
        System.out.println(Arrays.toString(getIndexOfElements(arr, n, targetSum)));
    }

    private static int[] getIndexOfElements(int[] arr, int n, int targetSum) {

        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {

            if (map.containsKey(targetSum - arr[i])) {
                result[1] = i;
                result[0] = map.get(targetSum - arr[i]);
                return result;
            }
            map.put(arr[i], i);

        }
        return result;
    }

}
