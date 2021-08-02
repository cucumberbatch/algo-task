package tasks.level1.sum;

public class DivisionBasedDigitsSumAlgorithm implements DigitsSumAlgorithm {
    @Override
    public int calculate(int number) {
        int accumulator = 0;

        if (number < 0) {
            number *= -1;
        }

        while (number > 0) {
            accumulator += number % 10;
            number      /= 10;
        }

        return accumulator;
    }
}
