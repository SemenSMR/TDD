package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    private PhoneBook phoneBook;

    @BeforeEach
    public void setUp() {
        phoneBook = new PhoneBook();

        phoneBook.add("Evgenii", 123124512);
        phoneBook.add("Dmitriy", 346787239);
    }


    @Test
    public void add() {

        int result = phoneBook.add("Evgenii", 123124512);
        assertEquals(2, result);

        result = phoneBook.add("Dmitriy", 346787239);
        assertEquals(2, result);
        result = phoneBook.add("Pasha", 568945892);
        assertEquals(3, result);


    }

    @Test
    public void findByNumber() {


        String name = phoneBook.findByNumber(123124512);
        assertEquals("Evgenii", name);

        String error = phoneBook.findByNumber(777777777);
        assertNull(error);

    }

    @Test
    public void findByName() {

        int number = phoneBook.findByName("Dmitriy");
        assertEquals(346787239, number);

        int error = phoneBook.findByName("Mihail");
        assertEquals(-1, error);
    }

    @Test
    public void printAllNames() {

        phoneBook.add("Alina", 1254734223);
        phoneBook.add("Dasha", 964515521);

        List<String> result = phoneBook.printAllNames();

        List<String> expected = Arrays.asList("Alina", "Dasha", "Dmitriy", "Evgenii");

        assertEquals(expected, result);

    }
}