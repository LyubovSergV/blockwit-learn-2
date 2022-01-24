package com.blockwit.learn2.lyubovsergv;

public class ProtoList1 {
    int[] array;
    int count;

    public void create() {
        array = new int[0];
        count = 0;
    }

    public int getSize() {
        return count;
    }

    public int get(int i) {
        return array[i];
    }


}
