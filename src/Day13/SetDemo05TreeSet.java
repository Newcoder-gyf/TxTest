package Day13;

import java.util.TreeSet;

/**
 * TreeSet特点：
 * 对添加的元素进行自然排序（Comparable<元素类型>）
 * 对自定义的泛型需进行重写compareTo方法才会进行自然排序
 * */
public class SetDemo05TreeSet {

    public static void main(String[] args) {

        TreeSet<String> treeSet01 = new TreeSet<String>();
        treeSet01.add("abc");
        treeSet01.add("abd");
        treeSet01.add("abf");
        treeSet01.add("abf");//set不会存储重复的值
        treeSet01.add("abg");
        System.out.println(treeSet01);

        treeSet01.add("abe");//Tree 会进行String CompareTo 方法 进行自动排序
        System.out.println(treeSet01);

        System.out.println("-----------------");
        TreeSet<Integer> treeSet02 = new TreeSet<Integer>();
        treeSet02.add(13);
        treeSet02.add(12);
        treeSet02.add(35);
        treeSet02.add(30);
        treeSet02.add(27);
        System.out.println(treeSet02);

        treeSet02.add(19);
        System.out.println(treeSet02);

        System.out.println("-----------------");
        TreeSet<ComparableStudent> treeSet03 = new TreeSet<ComparableStudent>();
        treeSet03.add(new ComparableStudent(1, "Yang", 20));
        treeSet03.add(new ComparableStudent(3, "Yang", 20));
        treeSet03.add(new ComparableStudent(1, "Gao", 19));
        treeSet03.add(new ComparableStudent(2, "Yang", 20));
        treeSet03.add(new ComparableStudent(4, "Yang", 20));
        treeSet03.add(new ComparableStudent(1, "Yang", 19));
        System.out.println(treeSet03);

//        //poll出栈顶元素
//        System.out.println(treeSet03.pollFirst());
//        System.out.println(treeSet03);
//        //poll出栈底元素
//        System.out.println(treeSet03.pollLast());
//        System.out.println(treeSet03);

         //System.out.println("这是啥：" + treeSet02.headSet(2));







    }
}
