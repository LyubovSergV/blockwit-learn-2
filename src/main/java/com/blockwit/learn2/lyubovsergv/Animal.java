package com.blockwit.learn2.lyubovsergv;

public class Animal {
    String name, color;
    int birthday;

    public Animal(String inputName, String inputColor, int inputBirthday) {
        name = inputName;
        color = inputColor;
        birthday = inputBirthday;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return 2022 - birthday;
    }
}
