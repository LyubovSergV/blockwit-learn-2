package com.blockwit.learn2.lyubovsergv;

public class PrintHelper {
    public void swapFirstAndLastElement(String[] names) {
        String tempName = names[0];
        names[0] = names[names.length - 1];
        names[names.length - 1] = tempName;
    }

    public void printArrayOfStrings(String[] arrayOfString) {
        for (int i = 0; i < arrayOfString.length; i++) {
            System.out.println(arrayOfString[i]);
        }
    }

    public void printArrayOfInteger(int[] arrayOfInteger) {
        for (int i = 0; i < arrayOfInteger.length; i++) {
            System.out.println(arrayOfInteger[i]);
        }
    }

    public void printInList(MyIntArrayList myIntArrayList) {
        for (int i = 0; i < myIntArrayList.size(); i++) {
            System.out.println(myIntArrayList.get(i));
        }
    }


}
