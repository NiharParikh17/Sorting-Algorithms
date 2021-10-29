package SortingAlgorithms;

public class SortingAlgorithms {
    /**
     * Insertion Sort algorithm
     * Worst-case: O(n^2)
     * @param array Array to be sorted
     */
    public static void insertionSort(int[] array) {
        int length = array.length;
        for (int i=1; i<length; i++) {
            int value = array[i];
            int j = i-1;
            while ((j >= 0) && (array[j] > value)) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = value;
        }
    }
}
