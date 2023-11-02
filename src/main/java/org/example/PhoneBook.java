package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, Integer> map = new HashMap<>();
    private Map<Integer, String > revers = new HashMap<>();
    private int countAdd = 0;

    public int add(String name, int number) {

        if (!map.containsKey(name)) {
            map.put(name, number);
            revers.put(number,name);
            countAdd++;
        } return countAdd;
    }
    public String findByNumber(int number){
        return revers.get(number);
    }
    public int findByName(String name){
       Integer number = map.get(name);
       if (number != null){
           return number;
       } return -1;
    }
}

