//Задан массив чисел 12,7,89,-4,8,9. Необходимо:
//1. Распечатать его.
//2. Отсортировать его в порядке возрастания.
//3. Распечатать еще раз.
package com.blockwit.learn2.lyubovsergv;

public class tu0 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 89, -4, 8, 9};
        System.out.println("Исходный массив");
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }
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
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
