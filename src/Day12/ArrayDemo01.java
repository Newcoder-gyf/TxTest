package Day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArrayDemo01 {

    public static void main(String[] args) throws ParseException {

        String str = "1999-10-10";
        SimpleDateFormat newDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date date =  newDateFormat.parse(str);

        //定义一个学生数组
        //数组作为集合是有局限性的，数组长度是固定的
        Student[] studentsCollection = new Student[10];

        for (int i = 0; i < 10; i ++ ){
            Student s = new Student(i, "gyf"+i,  i%2,  new Date());
            //System.out.println(s);
            studentsCollection[i] = s;
        }
        for (int i = 0; i < studentsCollection.length; i ++){
            System.out.println(studentsCollection[i]);
        }

        System.out.println("-------------------------");

        Object[] objs = new Object[10];
        //objs[0] = 1;
        objs[1] = 2;
        objs[2] = "hehe";
        objs[3] = 'a';
        for (int i = 0; i < objs.length; i ++){
            System.out.println(objs[i]);
        }

    }

}
