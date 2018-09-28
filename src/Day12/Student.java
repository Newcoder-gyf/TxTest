package Day12;

import java.util.Date;

public class Student {
    private Integer id;
    private String name;
    private Integer gender;
    private Date birthday;

    public Student() {
    }

    public Student(Integer id, String name, Integer gender, Date birthday) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }


    //重写equals 方法
    @Override
    public boolean equals(Object obj) {
        //首先判断obj 是否是student的实例
        if(!(obj instanceof Student)){
            return false;
        }

        //把传递过俩的对象转换成子类
        Student student = (Student) obj;

        //判断两个student是否相同（id， name， gender 相同）
        if(
                this.id.equals(student.id)
                        &&
                        this.name !=null && student.name !=null
                        &&
                        this.name.equals(student.name)
                        &&
                        this.gender.equals(student.gender)
        ){
            return true;
        }
        else {
            return false;
        }

    }

    //重写hashCode 方法
    @Override
    public int hashCode() {
        return 1;
    }
}
