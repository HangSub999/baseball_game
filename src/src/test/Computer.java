package test;

import java.util.ArrayList;
import java.util.List;

public class Computer {


    public static List<Integer> 랜덤번호생성() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add((int) (Math.random() * 9) + 1);
        for (int i = 0; i < 2; i++) {
            int 랜덤숫자 = (int) (Math.random() * 9) + 1;
            if (arrayList.contains(랜덤숫자)) {
                    i--;
            } else {
                arrayList.add(랜덤숫자);
            }
        }
        return arrayList;
    }


}
