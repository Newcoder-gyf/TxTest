package Day08;
//静态内部类学习

class Outter03 {
    private static int outterNum = 1;

    //定义内部类
    private class Inner03{
        int innerNum = 8;
        public void show(){
            System.out.println(innerNum);
        }
    }

    public void method(){
        //创建私有内部类的对象
        Inner03 inner = new Inner03();
        System.out.println(inner.innerNum);
    }
}

class OutterDemo03{
    public static void main(String[] args){
        
    }
}

