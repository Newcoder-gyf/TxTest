package AlgorithmTest;

import java.util.Arrays;

//假设这里有一个长度为N的二维数组Array
public class ShuffleNArrays {

    public static void main(String[] args){

    }

    private void Shuffle(String[][] Array){
        //判断数组是否为空
        if(Array.length == 0 || Array == null){
            return ;
        }

        //先对数组进行升序排序，方面查找最长子元素
        Arrays.sort(Array);

        //获取新数组长度 == 整个Array子元素长度和
        int length = 0;
        for (int i = 0; i < Array.length; i++) {
            length = length + Array[i].length;
        }

        String[] result = new String[length];

        //向新数组中插入原始数组数据
        for (int i = 0; i < Array[length-1].length; i--){
            for (int j = 0 ; j < Array.length; j++){
                result[i+j] = Array[i][j];
            }
        }

        System.out.println(result);

    }

}
