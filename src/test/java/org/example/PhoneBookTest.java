package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    @Test
    public void add() {
        PhoneBook phoneBook = new PhoneBook();

        int result = phoneBook.add("Evgenii", 123124512);
        assertEquals(1,result);

        result = phoneBook.add("Evgenii" , 125645234);
        assertEquals(1,result);

        result = phoneBook.add("Dmitriy", 346787239);
        assertEquals(2,result);


    }
}