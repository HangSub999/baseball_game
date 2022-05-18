package test;

import java.util.*;

public class Computer {

    public static List<Integer> makeRandomNumber() {
        Set<Integer> randomNumbers = new HashSet<>();

        while (randomNumbers.size() != 3) {
            randomNumbers.add((int) (Math.random() * 9) + 1);
        }
        return new ArrayList<>(randomNumbers);
    }


}