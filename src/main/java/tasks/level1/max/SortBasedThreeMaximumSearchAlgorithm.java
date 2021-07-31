package tasks.level1.max;

import java.util.Arrays;

/**
 * Данная реализация алгоритма поиска трех максимальных элементов основана на сортировке {@code Arrays.sort()},
 * которая использует разновидность быстрой сотрировки TimSort начиная с Java SE 7.
 * А так же алгоритм имеет более "читаемый" вид.
 *
 * <p>Худший случай: O(n*log(n)) <p>Лучший случай: O(n)
 */
public class SortBasedThreeMaximumSearchAlgorithm implements ThreeMaximumSearchAlgorithm {
    @Override
    public int[] search(int[] array) throws IllegalArgumentException {
        if (array.length < 3) {
            throw new IllegalArgumentException("Not enough of array items!");
        }

        Arrays.sort(array);
        return Arrays.copyOfRange(array, array.length - 3, array.length);
    }
}
