package service.impl;

import array.impl.CustomArrayImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import service.Calculations;

public class CalculationsImpl implements Calculations {

    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public int findMin(CustomArrayImpl customArray) {
        int min = Integer.MAX_VALUE;
        int[] numbers = customArray.getNumbers();
        for (Integer number : numbers) {
            if(number < min){
                min = number;
            }
        }
        LOGGER.info("Min is {}.", min);
        return min;
    }

    @Override
    public int findMax(CustomArrayImpl customArray) {
        int max = Integer.MIN_VALUE;
        int[] numbers = customArray.getNumbers();
        for (Integer number : numbers) {
            if(number > max){
                max = number;
            }
        }

        LOGGER.info("Max is {}.", max);
        return max;
    }

    @Override
    public int findSumOfNumbers(CustomArrayImpl customArray) {
        int sum = 0;
        int[] numbers = customArray.getNumbers();
        for (Integer number : numbers) {
            sum+=number;
        }

        LOGGER.info("Sum of nums is {}.", sum);
        return sum;
    }

}
