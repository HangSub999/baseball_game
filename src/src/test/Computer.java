package test;

import java.util.*;

public class Computer {

    private static final int RANDOM_NUMBER_MINIMUM_ONE = 1;
    private static final int RANDOM_NUMBER_SIZE_THREE = 3;
    private static final int RANDOM_NUMBER_MAXIMUM_NINE = 9;

    public static List<Long> makeRandomNumber() {
        Set<Long> randomNumbers = new HashSet<>();
        while (randomNumbers.size() != RANDOM_NUMBER_SIZE_THREE) {
            randomNumbers.add((long) ((int) (Math.random() * RANDOM_NUMBER_MAXIMUM_NINE) + RANDOM_NUMBER_MINIMUM_ONE));
        }
        return new ArrayList<>(randomNumbers);
    }

}