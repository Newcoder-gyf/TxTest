package Day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ComponentElementsDemo02 {

    public static void main(String[] args) {

        ArrayList<String> newArrayList01 = new ArrayList<String>();

        for(int i = 0; i < 5; i ++){
            newArrayList01.add("test0" + i);
        }
        System.out.println(newArrayList01);

        //迭代器也带泛型
        Iterator<String> iteratorArrayList01 = newArrayList01.iterator();
        while (iteratorArrayList01.hasNext()){

            //因为泛型是String，这里可以直接使用String来接收数据
            String elementArrayList01 = iteratorArrayList01.next();
            System.out.println(elementArrayList01);
        }
    }
}
