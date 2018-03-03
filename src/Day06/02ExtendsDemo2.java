package Day06;
//子类只能获取父类的非private属性，私有方法无法被继承
//如果父类进行了封装，子类只能通过父类里面的公共方法才能够对里面的属性进行编辑
class Teacher{
    String name;
    int age;
    public void teaching(){
        System.out.println(this.name + " Is teaching " + " age is: " + this.age);
    }
    public void sleeping(){
        System.out.println(this.name +" Is sleeping");
    }
}

class JavaTeacher2 extends Teacher{
    public void teachJava(){
        System.out.println(this.name + " Is teaching Java" + " age is: " + this.age);
    }
}

class PHPTeacher2 extends Teacher{
    public void teachPHP(){
        System.out.println(this.name + " Is teaching PHP" + " age is: " + this.age);
    }
}

class ExtendsDemo2{
    public static void main(String[] args){
        JavaTeacher2 jt = new JavaTeacher2();
        jt.name = "Yang";
        jt.age = 20;
        jt.teachJava();
        jt.sleeping();

        PHPTeacher2 pt = new PHPTeacher2();
        pt.name = "Fei";
        pt.age = 18;
        pt.teachPHP();
        pt.sleeping();
    }
}