package ZiJieTiaoDong;

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0 ; i < n; i++){
            array[i] = sc.nextInt();
        }
        Main solu = new Main();
        solu.Solution(array, n - 1);
    }

    private int Solution(int[] array, int index){
        if (index == 0){
            return array[0];
        }else{
            int min = Solution(array, index - 1);
            
        }
    }

}

