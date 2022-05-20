package test;

public class Main {

    public static void main(String[] args) {

       try {
           BaseBallGameManager baseBallGameManager = new BaseBallGameManager();
           baseBallGameManager.startGame();
       }catch (IllegalArgumentException e){
           System.out.println(e.getMessage());
       }
    }

}
