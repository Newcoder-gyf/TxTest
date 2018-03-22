package Day08;

class Outter {
    private static int outterNum = 1;

    //定义内部类
    class Inner{
        int innerNum = 2;
        public void show(){
             System.out.println(" Printed by Inner Class method " + innerNum);
        }
    }

    public void method(){
        System.out.println(" Printed by Outter Class method" + outterNum);
    }
}

class OutterDemo{
    public static void main(String[] args){
        //内部类不可以直接创建对象
        //Inner　inner = new inner();
        //外部类.内部类 变量名 = new 外部类对象.new 内部类对象
        Outter.Inner inner = new Outter().new Inner();
        inner.show();
        System.out.println(inner.innerNum);
    }
}

