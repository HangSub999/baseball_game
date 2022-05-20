package test;

import java.util.List;

public class BaseBallGameManager {

    private final static int STRIKE_NUMBER = 3;
    private final static int STRIKE_ZERO = 0;
    private final static int BALL_NUMBER = 3;
    private final static int BALL_ZERO = 0;

    public void startGame() {

        while (true) {
            List<Integer> computerNumbers = Computer.makeRandomNumber();
            System.out.println(computerNumbers);
            User user = new User(Input.inputUserNumber());

            if (isThreeStrike(user, computerNumbers)) {
                Output.printStrike(user.countStrike(computerNumbers));
                Output.printCorrectAnswer();
                if (StopEndGoNumber(Input.inputStopEndGoNumber())) {
                    startGame();
                }
                return;
            } else if (isFourBall(user, computerNumbers)) {
                Output.printFourBall();
            } else if (isCountStrike(user, computerNumbers)) {
                Output.printStrike(user.countStrike(computerNumbers));
            } else if (isCountBall(user, computerNumbers)) {
                Output.printBall(user.countBall(computerNumbers));
            } else {
                Output.printStrikeBall(user.countStrike(computerNumbers), user.countBall(computerNumbers));
            }
        }

    }

    public boolean isThreeStrike(User user, List<Integer> computerNumbers) {
        return user.countStrike(computerNumbers) == STRIKE_NUMBER;
    }

    public boolean isFourBall(User user, List<Integer> computerNumbers) {
        return user.countBall(computerNumbers) == BALL_ZERO && user.countStrike(computerNumbers) == STRIKE_ZERO;
    }

    public boolean isCountStrike(User user, List<Integer> computerNumbers) {
        return user.countStrike(computerNumbers) < STRIKE_NUMBER && user.countBall(computerNumbers) == BALL_ZERO;
    }

    public boolean isCountBall(User user, List<Integer> computerNumbers) {
        return user.countBall(computerNumbers) <= BALL_NUMBER && user.countStrike(computerNumbers) == STRIKE_ZERO;
    }

    public boolean StopEndGoNumber(int number) {
        return number == 1;
    }

}
