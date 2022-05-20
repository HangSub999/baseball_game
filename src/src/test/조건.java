package test;

import java.util.List;

public class 조건 {

    public static void 쓰리스트라이크검사(User user, List<Integer> computerNumbers, BaseBallGameManager baseBallGameManager) {
        if (baseBallGameManager.isThreeStrike(user, computerNumbers)) {
            Output.printStrike(user.strikeCount(computerNumbers));
            Output.printCorrectAnswer();
            if (baseBallGameManager.StopEndGoNumber(Input.inputStopEndGoNumber())) {
                baseBallGameManager.startGame();
            }
        }
    }
}
