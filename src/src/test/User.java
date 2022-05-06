package test;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int userNumber;
    private final List<Integer> userNumberList;

    public User(int userNumber) {
        this.userNumberList = new ArrayList<>();
        this.userNumber = userNumber;
    }


    public List<Integer> userNumberSave() {
        userNumberList.add(userNumber / 100);
        userNumber = userNumber % 100;
        userNumberList.add(userNumber / 10);
        userNumberList.add(userNumber % 10);

        return userNumberList;
    }



}

