package Day07;

//接口中的所有方法都是抽象的
//接口不可以被直接实例化
interface TeacherService02 {

    //可以在定义方法的过程中省略abstract（在接口类中
    //因为接口的需求是被继承，public也可以省略
    // final static private 不可以在接口的方法定义中存在
    void teachLessons();
    void smoking();

     //接口中的变量 默认修饰是final static
    //一般在接口中定义的属性都是常量（常量定义规范都是大写，多个字符用_分割）
    float PI = 3.14f;
    //public final static float PI = 3.14f;
}

//class 类名 implements 接口名， 接口名...{
//      实现接口中的每一个方法
// }


class JavaTeacher02 implements TeacherService02{

    public void teachLessons(){
        System.out.println(" Is teaching Java");
    }
    public void smoking(){
        System.out.println("Zhong hua");
    }
}

class InterDemo02{
    public static void main(String[] args){
        JavaTeacher02 jt1 = new JavaTeacher02 ();
        jt1.teachLessons();
        jt1.smoking();

        //使用子类的对象可以调用接口中的变量
        System.out.println(jt1.PI);
        //使用接口可以调用接口中的变量
        System.out.println(TeacherService02.PI);
    }
}
