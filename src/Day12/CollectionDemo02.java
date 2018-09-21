package Day12;

import java.util.ArrayList;
import java.util.Collection;

//删除集合中的元素
public class CollectionDemo02 {

    public static void main(String[] args) {
        Collection newCollection01 = new ArrayList();
        for (int i = 0; i < 10; i++){
            newCollection01.add("hehe" + i);
        }

        System.out.println("Before Clear: " + newCollection01);

//        //删除集合中的所有元素
//        newCollection01.clear();
//        System.out.println("After Clear: "+ newCollection01);

//        //删除指定元素object
//        newCollection01.remove("hehe4");
//        System.out.println("After remove 4" + newCollection01);

        Collection newCollection02 = new ArrayList();
        for (int i = 0; i < 3; i++){
            newCollection02.add("hehe" + i);
        }

        System.out.println("the collection2 is: " + newCollection02);

        newCollection01.removeAll(newCollection02);

        System.out.println("after remove col2 from col1: " + newCollection01);
    }
}
