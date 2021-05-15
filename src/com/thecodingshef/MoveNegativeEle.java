package com.thecodingshef;

public class MoveNegativeEle {

    public static void main(String[] args) {

        int[] arr={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int n=arr.length;
        int[] newArr=new int[arr.length];
        int count=0;

        for(int i = 0; i < n; i++) {

            if(arr[i]<0){
                newArr[count]=arr[i];
                count++;
            }
        }
        for(int i =0; i <n; i++) {

            if(arr[i]>0){
                newArr[count]=arr[i];
                count++;
            }
        }

        for (int ele:newArr) {
            System.out.print(ele+" ");
        }
    }
}
