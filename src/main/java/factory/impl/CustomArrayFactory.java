package factory.impl;

import entity.impl.CustomArray;
import factory.CustomFactory;

import java.util.UUID;

public class CustomArrayFactory implements CustomFactory {

    @Override
    public CustomArray create(int[] numbers, UUID uuid) {
        return new CustomArray.Builder()
                .setId(uuid)
                .setNumbers(numbers)
                .build();
    }
}
