package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    private PhoneBook phoneBook;

    @BeforeEach
    public void setUp() {
        phoneBook = new PhoneBook();
    }


    @Test
    public void add() {

        int result = phoneBook.add("Evgenii", 123124512);
        assertEquals(1, result);

        result = phoneBook.add("Evgenii", 125645234);
        assertEquals(1, result);

        result = phoneBook.add("Dmitriy", 346787239);
        assertEquals(2, result);

    }

    @Test
    public void findByNumber() {

        phoneBook.add("Evgenii", 123124512);
        phoneBook.add("Dmitriy", 346787239);

        String name = phoneBook.findByNumber(123124512);
        assertEquals("Evgenii", name);

        String error = phoneBook.findByNumber(777777777);
        assertNull(error);

    }
@Test
    public void findByName() {
        phoneBook.add("Evgenii", 123124512);
        phoneBook.add("Dmitriy", 346787239);

        String number = phoneBook.findByName("Dmitriy");
        assertEquals(346787239,number);
    }
}