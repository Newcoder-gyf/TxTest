package AlgorithmTest;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] sequence = new int[] {9, 1, 5, 8, 3, 7, 4, 6, 2};
        System.out.println("Before sorting: " + Arrays.toString(sequence));
        SelectionSortHead2Tail(sequence);
        System.out.println("After sorting: " + Arrays.toString(sequence));
    }

    private static void SelectionSortHead2Tail(int[] array){
        for (int i = 0; i < array.length-1; i++){
            int temp = 0;
            int minIndex = i;

            for (int j =  i + 1; j < array.length; j++){
                if (array[minIndex] > array[j]){
                    minIndex = j;
                }
            }

            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
