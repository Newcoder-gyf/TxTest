package Day13;

import Day12.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo01 {

    public static void main(String[] args) {
        StringListTest();
        System.out.println("----------------------");
        ObjectListTest();
        System.out.println("----------------------");
        EqualsTest();
    }

    //Collections 对普通List 的方法
    private static void StringListTest(){
        List<String> list = new ArrayList<String>();
        for(int i = 0; i < 5; i++){
            list.add("test" + i);
        }
        System.out.println(list);

        //集合的反转
        Collections.reverse(list);
        System.out.println(list);

        //随机打乱List(List洗牌)
        Collections.shuffle(list);
        System.out.println(list);

        //对List进行排序
        Collections.sort(list);
        System.out.println(list);
    }

    //Collections 对Object List 的方法
    private static void ObjectListTest(){

        List<ComparableStudent> list = new ArrayList<ComparableStudent>();
        list.add(new ComparableStudent(1, "Gao", 20));
        list.add(new ComparableStudent(1, "Yang", 10));
        list.add(new ComparableStudent(1, "Fei", 21));

        Collections.sort(list);
        System.out.println(list);

        //将List转化为线程安全的（同步的）List方法
        Collections.synchronizedList(list);
    }

    private static void EqualsTest(){
        ComparableStudent comparableStudent01 = new ComparableStudent(1, "test", 20);
        ComparableStudent comparableStudent02 = new ComparableStudent(1, "test", 20);

        System.out.println(comparableStudent01.equals(comparableStudent02));



    }

}
