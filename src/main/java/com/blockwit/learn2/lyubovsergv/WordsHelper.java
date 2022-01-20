package com.blockwit.learn2.lyubovsergv;

public class WordsHelper {
    public void printRubleHelper(int number) {
        if (number % 10 == 0 || number % 10 == 5 || number % 10 == 6 || number % 10 == 7 || number % 10 == 8 || number % 10 == 9) {
            System.out.println("рублей");
        } else if (number == 2 || number == 3 || number == 4) {
            System.out.println("рубля");
        } else if (number == 11 || number == 12 || number == 13 || number == 14) {
            System.out.println("рублей");
        } else if (number % 10 == 1) {
            System.out.println("рубль");
        }
    }
}

