package Day10;

import java.util.Scanner;

public class DebugDemo01 {
    private int num;

    public String show(int i){
        return "";
    }

    public static void sort(int[] Array){
         for (int i = 0; i < Array.length - 1; i++){
             for (int j = 0; j < Array.length - i - 1; j++){
                  if (Array[j] < Array[j + 1]){
                       int temp = Array[j];
                       Array[j ] = Array[j + 1];
                       Array[j + 1] = temp;
                  }
             }
         }
    }

    public static void Display(int[] Array){
        for (int i = 0; i < Array.length; i ++){
            System.out.print(Array[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] Array01 = {23, 44, 35, 60, 24, 13};
        sort(Array01);
        Display(Array01);
    }
}
