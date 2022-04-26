package test;

public class BaseBallGameManager {

    public boolean 게임시작() {
        while (true) {
            Input.숫자를입력해주세요();
            User.사용자숫자();
            if (Computer.랜덤번호생성().equals(User.사용자숫자())) {
                Output.결과출력스트라이크(3);
                Output.게임종료();
                Input.게임재시작여부();
                User.재실행숫자();
                if (User.재실행숫자() == 2) {
                    break;
                }
            }
            else {
                System.out.println("틀렸습니다.");
                break;
            }
        }
        return true;
    }
}
