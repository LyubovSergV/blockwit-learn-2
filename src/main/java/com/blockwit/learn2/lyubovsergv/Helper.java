package com.blockwit.learn2.lyubovsergv;

import java.util.Map;

public class Helper {

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public String getBookHashMap(Map<Integer, String> books, Integer ISBN){
        return books.get(ISBN);
    }

}
