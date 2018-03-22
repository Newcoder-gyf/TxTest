package Day08;

//内部类学习
class Outter01 {
    private static int outterNum = 1;

    //定义内部类
    class Inner01{
        int innerNum = 2;
        public void show(){
             System.out.println("inner number Printed by Inner Class method " + innerNum);
             System.out.println("outter number Printed by Inner Class method " + outterNum);
        }
    }

    public void method(){
        System.out.println(" Printed by Outter Class method " + outterNum);
        //在内部类的直接上层外部类中可以创建内部类的对象
        Inner01 inner = new Inner01();
        System.out.println("innter number Printed by Outter class method " + inner.innerNum);
    }
}

class OutterDemo01{
    public static void main(String[] args){
        //内部类不可以直接创建对象
        //Inner　inner = new inner();
        //外部类.内部类 变量名 = new 外部类对象.new 内部类对象
        Outter01.Inner01 inner = new Outter01().new Inner01();
        inner.show();
        System.out.println(inner.innerNum);
        inner.show();
        System.out.println("--------------------- ");
        Outter01 outter = new Outter01();
        outter.method();
    }
}

