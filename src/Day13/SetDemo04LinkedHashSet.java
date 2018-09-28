package Day13;

import Day12.Student;

import java.util.Date;
import java.util.LinkedHashSet;

/**
 * LinkedHashSet 特点：
 * 有序性
 * 元素不能重复
 * 元素可以为null（只能有一个null）
 * 不是线程安全的
 *
 * */
public class SetDemo04LinkedHashSet {

    public static void main(String[] args) {

        LinkedHashSet<Student> newLinkedHashSet01 = new LinkedHashSet<Student>();
        newLinkedHashSet01.add(new Student(1, "Gao", 0, new Date()));
        newLinkedHashSet01.add(new Student(2, "Yang", 1, new Date()));
        newLinkedHashSet01.add(new Student(3, "Fei", 1, new Date()));
        System.out.println(newLinkedHashSet01);
    }
}
