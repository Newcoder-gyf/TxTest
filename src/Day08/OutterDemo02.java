package Day08;
//私有内部类学习
//外部类的权限修饰只能是public或者是默认
//内部类可以是默认，可以是public或者private
class Outter02 {
    private static int outterNum = 1;

    //定义内部类
    private class Inner02{
        int innerNum = 8;
        public void show(){
            System.out.println(innerNum);
        }
    }

    public void method(){
        //创建私有内部类的对象
        Inner02 inner = new Inner02();
        System.out.println(inner.innerNum);
    }
}

class OutterDemo02{
    public static void main(String[] args){
        //创建私有内部类的对象
        //出现错误，因为inner是私有的，有一只能在Outter内部创建
        //Outter02.Innter inner = new Outter02().new Inner();
        Outter02 outter = new Outter02();
        outter.method();
    }
}

