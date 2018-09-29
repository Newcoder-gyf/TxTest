package Day13;

import java.util.Arrays;

// 二分法查找
public class ArraysDemo02 {

    // 二分法查找的数组必须是有序的
    public static void main(String[] args) {

        int[] ints01 = {4,67,35,75,834,345,56,};
        Arrays.sort(ints01);
        System.out.println(Arrays.toString(ints01));

        ArrayBinarySearch(ints01, 75);
    }

    private static void ArrayBinarySearch(int[] array, int element){
        int result = Arrays.binarySearch(array, element);//返回该 element 在 array 中的索引
        System.out.println("the search result is: " + result);
    }
}
