package tasks.level1.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DigitsSumAlgorithmTest {
    static final int value1    = 3524686;
    static final int expected1 = 34;

    static final int value2    = -216437;
    static final int expected2 = 23;

    @Test
    void testBitShiftingBasedDigitsSumAlgorithm1() {
        DigitsSumAlgorithm algorithm = new ASCIIDigitsSumAlgorithm();
        int actual = algorithm.calculate(value1);

        Assertions.assertEquals(expected1, actual);
    }

    @Test
    void testBitShiftingBasedDigitsSumAlgorithm2() {
        DigitsSumAlgorithm algorithm = new ASCIIDigitsSumAlgorithm();
        int actual = algorithm.calculate(value2);

        Assertions.assertEquals(expected2, actual);
    }
}