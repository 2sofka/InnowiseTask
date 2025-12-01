package com.example.entity;

import entity.impl.CustomEntity;
import factory.impl.EntityFactory;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FactoryTest {

    @Test
    void createEmptyTest() {
        assertTrue(new EntityFactory().create());
    }

    @Test
    void createTest() {
        int number = 123;
        UUID id = UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479");
        assertTrue(
                new EntityFactory().
                        create(
                                new CustomEntity().
                                        setNumber(number).
                                        setId(id)
                        )
        );
    }
}
