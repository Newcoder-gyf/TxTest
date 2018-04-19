package Day09;

class Person01 {
    private String name;
    private int age;
    private int gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Person01(String name, int age, int gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person01() {
    }

    public void display(){
        System.out.println(this.name + this.age + this.gender );
    }
}
