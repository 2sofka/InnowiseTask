package entity;

import entity.impl.CustomArray;

import java.util.UUID;

public interface Entity {

    public CustomArray addNumber(int number);

    CustomArray deleteNumber(int position);

    int getSize();

    UUID getId();

    int getNumber(int position);

    int[] getNumbers();

}
