package com.blockwit.learn2.lyubovsergv;

public class TaskS8T3 {
    public static void main(String[] args) {
        MyIntArrayList myIntArrayList = new MyIntArrayList();

        PrintHelper printHelper = new PrintHelper();

        for (int i = 0; i < 10; i++) {
            myIntArrayList.add(i);
        }

        System.out.println("Список");
        printHelper.printInList(myIntArrayList);

        myIntArrayList.clear();

    }
}
