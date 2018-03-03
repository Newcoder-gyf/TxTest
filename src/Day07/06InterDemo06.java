package Day07;

abstract class Teacher06{
    String name;
    int age;
    abstract  void teacheLessons();
    public void sleep(){
        System.out.println(name + " is sleeping ");
    }
}

class JavaTeacher06 extends Teacher06{
    public void teacheLessons(){
        System.out.println(name + " is teaching Java");
    }
}

class PHPTeacher06 extends Teacher06{
    public void teacheLessons(){
        System.out.println(name+ " is teaching PHP");
    }
}

class leader06{
     public void checkTeacher06(Teacher06 t){
         System.out.println("Begin check");
         //老师开始讲课
         t.teacheLessons();
         System.out.println("checking finish");
     }
}

class InterDemo06 {
    public static void main(String[] args){
        //子类的实例可以用父类的类型来接收
        Teacher06 jt = new JavaTeacher06();
        jt.name = "Yang";
        Teacher06 pt = new PHPTeacher06();
        pt.name = "Fei";

        leader06 leader = new leader06();
        leader.checkTeacher06(jt);
        leader.checkTeacher06(pt);
    }
}
