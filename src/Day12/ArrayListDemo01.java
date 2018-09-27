package Day12;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//ArrayList 是非线程安全的
public class ArrayListDemo01 {

    public static void main(String[] args) {
        //创建一个List集合
        List newList01 = new ArrayList();
        newList01.add("ggg");
        newList01.add("yyy");
        newList01.add("fff");
        System.out.println(newList01);

        //在指定索引处添加元素 索引从0 开始
        newList01.add(1, "ttt");
        System.out.println(newList01);

        List newList02 = new ArrayList();
        newList02.add("test01");
        newList02.add("test02");
        newList02.add("test03");

        //newList01.addAll(newList02);
        newList01.addAll(1, newList02);
        System.out.println(newList01);
        System.out.println(newList02);

        int sizeNewList01 = newList01.size();
        System.out.println("the size of newList01 is: " + sizeNewList01);

//        //根据指定索引来获得元素
//        Object objectNewList01 = newList01.get(3);
//        System.out.println(objectNewList01);
//
//        //遍历List
//        System.out.println("------------------------");
//        for(int i = 0; i < newList01.size(); i++){
//            objectNewList01 = newList01.get(i);
//            System.out.println(objectNewList01);
//        }
//
//        //从前向后遍历
//        System.out.println("------------------------");
//        ListIterator listIteratorNewList01 = newList01.listIterator();
//        while (listIteratorNewList01.hasNext()){
//            Object elementNewList01 = listIteratorNewList01.next();
//            System.out.println(elementNewList01);
//        }
//        System.out.println("------------------------");
//        System.out.println(listIteratorNewList01.hasNext());
//        System.out.println(listIteratorNewList01.hasPrevious());
//
//        //从后向前遍历
//        System.out.println("------------------------");
//        while (listIteratorNewList01.hasPrevious()){
//            Object elementNewList01 = listIteratorNewList01.previous();
//            System.out.println(elementNewList01);
//        }

        //ListIterator 的add 方法可以在遍历过程中使用（并发处理）
        //但是在当前的遍历过程中不会输出添加的元素
        System.out.println("------------------------");
        ListIterator listIteratorNewList01 = newList01.listIterator();
        while (listIteratorNewList01.hasNext()){
            Object elementNewList01 = listIteratorNewList01.next();
            if(elementNewList01.equals("test03")){
                listIteratorNewList01.add("test04"); //此处的add 是ListIterator 的add 方法（将元素添加至当前元素之后）
                System.out.println("test whether can get new element: " + newList01.get(4));
            }
            System.out.println(elementNewList01);
        }

        System.out.println(newList01);

        //每次循环都会动态的判断size
        for (int i = 0; i < newList01.size(); i ++){
            Object elementNewList01 = newList01.get(i);
            if (elementNewList01.equals("test04")){
                newList01.add("test05");//此处的add 是list 的add 方法（将元素添加至list末尾）
            }
            System.out.println(elementNewList01);
        }
        System.out.println(newList01);


        newList01.remove("test05");
//        newList02.remove("test05"); //如果remove一个不存在的元素，对list没有影响， 不会报错
//        System.out.println(newList02);
        System.out.println(newList01);

        newList01.remove(3);
//        newList02.remove(3); //如果remove 一个不存在的索引，会发生数组越界报错
//        System.out.println(newList02);
        System.out.println(newList01);

        //清空List
        newList01.clear();
        System.out.println(newList01);
    }
}
