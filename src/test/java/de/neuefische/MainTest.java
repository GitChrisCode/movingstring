package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main_Test() {
        String eingabe = "abc XYZ";

        String result = Main.verschobenerString(eingabe);

        assertEquals(result,"def ABC");
    }

    @Test
    void verschobenerString_Numbers_Only_Test() {
        String eingabe = "1234";

        String result = Main.verschobenerString(eingabe);

        assertEquals(result,"1234");
    }
}