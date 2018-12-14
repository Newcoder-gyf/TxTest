package AlgorithmTest;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] sequence = new int[] {9, 1, 5, 8, 3, 7, 4, 6, 2};
        System.out.println("Before sorting: " + Arrays.toString(sequence));
        SelectionSortHead2Tail(sequence);
        System.out.println("After sorting: " + Arrays.toString(sequence));
    }

    private static void SelectionSortHead2Tail(int[] Array) {
        for (int i = 0; i < Array.length - 1; i++) {
            int temp = 0;
            int minIndex = i;

            for (int j = i + 1; j < Array.length; j++) {
                if (Array[j] <= Array[minIndex]) {
                    minIndex = j;
                }
            }

            temp = Array[minIndex];
            Array[minIndex] = Array[i];
            Array[i] = temp;
        }

    }
}
