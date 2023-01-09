package com.thecodingshef.newtute.newDsa;

/*
* Algo:
* step 1 find leftMax array
* step 2 find rightMax array
* step 3 subtract the current element from minimum of its leftMost and right most
*
* complexity: 0(n)
* */

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {5, 0, 6, 2, 3};
        int n = arr.length;
        trapWaterWithEfficientApproach(arr, n);
    }

    private static void trapWaterWithEfficientApproach(int[] arr, int n) {
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(arr[i], arr[i - 1]);
        }
        rightMax[0] = arr[n - 1];
        for (int i = n - 2; i > 0; i--) {
            rightMax[i] = Math.max(arr[i], arr[i + 1]);
        }

        int result = 0;
        // run this loop by skipping first and last element as on corner element water cant be trap.
        for (int i = 1; i < n-1; i++) {
            result += (Math.min(leftMax[i], rightMax[i]) - arr[i]);
        }
        System.out.println("trapping water is: " + result);
    }
}
