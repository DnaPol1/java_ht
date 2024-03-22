import java.util.Arrays;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SortTest {

    private static int[] sort(int[] nums) {
        int[] array = Arrays.copyOf(nums, nums.length);
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    @Test
    public void sortWorks() {
        Assertions.assertArrayEquals(new int[]{1}, sort(new int[]{1}));
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5}, sort(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    public void sortReturnsNewArray() {
        int[] input = {9, 1, 3, 11, 45, 499};
        int[] copy = Arrays.copyOf(input, input.length);

        int[] sorted = sort(input);

        Assertions.assertArrayEquals(new int[]{1, 3, 9, 11, 45, 499}, sorted);
        Assertions.assertArrayEquals(copy, input);
    }
}
