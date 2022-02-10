package com.blockwit.learn2.lyubovsergv;

public class TaskS8T2 {
    public static void main(String[] args) {
        MyIntArrayList myIntArrayList = new MyIntArrayList();

        PrintHelper printHelper = new PrintHelper();

        for (int i = 0; i < 5; i++) {
            myIntArrayList.add(i);
        }

        System.out.println("Список");
        printHelper.printInList(myIntArrayList);

        System.out.println("Очищенный Список");
        for (int i = 0; i < myIntArrayList.size(); i++) {
            System.out.println(myIntArrayList.clear());
        }
    }
}
