package SortingAlgorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingAlgorithmsTest {
    private int[] actualArray;
    private final int[] expectedArray = {14, 27, 31, 36, 40};

    @BeforeEach
    public void beforeEachAlgorithm() {
        actualArray = new int[]{36, 14, 27, 40, 31};
    }

    @Test
    public void insertionSortTest() {
        SortingAlgorithms.insertionSort(actualArray);
        assertArrayEquals(expectedArray, actualArray);
    }

    @Test
    public void countingSortTest() {
        SortingAlgorithms.countingSort(actualArray);
        assertArrayEquals(expectedArray, actualArray);
    }
}
