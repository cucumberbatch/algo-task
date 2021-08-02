package tasks.level1.sum;

import java.nio.charset.StandardCharsets;

public class ASCIIDigitsSumAlgorithm implements DigitsSumAlgorithm {
    @Override
    public int calculate(int number) {
        int accumulator = 0;

        if (number < 0) {
            number *= -1;
        }

        for (byte digit : Integer.toString(number).getBytes(StandardCharsets.UTF_8)) {
            accumulator += digit & 0xf;
        }

        return accumulator;
    }
}
