package Day06;

//抽象类 abstract 不可与private， static， final 并存
//抽象类不能被实例化
abstract class Person09{
    String name;
    int age;
    //抽象方法 (抽象方法不可在类中实例化)
    public abstract void smoke();
}
class Student extends Person09 {
    String name;
    int age;

    public void study(){
        System.out.println("This student is studying");
    }
    public void smoke(){
         System.out.println(this.name + " is smoking in high level");
    }
}

class Worker extends Person09{
    String name;
    int age;

    public void worke(){
        System.out.println(this.name + " is working ");
    }
    //如果一个子类继承了抽象类，必须对抽象类中的所有抽象方法进行实例化
    public void smoke(){
        System.out.println(this.name + " is smoking in mid level ");
    }
}

class AbstractDemo1{
    public static void main(String[] args){
        //抽象类不可以被实例化
        //Person09 p1 = new Person09();
        Worker w1 = new Worker();
    }
}
