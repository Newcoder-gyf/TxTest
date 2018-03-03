package Day07;

abstract class Person01{
    String name;
    int age;

    public void sleep(){
        System.out.println(this.name + "is sleeping ");
    }

    public abstract void smoking();
}

abstract  class TeacherService01{
    public abstract void teachLessons();
    public abstract void smoking();
}

//接口是行为的抽象；
//一个抽象类中所有的方法都是抽象方法，我们称这个类为接口