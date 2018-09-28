package Day12;

import java.util.Date;

public class ElementGenerateTest {

    public static void main(String[] args) {

        ElementsGenerate<String> newElementsGenerate = new ElementsGenerate<String>();

        String[] newStrings = new String[10];
        for (int i = 0; i < newStrings.length; i ++){
            newStrings[i] = "test0" + i;
        }

        newElementsGenerate.setNewArray(newStrings);
        String element = newElementsGenerate.getByIndex(3);
        System.out.println(element);

        ElementsGenerate<Student> newStudentElementsGenerate = new ElementsGenerate<Student>();
        Student[] newStudents = new Student[10];
        for (int i = 0; i < newStudents.length; i++){
            newStudents[i] = new Student(i, "Yang"+i, i%2, new Date());
        }
        newStudentElementsGenerate.setNewArray(newStudents);
        System.out.println(newStudentElementsGenerate);
    }
}
