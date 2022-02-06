package com.blockwit.learn2.lyubovsergv;

public class TaskS8T1 {
    public static void main(String[] args) {
        MyIntArrayList myIntArrayList=new MyIntArrayList();

        for (int i=0;i<5;i++){
            myIntArrayList.add(i);
        }

        System.out.println("Список");
        for (int i=0;i< myIntArrayList.size();i++){
            System.out.println(myIntArrayList.get(i));
        }

        System.out.println("Очищенный Список");
        for (int i=0;i< myIntArrayList.size();i++){
            System.out.println(myIntArrayList.clear());
        }
    }
}
