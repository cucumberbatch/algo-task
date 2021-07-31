package tasks.level1.sum;

import java.nio.charset.StandardCharsets;

public class ASCIIDigitsSumAlgorithm implements DigitsSumAlgorithm {
    private static final int ZERO_CHARACTER_ASCII_CODE = '0';

    @Override
    public int calculate(int number) {
        int accumulator = 0;

        if (number < 0) {
            number = number * -1;
        }

        for (byte digit : Integer.toString(number).getBytes(StandardCharsets.UTF_8)) {
            accumulator += digit - ZERO_CHARACTER_ASCII_CODE;
        }

        return accumulator;
    }
}
