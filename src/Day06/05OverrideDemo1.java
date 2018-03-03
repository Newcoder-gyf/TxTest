package Day06;

/*
*子类中的方法将父类中的同名方法覆盖了
* 子类和父类含有相同的方法（方法名，参数，返回值都一样， 方法体可以不同）
* 方法重写体现在了父子类中，而方法的重载（方法名相同，参数类型不同or参数个数不同）体现在了同一个类中
*/

class Teacher6{
    String name = "Yang";
    int age = 20;

    public void sleep(){
        System.out.println("Teacher is sleeping");
    }
}

class javaTeacher6 extends Teacher6{
    String name;
    public void sleep(){
        super.sleep();
        System.out.println("javaTeacher is sleeping");
    }
}

class OverrideDemo1{
    public static void main(String[] args){
        javaTeacher6 jt = new javaTeacher6();
        jt.sleep();
    }
}