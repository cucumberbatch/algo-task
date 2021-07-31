package tasks.level1.max;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ThreeMaximumSearchAlgorithmTest {
    static final int[] array1 = {
            10, 9, 8, 7, 6, 5, 4, 3, 2, 1
    };
    static final int[] expectedArray1 = {
            8, 9, 10
    };

    static final int[] array2 = {
            1125, 2352, 5323, 43, 552, 6, 277, 38, 68, 1000, 234, 999, 1, 3572
    };
    static final int[] expectedArray2 = {
            2352, 3572, 5323
    };

    @Test
    void testSortBasedThreeMaximumSearchAlgorithm1() {
        ThreeMaximumSearchAlgorithm algorithm = new SortBasedThreeMaximumSearchAlgorithm();
        int[] actualArray = algorithm.search(array1);

        Assertions.assertArrayEquals(expectedArray1, actualArray);
    }

    @Test
    void testSortBasedThreeMaximumSearchAlgorithm2() {
        ThreeMaximumSearchAlgorithm algorithm = new SortBasedThreeMaximumSearchAlgorithm();
        int[] actualArray = algorithm.search(array2);

        Assertions.assertArrayEquals(expectedArray2, actualArray);
    }

    @Test
    void testSinglePassThreeMaximumSearchAlgorithm1() {
        ThreeMaximumSearchAlgorithm algorithm = new SinglePassThreeMaximumSearchAlgorithm();
        int[] actualArray = algorithm.search(array1);

        Assertions.assertArrayEquals(expectedArray1, actualArray);
    }

    @Test
    void testSinglePassThreeMaximumSearchAlgorithm2() {
        ThreeMaximumSearchAlgorithm algorithm = new SinglePassThreeMaximumSearchAlgorithm();
        int[] actualArray = algorithm.search(array2);

        Assertions.assertArrayEquals(expectedArray2, actualArray);
    }
}