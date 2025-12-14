package factory.impl;

import array.impl.CustomArrayImpl;
import factory.CustomFactory;

import java.util.UUID;

public class CustomArrayFactory implements CustomFactory {

    @Override
    public CustomArrayImpl create(int[] numbers, UUID uuid) {
        return new CustomArrayImpl.Builder()
                .setId(uuid)
                .setNumbers(numbers)
                .build();
    }
}
