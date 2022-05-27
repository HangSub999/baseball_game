package test;

import java.util.List;

public class BaseBallGameManager {

    public void startGame() {
        List<Long> computerNumbers = Computer.makeRandomNumber();

        System.out.println(computerNumbers);
        User user = new User(Input.inputUserNumber());

        while (쓰리스트라이크시작종료(user, computerNumbers)) {
            is포볼(user, computerNumbers);
            is스트라이크(user, computerNumbers);
            is볼(user, computerNumbers);
            is스트라이크볼(user, computerNumbers);
            System.out.println(computerNumbers);
            user = new User(Input.inputUserNumber());
        }
    }

    private void is스트라이크볼(User user, List<Long> computerNumbers) {
        if (user.countStrike(computerNumbers) > 0 && user.countBall(computerNumbers) > 0) {
            if (user.countStrike(computerNumbers) < 2 && user.countBall(computerNumbers) < 3) {
                Output.printStrikeBall(user.countStrike(computerNumbers), user.countBall(computerNumbers));
            }
        }
    }

    private void is볼(User user, List<Long> computerNumbers) {
        if (user.countBall(computerNumbers) > 0) {
            if (user.countBall(computerNumbers) <= 3 && user.countStrike(computerNumbers) == 0) {
                Output.printBall(user.countBall(computerNumbers));
            }
        }
    }

    private void is스트라이크(User user, List<Long> computerNumbers) {
        if (user.countStrike(computerNumbers) > 0) {
            if (user.countStrike(computerNumbers) < 3 && user.countBall(computerNumbers) == 0) {
                Output.printStrike(user.countStrike(computerNumbers));
            }
        }
    }

    private void is포볼(User user, List<Long> computerNumbers) {
        if (user.countBall(computerNumbers) == 0 && user.countStrike(computerNumbers) == 0) {
            Output.printFourBall();
        }
    }

    private boolean 쓰리스트라이크시작종료(User user, List<Long> computerNumbers) {
        if (user.countStrike(computerNumbers) == 3) {
            Output.printStrike(user.countStrike(computerNumbers));
            Output.printCorrectAnswer();
            return is시작또는종료();
        } else {
            return true;
        }
    }

    public boolean is시작또는종료() {
        if (Input.inputStopEndGoNumber() == 1) {
            Input.SC.nextLine();
            startGame();
        }
        return false;
    }

}
