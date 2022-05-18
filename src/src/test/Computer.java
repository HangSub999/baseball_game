package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Computer {

    public static List<Integer> makeRandomNumber() {
        HashSet<Integer> RANDOM_NUMBER_SET = new HashSet<>();

        while (RANDOM_NUMBER_SET.size() != 3) {
            RANDOM_NUMBER_SET.add((int) (Math.random() * 9) + 1);
        }
        return new ArrayList<>(RANDOM_NUMBER_SET);
    }


}