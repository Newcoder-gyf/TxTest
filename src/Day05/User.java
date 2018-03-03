package Day05;

class User {
    //对象属性
    String username;
    String password;
    //类属性
    static int userCount = 0;

    public void introduce(){
        System.out.println("Username is"+ this.username + " Password is " + this.password);
    }
}

class TestUser{
    public static void main(String args[]){
        User user1 = new User();
        User.userCount ++;
        User user2 = new User();
        User.userCount ++;
        System.out.println(" How many user " +User.userCount);
    }
}
