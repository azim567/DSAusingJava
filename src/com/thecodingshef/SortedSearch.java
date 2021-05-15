package com.thecodingshef;

import java.util.Arrays;
import java.util.List;

public class SortedSearch {
    public static int countNumbers(int[] sortedArray, int lessThan) {

        int count=0;
        boolean isExist=false;


        for (int ele:sortedArray) {

            if(ele==lessThan)
                isExist=true;

        }

        if(isExist){

            for (int i = 0; i < lessThan; i++) {
                count++;
            }
        }
        else{
            for(int i=0;i<sortedArray.length;i++){



                if(sortedArray[i]<lessThan){

                    count++;
                }
                else
                    break;
            }
        }


        return count;
    }

    public static void main(String[] args) {
        System.out.println(SortedSearch.countNumbers(new int[] { 1, 3,'4', 5, 7 }, 4));
    }
}
