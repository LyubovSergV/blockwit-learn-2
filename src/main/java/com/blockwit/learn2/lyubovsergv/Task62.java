package com.blockwit.learn2.lyubovsergv;

public class Task62 {
    public static void main(String[] args) {
        Planet[] planets = {
                new Planet("Меркурий"),
                new Planet("Венера"),
                new Planet("Марс"),
                new Planet("Юпитер"),
                new Planet("Сатурн"),
                new Planet("Уран"),
                new Planet("Нептун")
        };

        for (int i = 0; i < planets.length; i++) {
            planets[i].ball();
        }
    }
}
