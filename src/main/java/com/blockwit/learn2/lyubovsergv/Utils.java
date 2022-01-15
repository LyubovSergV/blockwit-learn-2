package com.blockwit.learn2.lyubovsergv;

public class Utils {

    public static void sort(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            int min = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }

            int temp = numbers[i];
            numbers[i] = numbers[min];
            numbers[min] = temp;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
