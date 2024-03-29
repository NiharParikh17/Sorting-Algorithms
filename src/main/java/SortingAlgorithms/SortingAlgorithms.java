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

    /**
     * Counting Sort algorithm
     * Worst-case: O(n+m)
     * where n is length of the array and m is the biggest value in the array
     * @param array Array to be sorted
     */
    public static void countingSort(int[] array) {
        int[] sortedArray = new int[array.length];
        int[] count = new int[getMax(array)+1];
        // Updating counters for each value
        for (int j : array) count[j]++;
        // Updating the counts with array positions
        for (int i=1; i<count.length; i++)
            count[i] += count[i-1];
        // Building the sorted array
        for (int j : array) {
            sortedArray[count[j] - 1] = j;
            count[j]--;
        }
        // Copying the sorted array to initial array
        System.arraycopy(sortedArray, 0, array, 0, array.length);
    }

    /* ******************************
     # Helper Methods
     * ******************************/

    private static int getMax(int[] array) {
        int max = array[0];
        for (int i=1; i<array.length; i++)
            if (array[i] > max)
                max = array[i];
        return max;
    }
}
