package test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Computer {

    private static final LinkedHashSet<Integer> RANDOM_NUMBER_SET = new LinkedHashSet<>();

    public static List<Integer> makeRandomNumber() {
        while (RANDOM_NUMBER_SET.size() != 3) {
            RANDOM_NUMBER_SET.add((int) (Math.random() * 9) + 1);
        }
        return new ArrayList<>(RANDOM_NUMBER_SET);
    }

    public static boolean randomNumberRest() {
        RANDOM_NUMBER_SET.clear();
        return true;
    }

}