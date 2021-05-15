package com.thecodingshef;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

   static List<Integer> dataList=new ArrayList<>();
   static List<Integer> dataList1;
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            dataList.add(i);
        }

        getData();
        getData();

        for (Integer ele:dataList1) {
            System.out.println(ele);
        }
    }

    private static void getData() {

        dataList1=dataList;
    }
}
