package test;

import java.util.ArrayList;
import java.util.List;

public class User {

    private static final int NUMBER_SIZE_ZERO = 0;
    private static final int NUMBER_SIZE_ONE = 1;
    private static final int NUMBER_SIZE_TWO = 2;
    private static final int NUMBER_SIZE_THREE = 3;

    private final List<Long> userNumbers;

    public User(String userNumber) {
        this.userNumbers = validateReprocessingCheckUserNumber(userNumber);
    }

    public int countStrike(List<Long> computerNumbers) {
        int strikeCount = 0;
        int userNumberIndex = 0;
        for (Long comNumber : computerNumbers) {
            if (comNumber.equals(userNumbers.get(userNumberIndex++))) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    public int countBall(List<Long> computerNumbers) {
        int ballCount = 0;
        for (Long userNumber : userNumbers) {
            if (computerNumbers.contains(userNumber)) {
                ballCount++;
            }
        }
        return ballCount - countStrike(computerNumbers);
    }

    private List<Long> validateReprocessingCheckUserNumber(String userNumber) {
        validateEmpty(userNumber);
        validateVacuum(userNumber);
        validateCompareLetter(userNumber);
        validateTheNumber(userNumber);
        validateCheckOverlapping(userNumber);
        List<Long> userNumbers = new ArrayList<>();
        for (int i = NUMBER_SIZE_ZERO; i < userNumber.length(); i++) {
            userNumbers.add(Long.parseLong(userNumber.substring(i, i + NUMBER_SIZE_ONE)));
        }
        return userNumbers;
    }

    private void validateCompareLetter(String userNumber) {
        try {
            Long.parseLong(userNumber);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("숫자가 아닙니다.");
        }
    }

    private void validateEmpty(String userNumber) {
        if (userNumber.length() == NUMBER_SIZE_ZERO) {
            throw new IllegalArgumentException("입력을 하지 않았습니다.");
        }
    }

    private void validateTheNumber(String userNumber) {
        if (userNumber.length() != NUMBER_SIZE_THREE) {
            throw new IllegalArgumentException("숫자의 갯수가 다릅니다.");
        }
    }

    private void validateVacuum(String userNumber) {
        char[] userChar = userNumber.toCharArray();
        for (char ch : userChar){
            if (ch == ' '){
                throw new IllegalArgumentException("공백을 제거하고 입력해 주세요");
            }
        }
    }

    private void validateCheckOverlapping(String userNumber) {
        if (userNumber.charAt(NUMBER_SIZE_ZERO) == userNumber.charAt(NUMBER_SIZE_ONE) ||
                userNumber.charAt(NUMBER_SIZE_ZERO) == userNumber.charAt(NUMBER_SIZE_TWO) ||
                userNumber.charAt(NUMBER_SIZE_ONE) == userNumber.charAt(NUMBER_SIZE_TWO)) {
            throw new IllegalArgumentException("중복된 값이 있습니다.");
        }
    }

}




