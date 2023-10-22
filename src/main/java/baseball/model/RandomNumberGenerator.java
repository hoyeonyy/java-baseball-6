package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomNumberGenerator {
    public static List<Integer> makeRandomNumber() {
        List<Integer> answerNumbers = new ArrayList<>();
        while (answerNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);

            if (!answerNumbers.contains(randomNumber)) {
                answerNumbers.add(randomNumber);
            }
        }
        return answerNumbers;
    }
}