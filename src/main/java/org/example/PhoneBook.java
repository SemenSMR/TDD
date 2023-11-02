package org.example;

import java.util.*;

public class PhoneBook {
    private Map<String, Integer> map = new HashMap<>();
    private Map<Integer, String> revers = new HashMap<>();
    private int countAdd = 0;

    public int add(String name, int number) {

        if (!map.containsKey(name)) {
            map.put(name, number);
            revers.put(number, name);
            countAdd++;
        }
        return countAdd;
    }

    public String findByNumber(int number) {
        return revers.get(number);
    }

    public int findByName(String name) {
        Integer number = map.get(name);
        if (number != null) {
            return number;
        }
        return -1;
    }

    public List<String> printAllNames() {
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Comparator.comparing(Map.Entry::getKey));
        List<String> sortedNames = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            sortedNames.add(entry.getKey());
        } return sortedNames;
    }
}

