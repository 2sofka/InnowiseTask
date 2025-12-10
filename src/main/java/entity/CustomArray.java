package entity;

import entity.impl.CustomArrayImpl;

import java.util.UUID;

public interface CustomArray {

    public CustomArrayImpl addNumber(int number);

    CustomArrayImpl deleteNumber(int position);

    int getSize();

    UUID getId();

    int getNumber(int position);

    int[] getNumbers();

}
