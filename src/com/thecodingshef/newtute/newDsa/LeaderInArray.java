package com.thecodingshef.newtute.newDsa;

/*
* An element is called the leader of an array if there is no element greater than it on the right side.
* */

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        int n = arr.length;
        printLeaders(arr, n);
    }

    private static void printLeaders(int[] arr, int n) {

        int current_leader = arr[n-1];
        System.out.print(current_leader+",");
        for (int i = n-2; i > 0; i--) {

            if(arr[i] > current_leader) {
                current_leader = arr[i];
                System.out.print(current_leader+",");
            }
        }
    }
}
