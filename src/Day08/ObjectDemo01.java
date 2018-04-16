package Day08;

class Student{
    private String name;
    private int age;
    private int gender;

    public Student(){
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

class ObjectDemo01{
    public static void main(String[] args){
        Student st = new Student();
    }
}