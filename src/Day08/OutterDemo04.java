package Day08;
//匿名类的学习

class Outter04 {
    private static int outterNum01 = 1;
    private int outterNum02;

    //定义静态 内部类,内部类可以是static
    //静态内部类只能访问直接外部类的静态属性（变量  ）
    static class Inner04{
        int innerNum = 3;

        public void show01(){
            System.out.println("method show is used");
        }

        public static void show02(){
            System.out.println("static method show is used ");
        }
    }

    public void method(){
         Inner04 inner = new Inner03();
         inner.show01();
    }

}

class OutterDemo04{
    public static void main(String[] args){
        //创建内部类对象
        //Outter03.Inner03  inner = new Outter03().new Inner03();
        //Error:(25, 34) java: qualified new of static class
        Outter03.Inner03 inner = new Outter03.Inner03();
        inner.show01();
        inner.show02();
        Outter03.Inner03.show02();
        System.out.println("------------");

        Outter03 outter = new Outter03();
        outter.method();

    }
}

