package com.example.entity;

import org.junit.jupiter.api.Test;
import validation.CustomValidator;
import validation.impl.CustomValidatorImpl;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidatorTest {

    @Test
    void idTest(){
        CustomValidator validator = new CustomValidatorImpl();
        String numbers = "00000000-0000-0000-0000-000000000000";
        assertTrue(validator.idValid(numbers));
    }

    @Test
    void numberTest(){
        CustomValidator validator = new CustomValidatorImpl();
        String numbers = "1 % 2 ||?/ 3 4 5";
        assertFalse(validator.numbersValid(numbers));
    }

}
