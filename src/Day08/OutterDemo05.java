package Day08;
//局部内部类的学习

class Outter05{
    private static int outterNum = 1;
    public void method(){
        //在方法中定义的类成为局部内部类
        class Inner {
             int innerNum = 2;
             public void show(){
                 System.out.println("Show Innerclass's number" + innerNum);
            }
        }

        //创建均不内部类的对象
        Inner inner = new Inner();
        inner.show();
    }
}

class OutterDemo05 {
    public static void main(String[] args){
        //创建Outter对象
        Outter05 outter = new Outter05();
        outter.method();
    }
}

