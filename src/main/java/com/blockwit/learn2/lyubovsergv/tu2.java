package com.blockwit.learn2.lyubovsergv;

import static java.util.Arrays.sort;

public class tu2 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 89, -4, 8, 9};

        Utils utils = new Utils();

        System.out.println("Отсортированный массив");
        utils.sort(numbers);
    }
}
