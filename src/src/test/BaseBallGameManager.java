package test;

import java.util.List;

public class BaseBallGameManager {

    public static final int THREE_STRIKE_NUMBER = 3;
    public static final int GAME_RESET_NUMBER_ONE = 1;
    public static final int RESTART_NUMBER_THREE = 3;

    public void startGame() {
        List<Long> computerNumbers = Computer.makeRandomNumber();
        System.out.println(computerNumbers);
        User user = new User(Input.inputUserNumber());
        while (isRestartGameThreeStrike(user, computerNumbers)) {
            ruleManager.compareFourBall(user, computerNumbers);
            ruleManager.compareStrike(user, computerNumbers);
            ruleManager.compareBall(user, computerNumbers);
            ruleManager.compareStrikeBall(user, computerNumbers);
            System.out.println(computerNumbers);
            user = new User(Input.inputUserNumber());
        }
    }

    private boolean isRestartGameThreeStrike(User user, List<Long> computerNumbers) {
        if (ruleManager.countStrike(user, computerNumbers) == THREE_STRIKE_NUMBER) {
            Output.printStrike(ruleManager.countStrike(user, computerNumbers));
            Output.printCorrectAnswer();
            return isRestartGame();
        }
        return true;

    }

    private boolean isRestartGame() {
        int restartNumber = Input.inputRestartNumber();
        if (restartNumber < RESTART_NUMBER_THREE) {
            if (restartNumber == GAME_RESET_NUMBER_ONE) {
                Input.SC.nextLine();
                startGame();
            }
        }
        return false;
    }





}
