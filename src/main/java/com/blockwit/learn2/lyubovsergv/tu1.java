package com.blockwit.learn2.lyubovsergv;

public class tu1 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 89, -4, 8, 9};

        Helper helper = new Helper();

        System.out.println("Исходный массив");
        helper.printArray(numbers);

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
        System.out.println("Отсортированный массив");
        helper.printArray(numbers);

    }
}
