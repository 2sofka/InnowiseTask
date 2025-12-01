package service;

import entity.Entity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class Calculations {

    private static final Logger LOGGER = LogManager.getLogger();

    public static int findMin(ArrayList<Entity> entityArrayList){
        if (entityArrayList == null || entityArrayList.isEmpty()){
            LOGGER.error("Null or empty array in Calculations, findMin.");
            return 0;
        }
        int min = entityArrayList.get(0)
                .getNumber();
        for (Entity entity : entityArrayList) {
            min = (min < entity.getNumber())  ? min : entity.getNumber();
        }

        LOGGER.info("Min is {}.", min);
        return min;
    }

    public static int findMax(ArrayList<Entity> entityArrayList){
        if (entityArrayList == null || entityArrayList.isEmpty()){
            LOGGER.error("Null or empty array in Calculations, findMax.");
            return 0;
        }
        int max = entityArrayList.get(0)
                .getNumber();
        for (Entity entity : entityArrayList) {
            max = (max > entity.getNumber())  ? max : entity.getNumber();
        }

        LOGGER.info("Max is {}.", max);
        return max;
    }

    public static int findSumOfNumbers(ArrayList<Entity> entityArrayList){
        if (entityArrayList == null || entityArrayList.isEmpty()){
            LOGGER.error("Null or empty array in Calculations, findSumOfNumbers.");
            return 0;
        }
        int sum = 0;
        for (Entity entity : entityArrayList) {
            sum+=entity.getNumber();
        }
        LOGGER.info("Sum of nums is {}.", sum);
        return sum;
    }

}
