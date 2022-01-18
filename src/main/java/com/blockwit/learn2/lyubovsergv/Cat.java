package com.blockwit.learn2.lyubovsergv;

public class Cat {
    String name;
    String eyeColor;

    public Cat(String inputName, String inputColor) {
        name = inputName;
        eyeColor = inputColor;
    }

    public String getEyeColor(){

        return eyeColor;
    }

    public void mau() {
        System.out.println(name + " said Mau");

    }
}
