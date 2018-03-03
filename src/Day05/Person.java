package Day05;

class Person {

    String name;
    char gender;
    int age;

    /*
    * 构造器没有返回值也不用加void
    * 用于创建对象
    * */


//    //默认（空）构造器
//    public Person(){
//
//    }
//    //一个参数的构造器
//     */
//    public Person(String name){
//        this.name = name;
//    }
//    //两个参数的构造器
//    public Person(String name, int age){
//        System.out.println("Create a new person");
//        this.name = name;
//        this.age = age;
//    }
//    //三个三处的构造器
//    public Person(String name, int age, char gender){
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//    }


    //默认（空）构造器
    public Person(){

    }
    //一个参数的构造器
    public Person(String name){
        this.name = name;
    }
    //两个参数的构造器
    public Person(String name, int age){
        //调用一个参数的构造器
        this(name);
        this.age = age;
    }
    //三个三处的构造器
    public Person(String name, int age, char gender){
        //调用两个参数的构造器
        this(name, age);
        this.gender = gender;
    }

    public void introduce(){
        System.out.println("My name is "+this.name+ " age is "+this.age+" gender is "+ this.gender);
    }
}

class TestPerson{
    public static void main(String args[]){

        Person person1 = new Person("Yang",20);
        person1.gender = 'M';
        person1.introduce();
    }
}