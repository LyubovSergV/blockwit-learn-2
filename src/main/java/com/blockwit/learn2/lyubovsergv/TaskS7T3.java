//Есть два массива. Первый 7,4,2,8,6,7 и второй 6,2,9. Вывести их на экран.
// А затем создать такой массив, который вмещал бы первые два.
// И скопировать в новый массив элементы первых двух массивов.
// При этом элементы из первого и второго массивов должны чередоваться в новом массиве.
// Если в какой-то момент из-за нехватки элементов в одном из массивов чередовать будет нельзя,
// то копировать элементы из оставшегося массива.
package com.blockwit.learn2.lyubovsergv;

public class TaskS7T3 {
    public static void main(String[] args) {
        int[] a = {7, 4, 2, 8, 6, 7};
        int[] b = {6, 2, 9};

        Helper helper = new Helper();

        System.out.println("Первый массив");
        helper.printArray(a);
        System.out.println("Второй массив");
        helper.printArray(b);

        int[] c = new int[a.length + b.length];

        int count = 0;
        for (int i = 0; i < b.length; i++) {
            c[count++] = a[i];
            c[count++] = b[i];
        }

        if (a.length > b.length) {
            int[] d = new int[a.length - b.length];
            for (int i = d.length; i < a.length; i++) {
                c[count++] = a[i];
            }
        } else {
            int[] d = new int[b.length - a.length];
            for (int i = d.length; i < b.length; i++) {
                c[count++] = b[i];
            }
        }

        System.out.println("Объединенный массив");
        helper.printArray(c);
    }
}