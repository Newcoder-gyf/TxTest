package Day13;

import Day12.Student;

import java.util.Arrays;
import java.util.Date;

public class ArraysDemo01 {

    public static void main(String[] args) {

        int[] ints01 = {4,67,35,75,834,345,56,};
        ArrayToString(ints01);

        Student[] student = {
                new Student(1, "Gao", 1, new Date()),
                new Student(2, "Yang", 1, new Date()),
                new Student(3, "Fei", 1, new Date())
        };
        StudentToString(student);

        //ArraySort(ints01);
        ArrayPartSort(ints01);

        ComparableStudent[] comparableStudents = {
                new ComparableStudent(1, "Gao", 20),
                new ComparableStudent(3, "Gao", 20),
                new ComparableStudent(2, "Yang", 20),
                new ComparableStudent(2, "Yang", 10)
        };
        ComparableStudentToString(comparableStudents);
        ObjectSort(comparableStudents);

    }

    private static void ArrayToString (int[] array){
        String string = Arrays.toString(array);
        System.out.println("the int convert to String is: " + string);
    }

    private static void StudentToString (Student[] students){
        String string = Arrays.toString(students);
        System.out.println("the object convert to String is: " + string);
    }

    private static void ComparableStudentToString (ComparableStudent[] array){
        String string = Arrays.toString(array);
        System.out.println("the object convert to String is: " + string);
    }


    private static void ArraySort (int[] array){
        Arrays.sort(array);
        ArrayToString(array);
    }

    //局部排序 指明起始索引（包含）和结束索引（不包含）
    private static void ArrayPartSort (int[] array){
        Arrays.sort(array, 4, 7);
        ArrayToString(array);
    }

    private static void ObjectSort (ComparableStudent[] array){
        Arrays.sort(array);
        ComparableStudentToString(array);
    }

}
