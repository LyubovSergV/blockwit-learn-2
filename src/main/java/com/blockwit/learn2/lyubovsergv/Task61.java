package com.blockwit.learn2.lyubovsergv;

public class Task61 {
    public static void main(String[] args) {
        Airplane economy = new Airplane("Economy");
        Airplane business = new Airplane("Business");
        Airplane first = new Airplane("First");

        economy.wing();
        business.wing();
        first.wing();

    }
}
