package Day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class ComponentElementsDemo01 {

    public static void main(String[] args) {

        //集合中可以存储任意类型的数据，但实际情况中只存储一种类型,我们可以通过泛型来指定这种类型 注意"="左右泛型一致
        Collection<String> newCollection01 = new ArrayList<String>();
        for (int i = 0; i < 5 ; i ++){
            newCollection01.add("test0" + i);
        }
        System.out.println(newCollection01);

        //指定集合中只能添加学生类
        Collection<Student> newStudentCollection01 = new ArrayList<Student>();
        newStudentCollection01.add(new Student(1, "Yang", 0, new Date()));
        System.out.println(newStudentCollection01);

        Collection<Student> newStudentCollection02 = new ArrayList<Student>();
        newStudentCollection02.add(new Student(2, "Fei", 1, new Date()));
        System.out.println(newStudentCollection02);

        newStudentCollection01.addAll(newStudentCollection02);
        System.out.println(newStudentCollection01);

        //创建优等生的集合
        Collection<TopStudent> newTopStudentCollection01 = new ArrayList<TopStudent>();
        TopStudent topStudent01 = new TopStudent();
        topStudent01.setId(3);
        topStudent01.setName("Gao");
        topStudent01.setGender(0);
        topStudent01.setBirthday(new Date());
        topStudent01.setRank(1);
        System.out.println(topStudent01);

        newTopStudentCollection01.add(topStudent01);
        newStudentCollection01.addAll(newTopStudentCollection01);
        System.out.println(newStudentCollection01);

    }
}
