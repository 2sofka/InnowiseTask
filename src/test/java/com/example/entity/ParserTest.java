package com.example.entity;

import array.impl.CustomArrayImpl;
import org.junit.jupiter.api.Test;
import parser.CustomParser;
import parser.impl.CustomParserImpl;
import reader.CustomFileReader;
import reader.impl.CustomFileReaderImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParserTest {

    @Test
    void parseTest(){
        CustomParser parser = new CustomParserImpl();
        CustomFileReader reader = new CustomFileReaderImpl();
        List<CustomArrayImpl> customArrayList1 = parser.parse(reader.parseRow());

        List<CustomArrayImpl> customArrayList2 = new ArrayList<>();
        customArrayList2.add(new CustomArrayImpl
                .Builder()
                .setId(UUID.fromString("f47ac10b-58cc-4372-a567-0e02b2c3d479")).setNumbers(new int[]{12})
                .build());


        boolean result = customArrayList1.size() == customArrayList2.size() ;
        for (int i = 0; i < customArrayList1.size() && result; i++) {
            if (!customArrayList1.get(i).equals(customArrayList2.get(i))) {
                result = false;
                break;
            }
        }
        assertTrue(result);
    }
}
