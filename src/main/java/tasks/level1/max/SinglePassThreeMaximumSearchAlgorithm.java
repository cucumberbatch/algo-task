package tasks.level1.max;

/**
 * Данная реализация алгоритма поиска трех максимумов выполнена в один проход массива.
 * <p>Худший случай: O(n) <p>Лучший случай: O(n)
 */
public class SinglePassThreeMaximumSearchAlgorithm implements ThreeMaximumSearchAlgorithm {
    @Override
    public int[] search(int[] array) {
        if (array.length < 3) {
            throw new IllegalArgumentException("Not enough of array items!");
        }

        int[] max = {
                Integer.MIN_VALUE,
                Integer.MIN_VALUE,
                Integer.MIN_VALUE
        };

        for (int j : array) {
            if (j > max[2]) {
                max[0] = max[1];
                max[1] = max[2];
                max[2] = j;
            } else if (j > max[1]) {
                max[0] = max[1];
                max[1] = j;
            } else if (j > max[0]) {
                max[0] = j;
            }
        }

        return max;
    }
}
