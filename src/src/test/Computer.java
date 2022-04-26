package test;

import java.util.ArrayList;
import java.util.List;

public class Computer {
   private static List<Integer> arrayList = new ArrayList<>();

    public static List<Integer> 랜덤번호생성(){
       for (int i = 0; i < 3; i++) {
           arrayList.add((int)(Math.random()*9)+1);
       }
       return arrayList;
   }
}
