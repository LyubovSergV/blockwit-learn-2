package com.blockwit.learn2.lyubovsergv;

import java.util.Random;

public class ListsEvaluation {
    public void evalMyList(MyIntArrayList myIntArrayList) {
        long startTimestamp = System.currentTimeMillis();

        Random random = new Random();
        for (int i = 0; i < 100000; i++) {
            myIntArrayList.add(random.nextInt());
        }

        long endTimestamp = System.currentTimeMillis();
        System.out.println(endTimestamp - startTimestamp);
    }
}
