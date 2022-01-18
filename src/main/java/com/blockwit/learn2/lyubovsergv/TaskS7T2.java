//Есть два массива. Первый 6,3,8,9 и второй 0,3,1,5. Вывести их на экран.
// А затем создать такой массив, который вмещал бы первые два.
// И скопировть в новый массив элементы первых двух массивов.
// При этом элементы из первого и второго массивов должны чередоваться в новом массиве.
package com.blockwit.learn2.lyubovsergv;

public class TaskS7T2 {
    public static void main(String[] args) {
        int[] a = {6, 3, 8, 9};
        int[] b = {0, 3, 1, 5};

        Helper helper = new Helper();

        System.out.println("Первый массив");
        helper.printArray(a);
        System.out.println("Второй массив");
        helper.printArray(b);

        int[] c = new int[a.length * 2];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            c[count++] = a[i];
            c[count++] = b[i];
        }

        System.out.println("Объединенный массив");
        helper.printArray(c);

    }
}
