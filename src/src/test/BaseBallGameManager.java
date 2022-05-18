package test;

import java.util.List;

public class BaseBallGameManager {

    private final static int STRIKE_NUMBER = 3;
    private final static int STRIKE_ZERO = 0;
    private final static int BALL_NUMBER = 3;
    private final static int BALL_ZERO = 0;

    public void startGame() {
        List<Integer> computerNumbers = Computer.makeRandomNumber();
        while (true) {
            System.out.println(computerNumbers);
            User user = new User(Input.inputUserNumber());
            if (isThreeStrike(user, computerNumbers)) {
                Output.outputStrike(user.strikeCount(computerNumbers));
                Output.outputCorrectAnswer();
                if (StopEndGoNumber(Input.inputStopEndGoNumber())) {
                    startGame();
                }
                return;
            } else if (isStrikeCount(user, computerNumbers)) {
                Output.outputStrike(user.strikeCount(computerNumbers));
            } else if (isBallCount(user, computerNumbers)) {
                Output.outputBall(user.ballCount(computerNumbers));
            } else {
                Output.outputStrikeBall(user.strikeCount(computerNumbers), user.ballCount(computerNumbers));
            }
        }
    }

    public boolean isThreeStrike(User user, List<Integer> computerNumberList) {
        return user.strikeCount(computerNumberList) == STRIKE_NUMBER;
    }

    public boolean isFourBall(User user, List<Integer> computerNumberList) {
        return user.ballCount(computerNumberList) == BALL_ZERO && user.strikeCount(computerNumberList) == STRIKE_ZERO;
    }

    public boolean isStrikeCount(User user, List<Integer> computerNumberList) {
        return user.strikeCount(computerNumberList) < STRIKE_NUMBER && user.ballCount(computerNumberList) == BALL_ZERO;
    }

    public boolean isBallCount(User user, List<Integer> computerNumberList) {
        return user.ballCount(computerNumberList) <= BALL_NUMBER && user.strikeCount(computerNumberList) == STRIKE_ZERO;
    }

    public boolean StopEndGoNumber(int number) {
        return number == 1;
    }

}
