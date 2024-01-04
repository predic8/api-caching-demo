package de.predic8;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    void stripQuotes() {
        assertEquals("a",Utils.stripQuotes("""
                "a\""""));

    }
}