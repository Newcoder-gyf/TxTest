package Day06;

//super 可以区分子类和父类同名的属性和方法
class Teacher4 {
    String name = "Yang ";
    int age;
    public void sleep(){
        System.out.println("Teacher is sleeping");
    }
}

class JavaTeacher4 extends Teacher4{
    String name = "fei";
    public void teachJava(){
        System.out.println(this.name + " is teaching Java");
        System.out.println(super.name + " is teaching Java");
        this.sleep();
        super.sleep();
    }
    public void sleep(){
        System.out.println("javaTeacher is sleeping");
    }
}

class ExtendsDemo4{
    public static void main(String[] args){
        JavaTeacher4 jt = new JavaTeacher4();
        jt.teachJava();
    }
}