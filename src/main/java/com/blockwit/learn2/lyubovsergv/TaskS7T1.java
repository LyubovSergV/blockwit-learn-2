//Есть два массива чисел. Первый - 9,1,5,6,8. И второй 7,3,1. Вывести их на экран.
// Затем создать такой массив, который бы умещал первые два.
// И скопировать туда элементы первых двух массивов. Вывести получный массив на экран.
package com.blockwit.learn2.lyubovsergv;

public class TaskS7T1 {
    public static void main(String[] args){
        int[] a={-9,1,5,6,8};
        int[] b={7,3,1};

        Helper helper=new Helper();

        System.out.println("Первый массив:");
        helper.printArray(a);
        System.out.println("Второй массив:");
        helper.printArray(b);

        int[] c= new int[a.length+b.length];

        int count=0;
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
            count++;
        }
        for(int i=0;i< b.length;i++){
            c[count++]=b[i];
        }
        System.out.println("Новый массив:");
        helper.printArray(c);
    }
}
