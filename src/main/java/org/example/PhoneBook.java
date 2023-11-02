package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Integer> map = new HashMap<>();
    private int countAdd = 0;

    public int add(String name, int number) {

        if (!map.containsKey(name)) {
            map.put(name, number);
            countAdd++;
        } return countAdd;
    }
}

