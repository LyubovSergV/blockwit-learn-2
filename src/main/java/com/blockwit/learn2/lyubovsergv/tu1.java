package com.blockwit.learn2.lyubovsergv;

public class tu1 {
    public static void main(String[] args) {
        Helper[] numbers = {
                new Helper(12),
                new Helper(7),
                new Helper(89),
                new Helper(-4),
                new Helper(8),
                new Helper(9)
        };

        for (int i = 0; i < numbers.length; i++) {
            numbers[i].printIntArray();
        }
    }
}
