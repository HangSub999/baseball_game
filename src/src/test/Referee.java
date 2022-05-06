package test;

public class Referee {

    public static int strikeCount(User user){
        int count = 0;
        for (int i = 0; i < Computer.makeRandomNumber().size(); i++) {
            if (Computer.makeRandomNumber().get(i).equals(user.userNumberSave().get(i))){
                count++;
            }
        }
        return count;
    }

    public static int ballCount(User user){
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (Computer.makeRandomNumber().contains(user.userNumberSave().get(i)))
                 count++;
        }
        return count - strikeCount(user);
    }
}
