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
        Computer.makeRandomNumber().retainAll(user.userNumberSave());
        count = Computer.makeRandomNumber().size() - strikeCount(user);
        return count;
    }
}
