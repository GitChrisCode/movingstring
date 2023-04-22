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
}