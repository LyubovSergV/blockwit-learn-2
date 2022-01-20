package com.blockwit.learn2.lyubovsergv;

import java.util.Scanner;

public class ExtTask1 {
    public static void main(String[] args) {
        WordsHelper wordsHelper=new WordsHelper();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int num = in.nextInt();
        String[] numbers = new String[num];

        wordsHelper.printRubleHelper(num);

    }
}
