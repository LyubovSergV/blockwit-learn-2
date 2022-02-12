//Написать класс MyIntArrayList. Этот класс будет представлять собой список. Этот класс должен иметь методы:
//add - добавляет элемент в конец списка. Возвращает индекс, по которому элемент добавлен.
//get - получает индекс и возвращает соответствующий индексу элемент.
//size - возращает длину списка.
//clear - очищает список
package com.blockwit.learn2.lyubovsergv;

public class TaskS8T1 {
    public static void main(String[] args) {
        MyIntArrayList myIntArrayList = new MyIntArrayList();

        for (int i = 0; i < 5; i++) {
            myIntArrayList.add(i);
        }

        System.out.println("Список");
        for (int i = 0; i < myIntArrayList.size(); i++) {
            System.out.println(myIntArrayList.get(i));
        }

        myIntArrayList.clear();
    }
}
