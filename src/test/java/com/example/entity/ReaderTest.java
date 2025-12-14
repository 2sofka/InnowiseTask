package com.example.entity;

import org.junit.jupiter.api.Test;
import reader.CustomFileReader;
import reader.impl.CustomFileReaderImpl;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReaderTest {

    @Test
    void parseRowsTest(){
        CustomFileReader customFileReader = new CustomFileReaderImpl();
        String text = "f47ac10b-58cc-4372-a567-0e02b2c3d479\n" +
                "12\n" +
                "\n" +
                "qwerty\n" +
                "qwe\n" +
                "123\n" +
                "1111fa0g-58cc-4372-a567-0e02b2c3d479\n" +
                "17";
        List<String> textList = Arrays.asList(text.split("\n"));
        assertEquals(textList, customFileReader.parseRow());
    }

}
