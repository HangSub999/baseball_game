package test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Computer {

    private static final LinkedHashSet<Integer> randomNumberSet = new LinkedHashSet<>();

    public static List<Integer> makeRandomNumber() {
        while (randomNumberSet.size() != 3) {
            randomNumberSet.add((int) (Math.random() * 9) + 1);
        }
        return new ArrayList<>(randomNumberSet);
    }

    public static boolean randomNumberRest() {
        randomNumberSet.clear();
        return true;
    }

}