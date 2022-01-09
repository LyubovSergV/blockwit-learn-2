package com.blockwit.learn2.lyubovsergv;

public class Task64 {
    public static void main(String[] args) {
        Animal tiger = new Animal("Tiger", "orange", 2001);
        System.out.println("Название " + tiger.getName());
        System.out.println("Цвет " + tiger.getColor());
        System.out.println("Возраст " + tiger.getAge());
    }
}
