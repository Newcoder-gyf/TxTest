package Day08;
//匿名内部类的学习
interface Myinter06{
    void show();
}
class Outter06 {
     private static int outterNum = 6;
     public void method(){

         //创建实现了Myinter接口的匿名内部类
         new Myinter06(){
             int i = 9;
             public void show(){
                 System.out.println("This is Anonymous inner classes " + i);
             }
         }.show();
     }
}

class OutterDemo06 {
    public static void main(String[] args){
        Outter06 outter = new Outter06();
        outter.method();
    }
}

