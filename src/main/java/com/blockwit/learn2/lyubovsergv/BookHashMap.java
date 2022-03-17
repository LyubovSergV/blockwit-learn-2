package com.blockwit.learn2.lyubovsergv;

public class BookHashMap {
    String name;
    Integer ISBN;

    public BookHashMap(Integer inputISBN, String inputName) {
        name = inputName;
        ISBN = inputISBN;
    }

    public String getName() {
        return name;
    }

    public Integer getISBN() {
        return ISBN;
    }
}
