package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class UserIdTest {

    private UserId id = new UserId("abcde");

    @Test
    public void testCreate() {
        UserId userId = new UserId("abcde");
        assertEquals(id, userId);
    }

    @Test
    public void testCreateNotEqaul() {
        UserId userId = new UserId("ABCDE");
        assertFalse(userId.equals(id));
    }

    @Test
    public void testIdIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new UserId(null));
    }
}
