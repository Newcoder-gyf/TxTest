package Day13;

import Day12.Student;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;

//hashSet 不是线程安全的
public class SetDemo03HashSet {

    public static void main(String[] args) {

        HashSet<Student> newHashSet01 = new HashSet<Student>();
        newHashSet01.add(new Student(1, "Gao", 0, new Date()));
        newHashSet01.add(new Student(2, "Yang", 1, new Date()));
        newHashSet01.add(new Student(3, "Fei", 1, new Date()));
        System.out.println(newHashSet01);

        Iterator<Student> iterator = newHashSet01.iterator();
        while (iterator.hasNext()){
            Student student = iterator.next();
//            if("Gao".equals(student.getName())){
//                newHashSet01.add(new Student(4, "Xiong", 1, new Date()));
//            }
            System.out.println(student);
        }

        System.out.println("----------------------");
        for(Student element: newHashSet01){
            System.out.println(element);
        }
    }
}
