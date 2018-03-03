package Day05;

class Teacher {

    String name;
    int age;
    String lesson;

    static int teacherCount;
    public void teach(){
        System.out.println(this.name +" is teaching");
    }

    public static void sleep(){
        System.out.println(teacherCount+" Teacher is sleeping ");
    }
}

class TestTeacher{
    public static void main(String args[]){
        Teacher teacher1 = new Teacher();
        Teacher.teacherCount ++;
        teacher1.name = "Yang";
        teacher1.teach();
        teacher1.sleep();
    }
}
