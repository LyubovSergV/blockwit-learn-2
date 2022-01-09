package com.blockwit.learn2.lyubovsergv;

public class Book {
    String name, author;
    int birthday;

    public Book(String inputName, String inputAuthor, int inputBirthday) {
        name = inputName;
        author = inputAuthor;
        birthday = inputBirthday;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getBirth() {
        return birthday;
    }

}
