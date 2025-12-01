package com.example.entity;

import entity.Entity;
import entity.impl.CustomEntity;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntityTest {

    @Test
    void getIdTest() {
        UUID id = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
        UUID fakeId = UUID.fromString("00000000-0000-0000-0000-000000000000");
        Entity entity = new CustomEntity().setId(id);
        boolean result = entity.getId().equals(fakeId);
        assertFalse(result);
    }

    @Test
    void getNumberTest() {
        int number = 3;
        int fakeNumber = 5;
        Entity entity = new CustomEntity().setNumber(number);
        boolean result = (entity.getNumber() == fakeNumber);
        assertFalse(result);
    }

    @Test
    void setIdTest() {
        UUID id = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
        Entity entity = new CustomEntity().setId(id);
        boolean result = entity.getId().equals(id);
        assertTrue(result);
    }

    @Test
    void setNumberTest() {
        int number = 3;
        Entity entity = new CustomEntity().setNumber(number);
        boolean result = (entity.getNumber() == number);
        assertTrue(result);
    }
}
