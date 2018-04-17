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
        //print 输出st01 默认调用object类下的toString方法
        System.out.println(st01);
        System.out.println(st02);

        //判断对象是否相等不能使用"=="， 因为"==" 是判断两个对象的地址，而两个对象的地址肯定不相等
        System.out.println(st01 == st02);

        //判断两个对象是否相等，应该使用"equals"方法 
    }
}
