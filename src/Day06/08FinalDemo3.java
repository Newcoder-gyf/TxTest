package Day06;
//final 用于定义类上(被final修饰的类是不可以被继承的)
//final class User3 {
//    String username;
//    int passward;
//
//}
class User3 {
    String username;
    int passward;

}

class employee3 extends User3{
    int empNo;
}

class FinalDemo3{
    public static void main(String[] args){
        employee3 emp = new employee3();
    }
}