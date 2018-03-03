package Day05;

//单例模式，永远只得到一个对象
class Singleton1 {
    //在单例类的内部创建一个自己本身的对象
    private static Singleton1 s = new Singleton1();
    private Singleton1(){}
    //获得单例对象
    public static Singleton1 getSingleton(){
        return s;
    }
}

class TestSingleton{
    public static void main(String[] args){
        Singleton1 s1 = Singleton1.getSingleton();
        System.out.println(s1);

        Singleton1 s2 = Singleton1.getSingleton();
        System.out.println(s1);

    }
}
