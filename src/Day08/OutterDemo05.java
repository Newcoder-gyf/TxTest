package Day08;
//局部内部类的学习

class Outter{
    private static int outterNum = 1;
    public void method(){
        //在方法中定义的类成为局部内部类
        class Inner {
             int innerNum = 2;
             public void show(){
                 System.out.println("Show Innerclass's number" + innerNum);
            }
        }

        Inner inner = new Inner();
    }
}

class OutterDemo05 {
    public static void main(String[] args){

    }
}

