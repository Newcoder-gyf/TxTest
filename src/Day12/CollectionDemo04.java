package Day12;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//集合的遍历
public class CollectionDemo04 {

    public static void main(String[] args) {
        Collection newCollection01 = new ArrayList();
        for (int i = 0; i < 10; i++){
            newCollection01.add("gyf" + i);
        }

        //创建集合的迭代器
        //这个迭代器只能给iteratorCollection01 使用（谁创建的谁使用
        //迭代器是一次性的
        //ArrayList 的迭代器在运行过程中是不可以进行其他会影响迭代的操作如add，remove（这是一个并发操作）
        Iterator iteratorCollection01 = newCollection01.iterator();
        while (iteratorCollection01.hasNext()){
            //Object elementCollection01 = iteratorCollection01.next();
            String strCollection01 = (String)iteratorCollection01.next();
            System.out.println(strCollection01);
        }

        boolean isHasNext = iteratorCollection01.hasNext();
        System.out.println(isHasNext);
        iteratorCollection01.next();
    }
}

