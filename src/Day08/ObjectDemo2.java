package Day08;

class Student02{
    private String name;
    private int age;
    private int gender;

    public Student02(){
        super();
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setGender(int gender){
        this.gender = gender;
    }
    public int getGender(){
        return gender;
    }
}

class ObjectDemo02{
    public static void main(String[] args){
        Student02 st01 = new Student02();
        Student02 st02 = new Student02();
        System.out.println(st01);
    }
}
