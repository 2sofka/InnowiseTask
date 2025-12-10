package parser.impl;

import entity.impl.CustomArrayImpl;
import factory.CustomFactory;
import factory.impl.CustomArrayFactory;
import parser.CustomParser;
import validation.CustomValidator;
import validation.impl.CustomValidatorImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class CustomParserImpl implements CustomParser {

    @Override
    public List<CustomArrayImpl> parse(String[] rows) {
        List<CustomArrayImpl> customArrayList = new ArrayList<>();
        CustomValidator customValidator = new CustomValidatorImpl();
        CustomFactory customFactory = new CustomArrayFactory();
        for (int i = 0; i < rows.length - 1; i += 2) {
            if (customValidator.idValid(rows[i]) && customValidator.numbersValid(rows[i + 1])) {
                customArrayList
                        .add(customFactory
                                .create(Arrays
                                            .stream(rows[i + 1].split(" "))
                                            .mapToInt(Integer::parseInt)
                                            .toArray()
                                    ,UUID.fromString(rows[i])));


            }
        }

        return customArrayList;
    }
}
