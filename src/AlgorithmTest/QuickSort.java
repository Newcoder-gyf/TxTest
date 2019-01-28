package AlgorithmTest;

public class QuickSort {
    public static void main(String[] args){

        int[] test = new int[]{2,7,4,5,10,1,9,3,8,6};
        QuickSort(test, 0, test.length-1);
        for(int a : test){
            System.out.print(a + " ");
        }
    }

    private static void QuickSort(int[] Array, int left, int right){

        if(left > right){
            return;
        }

        int pivot = divide(Array, left, right);
        QuickSort(Array, left, pivot-1);
        QuickSort(Array,pivot+1, right);
    }

    private static int divide(int[] Array, int low, int high){
        int pivot = Array[high];
        while (low < high){

            while(low < high && Array[low] <= pivot){
                low++;
            }
            if (low < high){
                int temp = Array[low];
                Array[low] = Array[high];
                Array[high] = temp;
                high--;
            }
            while(low < high && Array[high] >=pivot){
                high--;
            }
            if(low < high){
                int temp = Array[low];
                Array[low] = Array[high];
                Array[high] = temp;
                low++;
            }
        }
        return high;

    }
}
