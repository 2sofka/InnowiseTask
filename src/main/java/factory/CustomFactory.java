package factory;

import array.impl.CustomArrayImpl;

import java.util.UUID;

public interface CustomFactory {

    CustomArrayImpl create(int[] numbers, UUID uuid);
}
