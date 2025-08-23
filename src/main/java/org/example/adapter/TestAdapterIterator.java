package org.example.adapter;

import java.util.*;

public class TestAdapterIterator {
    public static void main(String[] args) {

        List<String> list = List.of("1", "2", "3", "4", "5");
        Enumeration<String> adapter = new IteratorEnumeration<>(list.iterator());

        while(adapter.hasMoreElements()){
            System.out.println(adapter.nextElement());
        }

    }
}
