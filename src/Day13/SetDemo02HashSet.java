package Day13;

import Day12.Student;

import java.util.Date;
import java.util.HashSet;

/**
 * 判断两个对象是否相等，必须重写对象equals和hashCode 方法
 * 两个方法都符合相等的条件才被认为是相等的
 * 这里我们重写了Student 的euqals 和hashCode方法
 *
 * if (e.hash == hash && ((k = e.key) == key || (key != null && key.equals(k))))
 *
 *
 *
 * */
public class SetDemo02HashSet {

    public static void main(String[] args) {

        HashSet<Student> newHashSet01 = new HashSet<Student>();
        newHashSet01.add(new Student(1, "Gao", 0, new Date()));
        newHashSet01.add(new Student(2, "Yang", 1, new Date()));
        newHashSet01.add(new Student(3, "Fei", 1, new Date()));
        System.out.println(newHashSet01);

        newHashSet01.add(new Student(1, "Gao", 0, new Date()));
        System.out.println("重写Student类中的equals方法和hashCode方法之后：");
        System.out.println(newHashSet01);

        //如果想实现自定义泛型的不重复方法，需要在父类中重写equals 方法 和 hashCode 方法
    }
}
