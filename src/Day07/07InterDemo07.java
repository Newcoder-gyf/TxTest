package Day07;

interface TeacherInter07 {
     public void teachLessons();
     public void sleep();
}

class JavaTeacher07 implements TeacherInter07{
    String name;
    int age;

    public JavaTeacher07(String name){
        this.name = name;
    }
    public void teachLessons(){
        System.out.println(this.name + " Is teaching Java");
    }
    public void sleep(){}
}

class PhpTeacher07 implements TeacherInter07{
    String name;
    int age;

    public PhpTeacher07(String name){
        this.name = name;
    }
    public void teachLessons(){
        System.out.println(this.name + " Is teaching PHP");
    }
    public void sleep(){}
}

class Leader07{
    public void checkTeacher07(TeacherInter07 t){
        System.out.println("Begin check");
        //老师开始讲课
        t.teachLessons();
        System.out.println("checking finish");
    }
}

/*由于首先用TeacherInter07 来进行实例化，父类里面并没有name等相关属性
**所以需要在子类中添加含有name 参数的构造器
*/

class InterDemo07{
    public static void main (String[] args){
        TeacherInter07 jt = new JavaTeacher07("Yang");
        TeacherInter07 pt = new PhpTeacher07("Fei");
        jt.teachLessons();
        pt.teachLessons();
        Leader07 leader = new Leader07();
        leader.checkTeacher07(jt);
        leader.checkTeacher07(pt);
    }
}