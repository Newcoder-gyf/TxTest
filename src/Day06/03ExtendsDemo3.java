package Day06;

class Teacher3 {
    String name;
    int age;

    public Teacher3(){
        System.out.println("Father's constructor is used");
    }
    public Teacher3(String name){
        this.name = name;
        System.out.println("Father's name constructor is used");
    }
    public void sleep(){
        System.out.println("Teacher is sleeping");
    }
}

class JavaTeacher3 extends Teacher3{
    public JavaTeacher3(String name){
        //在子类的构造器中隐藏了调用super
        //super();
        //调用父类的含参数构造器，super一定要放在第一行
        super(name);
        System.out.println("Child's name constructor is built");
    }
    public void teachJava(){
        System.out.println(this.name + " is teaching Java");
    }
}

class ExtendsDemo3{
    public static void main (String[] args){
        JavaTeacher3 jt = new JavaTeacher3("Yang");
        jt.teachJava();
    }
}