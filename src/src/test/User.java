package test;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final String userNumber;

    public User(String userNumber) {
        this.userNumber = userNumber;
    }

    private List<Integer> SaveUserNumber() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < userNumber.length(); i++) {
            list.add(Integer.valueOf(userNumber.substring(i, i + 1)));
        }
        return list;
    }

    public int strikeCount(List<Integer> computerNumberList) {
        int count = 0;

        for (int i = 0; i < computerNumberList.size(); i++) {
            if (computerNumberList.get(i).equals(SaveUserNumber().get(i))) {
                count++;
            }
        }
        return count;
    }

    public int ballCount(List<Integer> computerNumberList) {
        int count = 0;
        int ball = 3;

        for (int i = 0; i < ball; i++) {
            if (computerNumberList.contains(SaveUserNumber().get(i)))
                count++;
        }
        return count - strikeCount(computerNumberList);
    }

}





