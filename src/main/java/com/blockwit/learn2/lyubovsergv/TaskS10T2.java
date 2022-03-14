package com.blockwit.learn2.lyubovsergv;
/*Записать 100000 элементов в массив java.util.ArrayList.
 Вывести на экран эти 100000 элементов. Замерить время на запись и чтение.*/

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class TaskS10T2 {

    public static void main(String[] args) {
        List list = new ArrayList();

        long startTimes = System.currentTimeMillis();

        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            list.add(random.nextInt());
        }

        System.out.println("Элементы массива");
        for (int i = 0; i < 10000; i++) {
            System.out.println(list.get(i));
        }

        long finishTimes = System.currentTimeMillis();
        long elapsed = finishTimes - startTimes;
        System.out.println("Прошло времени " + elapsed + " мс");

    }
}
