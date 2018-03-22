package Day08;
//匿名类的学习
//通常通过接口来实现
interface Myinter01{
    public void method();
}

class myClass01 implements Myinter01{
    public void method(){
        System.out.println("Implementing Myinter");
    }
}

class OutterDemo04{
    public static void main(String[] args){
        //接口是不能实例化的，在匿名内部类创建的时候可以借助接口
        //创建匿名对象，调用method方法，这个对象很快就会被垃圾回收器GC回收
        new myClass01().method();

        //创建了一个没有名字但是实现了Myinter接口的类的对象
        new Myinter01(){
            //里面可以定义属性
            int i = 1;
            public void method(){
                System.out.println("Anonymous class01's method is used first time "+ i);
            }
        }.method();

        new Myinter01(){
            //里面可以定义属性
            int i = 2 ;
            public void method(){
                System.out.println("Anonymous class02's method is used first time "+ i);
            }
        }.method();

        System.out.println("------------------");
        //创建匿名类的对象，但是赋值给接口,这个对象因为有引用所以不会被回收
        Myinter01 mi = new Myinter01() {
            int i = 3;
            @Override
            public void method() {
                System.out.println("Anonymous class03's method is used first time "+ i);
            }
        };
        mi.method();
    }
}

