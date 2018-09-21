package Day12;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

//判断集合中是否含有某些元素
//集合转数组
public class CollectionDemo03 {

    public static void main(String[] args) {

        Collection newCollection01 = new  ArrayList();
        for (int i = 0; i < 10; i++){
            newCollection01.add("hehe" + i);
        }
        //是否包含指定元素
        boolean ifContains = newCollection01.contains("hehe1");
        System.out.println(ifContains);

        //是否包含小集合
        Collection newCollection02 = new ArrayList();
        for (int i = 0; i < 3; i++){
            newCollection02.add("hehe" + i);
        }
        newCollection02.add("hehe10");

        boolean ifContainsAll = newCollection01.containsAll(newCollection02);
        System.out.println(ifContainsAll);

        //集合转数组
        Object[] object = newCollection01.toArray();
        System.out.println(object);

        for (int i = 0; i < object.length; i ++){
            System.out.println(object[i]);
        }
    }
}
