package com.blockwit.learn2.lyubovsergv;

import java.util.Map;
import java.util.HashMap;

public class TaskS10T4 {
    public static void main(String[] args) {
        Map<Integer, String> books = new HashMap<>();

        BookHashMap bookHashMap1 = new BookHashMap(12345, "Маугли");
        BookHashMap bookHashMap2 = new BookHashMap(56456, "Русалочка");
        BookHashMap bookHashMap3 = new BookHashMap(14587, "Красавица и чудовище");
        BookHashMap bookHashMap4 = new BookHashMap(48617, "Майдодыр");
        BookHashMap bookHashMap5 = new BookHashMap(75496, "Буратино");
        BookHashMap bookHashMap6 = new BookHashMap(74824, "Айболит");

        books.put(bookHashMap1.getISBN(), bookHashMap1.getName());
        books.put(bookHashMap2.getISBN(), bookHashMap2.getName());
        books.put(bookHashMap3.getISBN(), bookHashMap3.getName());
        books.put(bookHashMap4.getISBN(), bookHashMap4.getName());
        books.put(bookHashMap5.getISBN(), bookHashMap5.getName());
        books.put(bookHashMap6.getISBN(), bookHashMap6.getName());

        for(Map.Entry<Integer, String> pair : books.entrySet())
        {
            String value = pair.getValue();
            System.out.println(value);
        }
    }

}
