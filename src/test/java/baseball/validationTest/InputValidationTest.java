package baseball.validationTest;

import baseball.validation.InputValidation;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputValidationTest {
    @Test
    void input_값이_3자리_숫자가_아닌경우() {
        String inputNum = "1234";
        Assertions.assertThatThrownBy(() -> {
                    InputValidation.verifyInputNum(inputNum);
                })
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void input_값이_숫자가_아닌경우() {
        String inputNum = "우테코";
        Assertions.assertThatThrownBy(() -> {
                    InputValidation.verifyInputNum(inputNum);
                })
                .isInstanceOf(IllegalArgumentException.class);
    }

}
