package test;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final static int DEFAULT = 0;
    private final static int USER_NUMBER_MAX_SIZE = 3;
    private final static int USER_NUMBER_NULL = 0;
    private final static int THREE_BALL = 3;
    private final static int USER_NUMBER_SIZE_ONE = 1;

    private final String userNumber;

    public User(String userNumber) {
        this.userNumber = validateCheckUserNumber(userNumber);
    }

    private List<Integer> SaveUserNumber() {
        List<Integer> list = new ArrayList<>();

        for (int i = DEFAULT; i < userNumber.length(); i++) {
            list.add(Integer.valueOf(userNumber.substring(i, i + USER_NUMBER_SIZE_ONE)));
        }
        return list;
    }

    public int countStrike(List<Integer> computerNumbers) {
        int count = 0;

        for (int i = DEFAULT; i < computerNumbers.size(); i++) {
            if (computerNumbers.get(i).equals(SaveUserNumber().get(i))) {
                count++;
            }
        }
        return count;
    }

    public int countBall(List<Integer> computerNumbers) {
        int count = 0;

        for (int i = DEFAULT; i < THREE_BALL; i++) {
            if (computerNumbers.contains(SaveUserNumber().get(i)))
                count++;
        }
        return count - countStrike(computerNumbers);
    }

    private String validateCheckUserNumber(String userNumber) {
        validateEmpty(userNumber);
        validateTheNumber(userNumber);
        validateCheckOverlapping(userNumber);
        return userNumber;
    }

    private void validateEmpty(String userNumber) {
        if (userNumber.length() == USER_NUMBER_NULL) {
            throw new IllegalArgumentException("입력을 하지 않았습니다.");
        }
    }

    private void validateTheNumber(String userNumber) {
        if (userNumber.length() != USER_NUMBER_MAX_SIZE) {
            throw new IllegalArgumentException("숫자의 갯수가 다릅니다.");
        }
    }

    private void validateCheckOverlapping(String userNumber) {
        for (int i = DEFAULT; i < userNumber.length() - USER_NUMBER_SIZE_ONE; i++) {
            if (userNumber.charAt(i) == userNumber.charAt(i + USER_NUMBER_SIZE_ONE)) {
                throw new IllegalArgumentException("중복된 값이 입력되었습니다.");
            }
        }
    }
}




