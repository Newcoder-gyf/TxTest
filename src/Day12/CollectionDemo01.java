package Day12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

//向集合添加元素
public class CollectionDemo01 {

    public static void main(String[] args) {

        //创建一个集合
        Collection newCollection01 = new ArrayList();

        //System.out.println(newCollection01.size());

        for (int i = 0; i < 10; i ++){

            newCollection01.add("gyf." + i);
        }

        //System.out.println(newCollection01);

        //创建另外一个集合
        Collection newCollection02 = new ArrayList();

        for (int i = 0; i < 10; i ++){

            newCollection02.add("yang." + i);
        }

        //System.out.println(newCollection02);

        //将一个集合添加到另外一个集合中
        newCollection01.addAll(newCollection02);

//        System.out.println("------------------------------------");
//        System.out.println(newCollection01);
//        System.out.println(newCollection02);
//
//        System.out.println("------------------------------------");

        //集合中可以存储任何数据类型
        Collection newCollection03 = new ArrayList();
        newCollection03.add(1);
        newCollection03.add(new Student(1, "hehe", 0, new Date()));
        newCollection03.add(new Date());

        //System.out.println(newCollection03);

        System.out.println("------------------------------------");

        /*
        * [[0---Element---0, 0---Element---1, 0---Element---2, 0---Element---3, 0---Element---4],
        * [1---Element---0, 1---Element---1, 1---Element---2, 1---Element---3, 1---Element---4],
        * [2---Element---0, 2---Element---1, 2---Element---2, 2---Element---3, 2---Element---4],
        * [3---Element---0, 3---Element---1, 3---Element---2, 3---Element---3, 3---Element---4]]
        * */

        //集合当中存储集合
        Collection newCollection04 = new ArrayList();
        for (int i = 0; i < 4; i++){
            Collection newCollection05 = new ArrayList();
            for (int j = 0; j < 5; j++){
                newCollection05.add(i + "---Element---" + j);
            }
            newCollection04.add(newCollection05);
        }

        System.out.println(newCollection04);

        //创建一个班级的对象
        StudentClass class01 = new StudentClass();
        class01.setClassId(1);
        class01.setStudentCount(3);

        Student student01 = new Student(1, "student01", 0, new Date());
        Student student02 = new Student(2, "student02", 1, new Date());
        Student student03 = new Student(3, "student03", 0, new Date());
        Collection classStudent = new ArrayList();
        classStudent.add(student01);
        classStudent.add(student02);
        classStudent.add(student03);

        class01.setCollectionStudent(classStudent);

        System.out.println("************************");
        System.out.println(class01);

        /*
        * StudentClass{
        * classId=1,
        * studentCount=3,
        * collectionStudent=[
        *       Student{id=1, name='student01', gender=0, birthday=Fri Sep 21 15:21:12 EDT 2018},
        *       Student{id=2, name='student02', gender=1, birthday=Fri Sep 21 15:21:12 EDT 2018},
        *       Student{id=3, name='student03', gender=0, birthday=Fri Sep 21 15:21:12 EDT 2018}
        *       ]
        * }
        *
        */
    }
}
