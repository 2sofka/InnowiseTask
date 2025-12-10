package service.impl;

import entity.impl.CustomArray;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.Sorting;

import java.util.Arrays;

public class SortingImpl implements Sorting {

    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public CustomArray bubbleSort(CustomArray customArray) {
        int arraySize = customArray.getSize();
        int[] numbers = customArray.getNumbers();
        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = 0; j < arraySize - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        customArray = new CustomArray.Builder()
                .setNumbers(numbers)
                .build();

        LOGGER.info("Array sorted successfully.");
        return customArray;
    }

    @Override
    public CustomArray insertionSort(CustomArray customArray) {
        int arraySize = customArray.getSize();
        int[] numbers = customArray.getNumbers();

        for (int i = 1; i < arraySize; i++) {
            int current = numbers[i];
            int j = i - 1;

            while (j >= 0 && numbers[j] > current) {
                numbers[j + 1] = numbers[j];
                j--;
            }

            numbers[j + 1] = current;
        }

        customArray = new CustomArray.Builder()
                .setNumbers(numbers)
                .build();

        LOGGER.info("Array sorted successfully.");
        return customArray;
    }
}
