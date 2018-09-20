package Day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class CollectionDemo {

    public static void main(String[] args) {

        //创建一个集合
        Collection newCollection01 = new ArrayList();

        //System.out.println(newCollection01.size());

        for (int i = 0; i < 10; i ++){

            newCollection01.add("gyf." + i);
        }

        System.out.println(newCollection01);

        //创建另外一个集合
        Collection newCollection02 = new ArrayList();

        for (int i = 0; i < 10; i ++){

            newCollection02.add("yang." + i);
        }

        System.out.println(newCollection02);

        //将一个集合添加到另外一个集合中
        newCollection01.addAll(newCollection02);

        System.out.println("------------------------------------");
        System.out.println(newCollection01);
        System.out.println(newCollection02);

        System.out.println("------------------------------------");

        //集合中可以存储任何数据类型
        Collection newCollection03 = new ArrayList();
        newCollection03.add(1);
        newCollection03.add(new Student(1, "hehe", 0, new Date()));
        newCollection03.add(new Date());

        System.out.println(newCollection03);

        System.out.println("------------------------------------");
        //集合当中存储集合
        Collection newCollection04 = new ArrayList();
        for (int i = 0; i < 4; i++){
            Collection newCollection05 = new ArrayList();
            for (int j = 0; j < 5; j++){
                newCollection05.add(i + "---Element---" + j);
            }
            newCollection04.add(newCollection05);
        }

        System.out.println(newCollection04);

    }
}
