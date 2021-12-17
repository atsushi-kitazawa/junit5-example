package com.example;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NullValidatorTest {

    @Test
    public void testNull() {
        assertThrows(IllegalArgumentException.class, () -> NullValidator.checkNull(null));
    }

    @Test
    public void testEmpty() {
        NullValidator.checkNull("");
        assertTrue(true);
    }

    @Test
    public void testString() {
        NullValidator.checkNull("abcde");
        assertTrue(true);
    }
}
