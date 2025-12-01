package service;

import entity.Entity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Sorting {

    private static final Logger LOGGER = LogManager.getLogger();

    public static ArrayList<Entity> bubbleSort(ArrayList<Entity> entityArrayList) {
        if (entityArrayList == null || entityArrayList.isEmpty()) {
            LOGGER.error("Null or empty array in Sorting, BubbleSort.");
            return null;
        }
        int arraySize = entityArrayList.size();

        for (int i = 0; i < arraySize - 1; i++) {
            for (int j = 0; j < arraySize - 1 - i; j++) {
                int num1 = entityArrayList.get(j).getNumber();
                int num2 = entityArrayList.get(j + 1).getNumber();

                if (num1 < num2) {
                    Entity temp = entityArrayList.get(j);
                    entityArrayList.set(j, entityArrayList.get(j + 1));
                    entityArrayList.set(j + 1, temp);
                }
            }
        }
        LOGGER.info("Array sorted successfully.");
        return entityArrayList;
    }

    public static ArrayList<Entity> insertionSort(ArrayList<Entity> entityArrayList) {
        if (entityArrayList == null || entityArrayList.isEmpty()) {
            LOGGER.error("Null or empty array in Sorting, insertionSort.");
            return null;
        }
        int arraySize = entityArrayList.size();

        for (int i = 1; i < arraySize; i++) {
            Entity current = entityArrayList.get(i);
            int currentNum = current.getNumber();
            int j = i - 1;

            while (j >= 0 && entityArrayList.get(j).getNumber() < currentNum) {
                entityArrayList.set(j + 1, entityArrayList.get(j));
                j--;
            }

            entityArrayList.set(j + 1, current);
        }
        LOGGER.info("Array sorted successfully.");
        return entityArrayList;
    }
}
