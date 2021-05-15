package com.thecodingshef;

public class SubArraySum {

    public static void main(String[] args){

        int[] arr = {1, 3, 4, 6, 11, 13};
        int k = 90;

        int lastIndex = arr.length - 1;
        int startIndex = 0;
        boolean found=false;


        while(startIndex<lastIndex){

            if (arr[lastIndex] + arr[startIndex] == k) {
                found=true;
                break;

            } else if (arr[lastIndex] + arr[startIndex] < k) {
                startIndex++;
            } else {
                lastIndex--;
            }



        }

        if(found){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }


    }


}
