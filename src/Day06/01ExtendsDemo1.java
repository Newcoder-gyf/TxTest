package Day06;

class JavaTeacher1{
    String name;
    int age;

    public void getTeacher(){
        System.out.println("Is teaching Java");
    }

    public void sleep(){
        System.out.println("Is sleeping ");
    }
}

class PHPTeacher1{
    String name;
    int age;

    public void getTeacher(){
        System.out.println("Is teaching PHP ");
    }

    public void sleep(){
        System.out.println("Is sleeping ");
    }
}

class ExtendsDemo{
    public static void main(String[] args){
        JavaTeacher1 jt = new JavaTeacher1();
        PHPTeacher1 pt = new PHPTeacher1();
    }
}
