package factory;

import entity.impl.CustomArray;

import java.util.UUID;

public interface CustomFactory {

    CustomArray create(int[] numbers, UUID uuid);
}
