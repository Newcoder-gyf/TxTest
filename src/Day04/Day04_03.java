package Day04;
/*
* 数组的定义和引用
* */
public class Day04_03 {
    public static void main(String args[]){
        //定义一个10 个长度的整数类型的数组
        int arr1 [] = new int [5];
        char [] arr2 = {'1','2','3','4'};
        int length1 = arr1.length;
        int length2 = arr2.length;
        System.out.println(length1);
        System.out.println(length2);

        for (int i = 0; i < arr1.length; i ++){
            System.out.println(arr1 [i]);
        }
        for (int i = 0; i < arr2.length; i ++){
            System.out.println(arr2 [i]);
        }
    }
}
