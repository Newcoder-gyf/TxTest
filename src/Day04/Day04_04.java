package Day04;

public class Day04_04 {
    public static void main(String args[]){
        int [] array1 = {1,2,3,4,5,6};
        int [] array2 = {2, 91, 22, 15,66};
        printArray( array1);
        int maxVal = maxValue(array2);
        System.out.println("the max value is " + maxVal);
    }

    public static void printArray(int [] array){
        for(int i = 0; i < array.length; i ++){
            System.out.println(array [i]);
        }
    }

    public static int maxValue(int [] array){
        int result = -1;

        for (int i = 0; i < array.length; i ++){
            if (result < array[i]){
                result = array[i];
            }
        }
        return result;
    }
}
