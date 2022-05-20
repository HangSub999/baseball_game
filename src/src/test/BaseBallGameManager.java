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
                Output.printStrike(user.strikeCount(computerNumbers));
                Output.printCorrectAnswer();
                if (StopEndGoNumber(Input.inputStopEndGoNumber())) {
                    startGame();
                }
                return;
            } else if (isFourBall(user, computerNumbers)) {
                Output.printFourBall();
            } else if (isStrikeCount(user, computerNumbers)) {
                Output.printStrike(user.strikeCount(computerNumbers));
            } else if (isBallCount(user, computerNumbers)) {
                Output.printBall(user.ballCount(computerNumbers));
            } else {
                Output.printStrikeBall(user.strikeCount(computerNumbers), user.ballCount(computerNumbers));
            }
        }

    }

    public boolean isThreeStrike(User user, List<Integer> computerNumbers) {
        return user.strikeCount(computerNumbers) == STRIKE_NUMBER;
    }

    public boolean isFourBall(User user, List<Integer> computerNumbers) {
        return user.ballCount(computerNumbers) == BALL_ZERO && user.strikeCount(computerNumbers) == STRIKE_ZERO;
    }

    public boolean isStrikeCount(User user, List<Integer> computerNumbers) {
        return user.strikeCount(computerNumbers) < STRIKE_NUMBER && user.ballCount(computerNumbers) == BALL_ZERO;
    }

    public boolean isBallCount(User user, List<Integer> computerNumbers) {
        return user.ballCount(computerNumbers) <= BALL_NUMBER && user.strikeCount(computerNumbers) == STRIKE_ZERO;
    }

    public boolean StopEndGoNumber(int number) {
        return number == 1;
    }

}
