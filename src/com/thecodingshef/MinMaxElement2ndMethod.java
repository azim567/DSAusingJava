package com.thecodingshef;

public class MinMaxElement2ndMethod {

    public static void main(String[] args) {


        int arr[]={34,65,22,87,69,56};
        min_max(arr);
    }

    private static void min_max(int[] arr) {
        int min=arr[0];
        int max=arr[0];

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i]>max)
                max=arr[i];
            else if(arr[i]<min)
                min=arr[i];

        }

        System.out.println("max is: "+max+" and min is: "+min);
    }
}
