package com.blockwit.learn2.lyubovsergv;


public class TaskS8T3 {
    public static void main(String[] args) {
        MyIntArrayList myIntArrayList = new MyIntArrayList();

        PrintHelper printHelper = new PrintHelper();

        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * 6 + 1);
            myIntArrayList.add(x);
        }

        System.out.println("Список");
        printHelper.printInList(myIntArrayList);

        myIntArrayList.clear();

    }
}
