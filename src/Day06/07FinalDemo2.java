package Day06;
//final用于定义类当中的属性上
class User2 {
    String username;
    int passward;

     //final 修饰在属性上，属性的值不能被改变（常常用来定义常量 ）
    public static final float PI = 3.14f;
}

class FinalDemo2{
    public static void main(String[] args){
        //User2 .PI = 6.28f;
    }
}
