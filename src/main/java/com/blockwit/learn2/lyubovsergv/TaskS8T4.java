/**Найти как получить время в формате миллисекунд (unix timestamp).
*Написать класс ListsEvaluation , который содержит метод evalMyList.
* Который ринимает на вход пустой список из задачи 1.
*Затем наполняет список миллионом произвольных элементов и замеряет время за которое он это сделад.
* Затем выводит это время.
 */
package com.blockwit.learn2.lyubovsergv;

public class TaskS8T4 {

    public static void main(String[] args){
        MyIntArrayList myIntArrayList=new MyIntArrayList();
        ListsEvaluation listsEvaluation=new ListsEvaluation();
        listsEvaluation.evalMyList(myIntArrayList);

    }
}
