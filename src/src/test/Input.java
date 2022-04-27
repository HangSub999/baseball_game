package test;

import java.util.Scanner;

public class Input {

    public static Scanner sc = new Scanner(System.in);


    public static int 숫자를입력해주세요(){
        System.out.print("숫자를 입력해 주세요 : ");
        return sc.nextInt();
    }

    public static int 게임재시작여부(){
        System.out.println("게임을 새로 시작하려면1, 종료하려면 2를입력하세요");
        return sc.nextInt();
    }


}
