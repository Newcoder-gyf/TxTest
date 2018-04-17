package Day08;
/*
* java.long.Object 是被每一个类默认继承的
*
* */
class Student01{
    private String name;
    private int age;
    private int gender;

    public Student01(){
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

    public String toString(){
        return this.name +" age is: "+ this.age +" gender is: "+ this.gender;
    }

}

class ObjectDemo01{
    public static void main(String[] args){
        Student st = new Student();
        st.setName("Yang");
        st.setAge(23);
        st.setGender(1);
        //使用学生对象继承父类Object下的toString 方法
        String str = st.toString();
        System.out.println("HexHashcode is " + str);
        int strhash = st.hashCode();
        //使用学生对象继承父类Object下的hashcode方法
        System.out.println("Student's hashcode is "+ strhash);
    }
}