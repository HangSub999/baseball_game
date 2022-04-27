package test;

import java.util.ArrayList;
import java.util.List;

public class User {
    List<Integer> list = new ArrayList<>();

    public List<Integer> 유저숫자(int 숫자) {
        while (숫자 > 0) {
            list.add(숫자 % 10);
            숫자 = 숫자 / 10;
        }
    }

}

