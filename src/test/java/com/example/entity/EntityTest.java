package com.example.entity;

import entity.impl.CustomArrayImpl;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntityTest {

    @Test
    void getIdTest() {
        UUID id = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
        UUID fakeId = UUID.fromString("00000000-0000-0000-0000-000000000000");
        CustomArrayImpl entity = new CustomArrayImpl.Builder().setId(id).build();
        boolean result = entity.getId().equals(fakeId);
        assertFalse(result);
    }

    @Test
    void getNumberTest() {
        int[] numbers = {3};
        int[] fakeNumbers = {5};
        CustomArrayImpl entity =  new CustomArrayImpl.Builder().setNumbers(numbers).build();
        boolean result = (entity.getNumbers() == fakeNumbers);
        assertFalse(result);
    }

    @Test
    void setIdTest() {
        UUID id = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
        CustomArrayImpl entity = new CustomArrayImpl.Builder().setId(id).build();
        boolean result = entity.getId().equals(id);
        assertTrue(result);
    }

    @Test
    void setNumberTest() {
        int[] numbers = {3};
        CustomArrayImpl entity =  new CustomArrayImpl.Builder().setNumbers(numbers).build();
        boolean result = (entity.getNumbers() == numbers);
        assertTrue(result);
    }
}
