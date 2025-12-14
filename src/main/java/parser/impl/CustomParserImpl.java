package parser.impl;

import array.impl.CustomArrayImpl;
import factory.CustomFactory;
import factory.impl.CustomArrayFactory;
import parser.CustomParser;
import reader.CustomFileReader;
import reader.impl.CustomFileReaderImpl;
import validation.CustomValidator;
import validation.impl.CustomValidatorImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class CustomParserImpl implements CustomParser {

    @Override
    public List<CustomArrayImpl> parse(List<String> rows) {
        List<CustomArrayImpl> customArrayList = new ArrayList<>();
        CustomValidator customValidator = new CustomValidatorImpl();
        CustomFactory customFactory = new CustomArrayFactory();
        for (int i = 0; i < rows.size() - 1; i += 2) {
            if (customValidator.idValid(rows.get(i)) && customValidator.numbersValid(rows.get(i + 1))) {
                customArrayList
                        .add(customFactory
                                .create(Arrays
                                                .stream(rows.get(i + 1).split(" "))
                                                .mapToInt(Integer::parseInt)
                                                .toArray()
                                        , UUID.fromString(rows.get(i))));


            }
        }

        return customArrayList;
    }
}



