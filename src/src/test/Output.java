package test;

public class Output {

    public static void printStrikeBall(int strike, int ball) {
        System.out.println(strike + " 스트라이크 " + ball + " 볼");
    }

    public static void printStrike(int strike) {
        System.out.println(strike + " 스트라이크 ");
    }

    public static void printBall(int ball) {
        System.out.println(ball + " 볼");
    }

    public static void printFourBall() {
        System.out.println("포볼");
    }

    public static void printCorrectAnswer() {
        System.out.println("3개의 숫자 모두 맞히셨습니다! 게임 종료");
    }

}
