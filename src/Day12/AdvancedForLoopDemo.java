package Day12;

import java.util.ArrayList;
import java.util.Date;

//增强的for循环
//此for循环不是线程安全的
public class AdvancedForLoopDemo {

    public static void main(String[] args) {

        ArrayList<String> newArrayList01 = new ArrayList<String>();
        for (int i = 0; i < 5; i++){
            newArrayList01.add("test0" + i);
        }

        for(String element: newArrayList01){
            System.out.println(element);
        }

        ArrayList<Student> newStudentArrayList01 = new ArrayList<Student>();
        for (int i = 0; i < 5; i ++){
            newStudentArrayList01.add(new Student(i, "Gao" + i, i%2, new Date()));
        }
        System.out.println(newStudentArrayList01);

        //非线程安全
        for(Student element: newStudentArrayList01){
//            if(element.getId().equals(1)){
//                newStudentArrayList01.add(new Student(5, "Gao", 1, new Date()));
//            } // 此处会报ConcurrentModificationException
            System.out.println(element);
        }
    }
}
