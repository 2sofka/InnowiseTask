package service;

import entity.impl.CustomArrayImpl;

public interface Calculations {
    int findMin(CustomArrayImpl customArray);

    int findMax(CustomArrayImpl customArray);

    int findSumOfNumbers(CustomArrayImpl customArray);
}
