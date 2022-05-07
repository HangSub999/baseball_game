package test;

import java.util.Scanner;

public class Input {

    public static final Scanner SC = new Scanner(System.in);

    public static int inputUserNumber(){
        System.out.print("숫자를 입력해 주세요 : ");
        return SC.nextInt();
    }

    public static int inputStopEndGoNumber(){
        System.out.println("게임을 새로 시작하려면1, 종료하려면 2를입력하세요");
        return SC.nextInt();
    }

}
