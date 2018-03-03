package Day06;

class user1 {
    String username;
    int password;

    //final放置于权限修饰符（public or private）之后，表示该方法不可被子类重写
    public final void login(String username, int password){
        if (username == "123" && password == 123){
            System.out.println("Login Successfully");
        }else{
            System.out.println("Login Error");
        }
    }
}

class employee1 extends user1{
    int empNo;
//    public void login(String username, int password){
//        System.out.println("Employee Login Successfully");
//    }

}

class FinalDemo1{
    public static void main(String[] args){
        employee1 emp1 = new employee1();
        emp1.login("1",1);
    }
}
