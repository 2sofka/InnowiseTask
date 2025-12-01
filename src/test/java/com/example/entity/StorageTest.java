package com.example.entity;

import entity.impl.CustomEntity;
import entityArray.Storage;
import entityArray.impl.EntityStorage;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StorageTest {

    @Test
    void addTest() {
        assertTrue(new EntityStorage().add(new CustomEntity()));
    }

    @Test
    void setIdTest() {
        UUID id = UUID.fromString("10000000-0000-0000-0000-000000000000");
        Storage storage = new EntityStorage();
        storage.setId(id);
    }

    @Test
    void deleteByIdTest() {
        assertFalse(new EntityStorage().delete(UUID.randomUUID()));
    }

    @Test
    void deleteTest() {
        assertFalse(new EntityStorage().delete(new CustomEntity()));
    }
}
