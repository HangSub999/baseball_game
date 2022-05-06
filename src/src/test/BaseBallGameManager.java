package test;

public class BaseBallGameManager {

   public User user;

    public void gameStart(){
        while (true){
            user = new User(Input.inputUserNumber());
        }

    }
}