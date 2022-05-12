package test;

public class BaseBallGameManager {

    private boolean onOff;

    public BaseBallGameManager() {
        this.onOff = true;
    }

    public void gameStart() {
        while (onOff) {
            Computer.makeRandomNumber();
            System.out.println(Computer.makeRandomNumber());
            User user = new User(Input.inputUserNumber());

            if (Referee.strikeCount(user) == 3) {
                Output.outputStrike(Referee.strikeCount(user));
                Output.outputClear();
                isStopEndGo(Input.inputStopEndGoNumber());
            } else if (Referee.ballCount(user) == 0 && Referee.strikeCount(user) == 0) {
                Output.outputFourBall();
            } else if (Referee.strikeCount(user) < 3 && Referee.ballCount(user) == 0) {
                Output.outputStrike(Referee.strikeCount(user));
            } else if (Referee.ballCount(user) <= 3 && Referee.strikeCount(user) == 0) {
                Output.outputBall(Referee.ballCount(user));
            } else {
                Output.outputStrikeBall(Referee.strikeCount(user), Referee.ballCount(user));
            }
        }
    }

    public boolean isStopEndGo(int stopEndGo) {
        if (stopEndGo == 2) {
            return this.onOff = false;
        } else {
            Computer.randomNumberRest();
            return this.onOff = true;
        }
    }

}