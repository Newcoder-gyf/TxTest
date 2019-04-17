package JavaTest;

import java.text.DecimalFormat;
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int tempInt = sc.nextInt();
        String tempS = S.substring(1, S.length() - 1);
        String[] sArray = tempS.split(", ");

        int[] color = new int[sArray.length];
        for (int i = 0; i < sArray.length; i++){
            color[i] = Integer.parseInt(sArray[i]);
        }
        double smaller = 0;
        double larger = 0;
        for (int i = 0; i < color.length; i++){
            for (int j = i + 1; j < color.length; j++){

                int diff = Math.abs(color[i] - color[j]);
                //System.out.println(diff);
                if (diff <= tempInt){
                    smaller++;
                }else{
                    larger++;
                }
            }
        }
        DecimalFormat df=new DecimalFormat("#.000000");
        //System.out.println(smaller);
        //System.out.println(larger);
        double result = smaller / (smaller + larger);
        System.out.println(df.format(result));
    }
}