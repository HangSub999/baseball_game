package test;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int userNumber;
    private final List<Integer> USER_NUMBER_LIST;

    public User(int userNumber) {
        this.USER_NUMBER_LIST = new ArrayList<>();
        this.userNumber = userNumber;
    }

    public List<Integer> userNumberSave() {
        USER_NUMBER_LIST.add(userNumber / 100);
        userNumber = userNumber % 100;
        USER_NUMBER_LIST.add(userNumber / 10);
        USER_NUMBER_LIST.add(userNumber % 10);

        return USER_NUMBER_LIST;
    }



}

