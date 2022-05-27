package test;

import java.util.List;

public class BaseBallGameManager {

    public static final int THREE_STRIKE_NUMBER = 3;
    public static final int GAME_RESET_NUMBER_ONE = 1;

    public void startGame() {
        List<Long> computerNumbers = Computer.makeRandomNumber();

        System.out.println(computerNumbers);
        User user = new User(Input.inputUserNumber());

        while (isRestartGameThreeStrike(user, computerNumbers)) {
            ruleManager.isPrintFourBall(user, computerNumbers);
            ruleManager.isPrintStrike(user, computerNumbers);
            ruleManager.isPrintBall(user, computerNumbers);
            ruleManager.isPrintStrikeBall(user, computerNumbers);
            System.out.println(computerNumbers);
            user = new User(Input.inputUserNumber());
        }
    }

    private boolean isRestartGameThreeStrike(User user, List<Long> computerNumbers) {
        if (ruleManager.countStrike(user, computerNumbers) == THREE_STRIKE_NUMBER) {
            Output.printStrike(ruleManager.countStrike(user, computerNumbers));
            Output.printCorrectAnswer();
            return isRestartGame();
        } else {
            return true;
        }
    }

    private boolean isRestartGame() {
        if (Input.inputRestartNumber() == GAME_RESET_NUMBER_ONE) {
            Input.SC.nextLine();
            startGame();
        }
        return false;
    }

}
