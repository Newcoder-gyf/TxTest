package Day13;

import java.util.Arrays;
import java.util.List;

//将数组转成List
public class ArraysDemo03 {

    public static void main(String[] args) {

        Integer[] ints01 = {4,67,35,75,834,345,56,};

        //把数组转换成List
        List<Integer> list = Arrays.asList(ints01);
        System.out.println(list);

        /**
         * UnsupportedOperationException
         * 运行时异常
         * 从数组转换过来的List不支持add, remove 方法
         * 支持set（修改）方法
         */

        //list.add(100);
        //list.remove(75);
        list.set(3, 7500);
        System.out.println(list);


    }
}
