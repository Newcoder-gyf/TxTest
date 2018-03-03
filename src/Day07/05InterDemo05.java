package Day07;

abstract class Teacher05{
    String name;
    int age;
    abstract  void teacheLessons();
    public void sleep(){
        System.out.println(name + " is sleeping ");
    }
}

class JavaTeacher05 extends Teacher05{
    public void teacheLessons(){
        System.out.println(name + " is teaching Java");
    }
}

class PHPTeacher05 extends Teacher05{
    public void teacheLessons(){
        System.out.println(name+ " is teaching PHP");
    }
}

class leader05{
    //考察Java教课情况
    public void checkJavaTeacher(JavaTeacher05 jt){
        System.out.println(" Begin checking ");
        jt.teacheLessons();
        System.out.println(" checking finish");
    }
    //考察PHP教课情况
    public void checkPHPTeacher(PHPTeacher05 pt){
        System.out.println(" Begin checking ");
        pt.teacheLessons();
        System.out.println(" checking finish");
    }
}


class InterDemo05  {
    public static void main(String[] args){
        JavaTeacher05 jt = new JavaTeacher05();
        jt.name = "Yang";
        jt.teacheLessons();
        PHPTeacher05 pt = new PHPTeacher05();
        pt.name = "Fei";
        pt.teacheLessons();

        leader05 leader = new leader05();
        leader.checkJavaTeacher(jt);
        leader.checkPHPTeacher(pt);
    }
}
